package com.project.AFK_JOURNEY.controllers;

import com.project.AFK_JOURNEY.models.*;
import com.project.AFK_JOURNEY.respositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Optional;

@Controller
@RequestMapping(path = "characters")
public class CharacterController{
    @Autowired
    private CharacterSummaryRespository characterSummaryRespository;
    @Autowired
    private CharacterSkillRespository characterSkillRespository;
    @Autowired
    private CharacterPassiveRespository characterPassiveRespository;
    @Autowired
    private CharacterWeaponRespository characterWeaponRespository;
    @Autowired
    private CharacterReviewRespository characterReviewRespository;
    //localhost:8080/characters
    @RequestMapping(value ="", method = RequestMethod.GET)
    public String getAllCharacters(ModelMap modelMap){
        Iterable<CharacterSummary> characterSummaries = characterSummaryRespository.findAll();
        modelMap.addAttribute("characterSummaries", characterSummaries);
        return "viewCharacterList";
    }
    //localhost:8080/characters/characterDetails/{characterID}
    @RequestMapping(value="/characterDetails/{characterID}", method = RequestMethod.GET)
    public String getCharacterDetails(ModelMap modelMap, @PathVariable Integer characterID){
        Iterable<CharacterSummary> characterSummaries = characterSummaryRespository.findByCid(characterID);
        modelMap.addAttribute("characterSummary", characterSummaries);
        Iterable<CharacterSkill> characterSkills = characterSkillRespository.findByCid(characterID);
        modelMap.addAttribute("characterSkills", characterSkills);
        Iterable<CharacterPassive> characterPassives = characterPassiveRespository.findByCid(characterID);
        modelMap.addAttribute("characterPassives", characterPassives);
        Iterable<CharacterWeapon> characterWeapons = characterWeaponRespository.findByCid(characterID);
        modelMap.addAttribute("characterWeapon", characterWeapons);
        Iterable<CharacterReview> characterReviews = characterReviewRespository.findByCid(characterID);
        modelMap.addAttribute("characterReview", characterReviews);
        System.out.print("Web load");
        return "viewCharacterDetails";
    }
    //localhost:8080/characters/selectCharacterByFaction/{characterFaction}
    @RequestMapping(value="/selectCharacterByFaction/{characterFaction}", method = RequestMethod.GET)
    public String getCharacterByFaction(ModelMap modelMap, @PathVariable String characterFaction){
        Iterable<CharacterSummary> characterSummaries = characterSummaryRespository.findByFaction(characterFaction);
        modelMap.addAttribute("characterByFaction", characterSummaries);
        modelMap.addAttribute("faction", characterFaction);
        return "viewCharacterByFaction";
    }

    //localhost:8080/characters/selectCharacterByClass/{characterClass}
    @RequestMapping(value="/selectCharacterByClass/{characterClass}", method = RequestMethod.GET)
    public String getCharacterByClass(ModelMap modelMap, @PathVariable String characterClass){
        Iterable<CharacterSummary> characterSummaries = characterSummaryRespository.findByCharClass(characterClass);
        modelMap.addAttribute("characterByClass", characterSummaries);
        modelMap.addAttribute("charClass", characterClass);
        return "viewCharacterByClass";
    }

}