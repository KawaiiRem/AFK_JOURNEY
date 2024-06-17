package com.project.AFK_JOURNEY.respositories;

import com.project.AFK_JOURNEY.models.CharacterPassive;
import org.springframework.data.repository.CrudRepository;

public interface CharacterPassiveRespository extends CrudRepository<CharacterPassive, Integer> {
    Iterable<CharacterPassive> findByCid(Integer cid);
}
