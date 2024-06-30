package com.zib.commonjob.Repository;

import com.zib.commonjob.Model.Education;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationRepository extends ReactiveMongoRepository<Education,Long> {
}
