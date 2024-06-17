package com.project.AFK_JOURNEY.respositories;

import com.project.AFK_JOURNEY.models.CharacterSkill;
import org.springframework.data.repository.CrudRepository;

public interface CharacterSkillRespository extends CrudRepository<CharacterSkill, String> {
    Iterable<CharacterSkill> findByCid(Integer cid);
}
