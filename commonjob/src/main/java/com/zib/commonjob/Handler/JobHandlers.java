package com.zib.commonjob.Handler;

import com.zib.commonjob.Processor.JobProcessors;
import org.springframework.context.annotation.Configuration;


@Configuration
public class JobHandlers {
private final JobProcessors jobProcessors;

    public JobHandlers(JobProcessors jobProcessors) {
        this.jobProcessors = jobProcessors;
    }

//    public Mono<ServerResponse> fetchJobs(ServerRequest request){
//    return jobProcessors.fetchJobs().collectList().flatMap(resp -> );
//    }
}
