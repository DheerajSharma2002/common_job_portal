package com.zib.commonjob.Service;

import com.zib.commonjob.Model.UserProfile;
import com.zib.commonjob.Repository.UserProfileRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@Slf4j
public class UserProfileService {
    private final UserProfileRepository userProfileRepository;

    public UserProfileService(UserProfileRepository userProfileRepository) {
        this.userProfileRepository = userProfileRepository;
    }

    public Flux<UserProfile> getAllUser() {
        return userProfileRepository.findAll();
    }

    public Mono<UserProfile> getUserById(Long id) {
        return userProfileRepository.findById(id);
    }

    public Mono<UserProfile> createUser(UserProfile userProfile) {
        return userProfileRepository.save(userProfile);
    }

    public Mono<UserProfile> updateUser(Long id, UserProfile userProfile) {
        return userProfileRepository.findById(id)
                .flatMap(existUser -> {
                    existUser.setEducation(userProfile.getEducation());
                    existUser.setEmail(userProfile.getEmail());
                    existUser.setLanguages(userProfile.getLanguages());
                    existUser.setExperiences(userProfile.getExperiences());
                    existUser.setProjects(userProfile.getProjects());
                    existUser.setFullName(userProfile.getFullName());
                    existUser.setResumeUrl(userProfile.getResumeUrl());
                    existUser.setSummary(existUser.getSummary());
                    existUser.setPhotoUrl(existUser.getPhotoUrl());
                    return userProfileRepository.save(existUser);
                });
    }

    public Mono<Void> deleteUserProfile(Long id) {
        return userProfileRepository.deleteById(id);
    }
}
