package com.zib.commonjob.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "User")
public class User {
    @Id
    private String userId;
    private String userName;
    private String password;
    private String email;
    private String role;

}
