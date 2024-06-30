package com.zib.commonjob.Service;

import com.zib.commonjob.Model.Job;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@Service
public class JobService {
    private final WebClient webClient;

    public JobService(WebClient webClient) {
        this.webClient = webClient;
    }

    public Flux<Job> fetchJobs() {
        Flux<Job> jobsFromSiteA = fetchJobFromSiteA();
        Flux<Job> jobsFromSiteB = fetchJobFromSiteB();

        return Flux.merge(jobsFromSiteA, jobsFromSiteB)
                .distinct(Job::getId);
    }

    private Flux<Job> fetchJobFromSiteA() {
        return webClient.get()
                .uri("")
                .retrieve()
                .bodyToFlux(Job.class);
    }

    private Flux<Job> fetchJobFromSiteB() {
        return webClient.get()
                .uri("")
                .retrieve()
                .bodyToFlux(Job.class);
    }


}
