package com.marcusmonteirodesouza.aijobapply.apiserver.resumes.v1.models;

import java.util.List;

public class Experience {
    public String title;
    public String company;
    public String location;
    public String duration;
    public List<String> responsibilities;

    public Experience(
            String title,
            String company,
            String location,
            String duration,
            List<String> responsibilities) {
        this.title = title;
        this.company = company;
        this.location = location;
        this.duration = duration;
        this.responsibilities = responsibilities;
    }
}
