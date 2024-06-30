package com.zib.commonjob.Repository;

import com.zib.commonjob.Model.Job;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends ReactiveMongoRepository<Job,String> {
}
