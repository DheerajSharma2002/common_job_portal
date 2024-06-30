package com.zib.commonjob.Model;

import java.util.List;
import java.util.stream.Collectors;

public class JobConverter {

    public static Job fromexternalJob(ExternalJob externalJob) {
        Job job = new Job();
        job.setId(externalJob.getId());
        job.setDescription(externalJob.getDescription());
        job.setTitle(externalJob.getTitle());
        job.setCompany(externalJob.getTitle());
        job.setLocation(externalJob.getLocation());
        job.setUrl(externalJob.getUrl());
        job.setSource("external Api name");
        return job;
    }

    public static List<Job> fromExternalJobs(List<ExternalJob> externalJobs) {
        return externalJobs.stream()
                .map(JobConverter::fromexternalJob)
                .collect(Collectors.toList());
    }
}
