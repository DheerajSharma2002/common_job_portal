package com.zib.commonjob.Processor;

import com.zib.commonjob.Model.Job;
import com.zib.commonjob.Service.JobService;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

@Configuration
public class JobProcessors {
private final JobService jobService;

    public JobProcessors(JobService jobService) {
        this.jobService = jobService;
    }

    public Flux<Job> fetchJobs(){
    return jobService.fetchJobs();
    }
}
