package org.example.legatai.service;

import org.example.legatai.dto.GeminiRequest;
import org.example.legatai.dto.GeminiResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class GeminiService {


    private final WebClient webClient;

    @Value("${gemini.url}")
    private String fullUrl;

    public GeminiService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.build();
    }

    public String askGemini(String prompt) {

        GeminiRequest requestBody = new GeminiRequest(prompt);

        GeminiResponse response = webClient.post()
                .uri(fullUrl)
                .header("Content-Type", "application/json")
                .bodyValue(requestBody)
                .retrieve()
                .bodyToMono(GeminiResponse.class)
                .block();

        if (response != null && response.getCandidates() != null && !response.getCandidates().isEmpty()) {
            return response.getCandidates().get(0).getContent().getParts().get(0).getText();
        }

        return "Fejl: Fik intet svar fra Gemini.";
    }
}

