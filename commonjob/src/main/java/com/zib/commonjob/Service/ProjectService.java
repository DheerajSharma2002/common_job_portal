package com.zib.commonjob.Service;

import com.zib.commonjob.Model.Project;
import com.zib.commonjob.Repository.ProjectRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@Slf4j
public class ProjectService {
    private final ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public Flux<Project> getAllProject() {
        return projectRepository.findAll();
    }

    public Mono<Project> getProjectById(Long id) {
        return projectRepository.findById(id);
    }

    public Mono<Project> createProject(Project project) {
        return projectRepository.save(project);
    }

    public Mono<Project> updateProject(Long id, Project project) {
        return projectRepository.findById(id)
                .flatMap(existProj -> {
                    existProj.setName(project.getName());
                    existProj.setDescription(project.getDescription());
                    return projectRepository.save(existProj);
                });
    }

    public Mono<Void> deleteProject(Long id) {
        return projectRepository.deleteById(id);
    }
}
