package com.zib.commonjob.Model;

import lombok.Data;

import java.util.List;

@Data
public class ExternalApiResponse {
    private List<ExternalJob> externalJobs;
    private int totalResults;
    private int pageNumber;
    private int pageSize;
}
