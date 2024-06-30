package com.zib.commonjob.Model;

import lombok.Data;

import java.util.List;

@Data
public class JobResponse {
    private List<Job> jobs;
    private int totalResults;
    private int pageNumber;
    private int pageSize;

}
