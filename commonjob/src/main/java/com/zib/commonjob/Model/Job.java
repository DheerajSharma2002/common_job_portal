package com.zib.commonjob.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "Jobs")
public class Job {

    @Id
    private String id;
    private String title;
    private String location;
    private String company;
    private String description;
    private String url;
    private String source;

}
