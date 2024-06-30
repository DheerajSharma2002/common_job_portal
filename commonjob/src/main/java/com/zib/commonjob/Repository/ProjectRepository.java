package com.zib.commonjob.Repository;

import com.zib.commonjob.Model.Project;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends ReactiveMongoRepository<Project,Long> {
}
