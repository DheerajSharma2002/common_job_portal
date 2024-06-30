package com.zib.commonjob.Service;

import com.zib.commonjob.Model.Education;
import com.zib.commonjob.Model.Experience;
import com.zib.commonjob.Repository.ExperienceRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@Slf4j
public class ExperienceService {

private final ExperienceRepository experienceRepository;

    public ExperienceService(ExperienceRepository experienceRepository) {
        this.experienceRepository = experienceRepository;
    }

    public Flux<Experience> getAllEducation() {
        return experienceRepository.findAll();
    }

    public Mono<Experience> getEducationById(Long id) {
        return experienceRepository.findById(id);
    }

    public Mono<Experience> createEducation(Experience experience) {
        return experienceRepository.save(experience);
    }

    public Mono<Experience> updateEducation(Long id, Experience experience) {
        return experienceRepository.findById(id)
                .flatMap(existExp -> {
                    existExp.setCompany(experience.getCompany());
                    existExp.setTitle(experience.getTitle());
                    existExp.setYear(experience.getYear());
                    return experienceRepository.save(existExp);
                });
    }

    public Mono<Void> deleteEducation(Long id){
        return experienceRepository.deleteById(id);
    }
}
