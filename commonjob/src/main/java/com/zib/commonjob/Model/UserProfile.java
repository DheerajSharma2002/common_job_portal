package com.zib.commonjob.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Language;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "user_profiles")
public class UserProfile {
@Id
private Long id;
private String fullName;
private String email;
private String resumeUrl;
private String photoUrl;
private List<Education> education;
private String summary;
private List<Experience> experiences;
private List<Language> languages;
private List<Project> projects;



}
