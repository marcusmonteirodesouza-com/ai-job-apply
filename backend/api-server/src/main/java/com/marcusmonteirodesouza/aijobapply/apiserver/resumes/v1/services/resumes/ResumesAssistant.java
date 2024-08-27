package com.marcusmonteirodesouza.aijobapply.apiserver.resumes.v1.services.resumes;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface ResumesAssistant {
    @SystemMessage(
            "I want you to act as a resume writer. I will provide you my personal information, list"
                + " of skills, experience, education and certifications. I will also provide you"
                + " with the job title I'm applying for, the company name, the job description and"
                + " the company's values. I will provide everything as an html string. I want you"
                + " to return me a resume tailored for the job I'm applying for. Make sure to"
                + " highlight relevant skills I possess to the specific job description and"
                + " company. Quantify my data as much a possible.")
    String chat(String userMessage);
}
