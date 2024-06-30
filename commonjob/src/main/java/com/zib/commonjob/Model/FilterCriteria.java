package com.zib.commonjob.Model;

import lombok.Data;

@Data
public class FilterCriteria {
    private String keyword;
    private String location;
    private String company;
    private String jobsType;
}
