package ru.digital.hack.parent.repo;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.digital.hack.parent.dao.ReviewsEntity;

import java.util.List;

@Repository
public interface ReviewsRepo extends CrudRepository<ReviewsEntity, Integer> {
    List<ReviewsEntity> findAll();
}
