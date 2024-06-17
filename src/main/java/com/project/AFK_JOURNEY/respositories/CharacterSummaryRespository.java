package com.project.AFK_JOURNEY.respositories;

import com.project.AFK_JOURNEY.models.CharacterSummary;
import org.springframework.data.repository.CrudRepository;

public interface CharacterSummaryRespository extends CrudRepository<CharacterSummary, Integer> {
    Iterable<CharacterSummary> findByCid(Integer cid);
    Iterable<CharacterSummary> findByFaction(String faction);
    Iterable<CharacterSummary> findByCharClass(String charClass);
}
