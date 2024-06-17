package com.project.AFK_JOURNEY.respositories;

import com.project.AFK_JOURNEY.models.CharacterReview;
import org.springframework.data.repository.CrudRepository;

public interface CharacterReviewRespository extends CrudRepository<CharacterReview, Integer> {
    Iterable<CharacterReview> findByCid(Integer cid);
}
