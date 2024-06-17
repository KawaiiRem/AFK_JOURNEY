package com.project.AFK_JOURNEY.respositories;

import com.project.AFK_JOURNEY.models.CharacterWeapon;
import org.springframework.data.repository.CrudRepository;

public interface CharacterWeaponRespository extends CrudRepository<CharacterWeapon, Integer> {
    Iterable<CharacterWeapon> findByCid(Integer cid);
}
