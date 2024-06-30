package com.zib.commonjob.Repository;

import com.zib.commonjob.Model.UserProfile;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserProfileRepository extends ReactiveMongoRepository<UserProfile,Long> {
}
