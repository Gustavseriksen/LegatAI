package org.example.legatai.controller;

import org.example.legatai.service.GeminiService;
import org.example.legatai.service.LegatService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LegatController {

    private final GeminiService geminiService;
    private final LegatService legatService;

    // Constructor injection (Spring forbinder automatisk vores services her)
    public LegatController(GeminiService geminiService, LegatService legatService) {
        this.geminiService = geminiService;
        this.legatService = legatService;
    }

    @PostMapping("/match-legater")
    public String matchLegater(@RequestBody String brugerProfil) {
        // 1. Hent vores liste af legater som tekst
        String legatData = legatService.getLegaterAsString();

        // 2. Byg den store prompt
        String prompt = """
                Du er en legat-rådgiver. Find de 3 bedste legater fra nedenstående liste, der passer til brugeren.
                
                LISTE AF MULIGE LEGATER:
                %s
                
                BRUGERENS PROFIL:
                %s
                
                Opgave: Returnér kun en liste med de 3 navne og en kort begrundelse for hver.
                """.formatted(legatData, brugerProfil);

        // 3. Spørg Gemini og returnér svaret direkte til brugeren
        return geminiService.askGemini(prompt);
    }

}
