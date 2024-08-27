package com.marcusmonteirodesouza.aijobapply.apiserver;

import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.vertexai.VertexAiGeminiChatModel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApiServerApplication {
    @Value("${google.project.id}")
    private String googleProjectId;

    @Value("${google.vertexai.gemini.chat-model.location}")
    private String googleVertexAIGeminiChatModelLocation;

    @Value("${google.vertexai.gemini.chat-model.name}")
    private String googleVertexAIGeminiChatModelName;

    public static void main(String[] args) {
        SpringApplication.run(ApiServerApplication.class, args);
    }

    @Bean
    public ChatLanguageModel chatLanguageModel() {
        return VertexAiGeminiChatModel.builder()
                .project(googleProjectId)
                .location(googleVertexAIGeminiChatModelLocation)
                .modelName(googleVertexAIGeminiChatModelName)
                .build();
    }
}
