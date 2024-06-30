package com.zib.commonjob.Repository;

import com.zib.commonjob.Model.Experience;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienceRepository extends ReactiveMongoRepository<Experience,Long> {
}
