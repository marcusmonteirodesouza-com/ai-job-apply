package com.marcusmonteirodesouza.aijobapply.apiserver.resumes.v1.controllers.resumes;

import com.marcusmonteirodesouza.aijobapply.apiserver.resumes.v1.services.resumes.ResumesService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/v1/resumes")
public class ResumesController {
    private final ResumesService resumesService;

    public ResumesController(ResumesService resumesService) {
        this.resumesService = resumesService;
    }

    @PostMapping("/generate")
    public String generateResume() {
        return "Hello, World!";
    }
}
