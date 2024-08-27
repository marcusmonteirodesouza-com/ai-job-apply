package com.marcusmonteirodesouza.aijobapply.apiserver.resumes.v1.models;

import java.util.List;

public class Education {
    public String degree;
    public String institution;
    public String graduationYear;
    public List<String> coursework;

    public Education(
            String degree, String institution, String graduationYear, List<String> coursework) {
        this.degree = degree;
        this.institution = institution;
        this.graduationYear = graduationYear;
        this.coursework = coursework;
    }
}
