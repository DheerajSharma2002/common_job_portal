package com.zib.commonjob.Service;

import com.zib.commonjob.Model.Education;
import com.zib.commonjob.Repository.EducationRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@Slf4j
public class EducationalService {
    private final EducationRepository educationRepository;

    public EducationalService(EducationRepository educationRepository) {
        this.educationRepository = educationRepository;
    }

    public Flux<Education> getAllEducation() {
        return educationRepository.findAll();
    }

    public Mono<Education> getEducationById(Long id) {
        return educationRepository.findById(id);
    }

    public Mono<Education> createEducation(Education education) {
        return educationRepository.save(education);
    }

    public Mono<Education> updateEducation(Long id, Education education) {
        return educationRepository.findById(id)
                .flatMap(existEdu -> {
                    existEdu.setDegree(education.getDegree());
                    existEdu.setUniversity(education.getUniversity());
                    existEdu.setYear(education.getYear());
                    return educationRepository.save(existEdu);
                });
    }

    public Mono<Void> deleteEducation(Long id){
    return educationRepository.deleteById(id);
    }
}
