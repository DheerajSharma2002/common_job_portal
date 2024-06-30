package com.zib.commonjob.Model;

import lombok.Data;

@Data
public class ExternalJob {
    private String id;
    private String title;
    private String company;
    private String location;
    private String description;
    private String url;
}
