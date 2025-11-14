package org.example.legatai.service;

import org.example.legatai.model.Legat;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LegatService {

    private List<Legat> legatListe = new ArrayList<>();


    public LegatService() {
        // 30 fiktive legater
        legatListe.add(new Legat("Fynske Bank Fonden", "For studerende født på Fyn.", 10000));
        legatListe.add(new Legat("Tømrerlaugets Legat", "Til lærlinge inden for håndværk.", 5000));
        legatListe.add(new Legat("IT-Branchens Legat", "Til software-studerende.", 15000));
        legatListe.add(new Legat("Fru Jensens Mindelegat", "Til enlige mødre under uddannelse i Kbh.", 8000));
        legatListe.add(new Legat("Nordjyske Idrætsfond", "Til studerende fra Nordjylland, der dyrker elitesport ved siden af studiet.", 12000));
        legatListe.add(new Legat("Ingeniørforeningens Rejselegat", "Til ingeniørstuderende, der skal på udvekslingsophold i udlandet.", 25000));
        legatListe.add(new Legat("Handicapfonden for Uddannelse", "Støtte til studerende med fysisk eller psykisk handicap til hjælpemidler.", 20000));
        legatListe.add(new Legat("Grøn Fremtid Legatet", "Til studerende på miljø- og klimauddannelser med fokus på bæredygtighed.", 10000));
        legatListe.add(new Legat("Musikerenkes Mindelegat", "Til talentfulde studerende på musikkonservatoriet (klassisk musik).", 15000));
        legatListe.add(new Legat("Sønderjysk Landboforenings Fond", "Til studerende inden for landbrugsvidenskab, født syd for Kongeåen.", 8000));
        legatListe.add(new Legat("Akademiker Børnepuljen", "Til enlige forsørgere, der læser en lang videregående uddannelse på universitetet.", 10000));
        legatListe.add(new Legat("Design & Kreativitet Puljen", "Til studerende på kreative uddannelser (design, arkitekt, kunst) til materialer.", 5000));
        legatListe.add(new Legat("Fremtidens Sygeplejersker", "Til sygeplejestuderende på deres sidste år af uddannelsen.", 7000));
        legatListe.add(new Legat("Iværksætterdrømmen", "Til studerende, der har startet egen virksomhed ved siden af studierne.", 30000));
        legatListe.add(new Legat("Lolland-Falster Invest", "Til unge fra Lolland-Falster, der flytter til København eller Aarhus for at studere.", 15000));
        legatListe.add(new Legat("Det Juridiske Rejselegat", "Til jurastuderende, der ønsker praktikophold ved internationale domstole.", 20000));
        legatListe.add(new Legat("Håndværkerens Værktøjskasse", "Til lærlinge inden for VVS, el eller mekanikerfaget til indkøb af værktøj.", 4000));
        legatListe.add(new Legat("Humanitær Bistandsfond", "Til studerende på samfundsvidenskabelige uddannelser, der vil arbejde med NGO'er.", 10000));
        legatListe.add(new Legat("Mønsterbryder-Legatet", "Til studerende, der er den første i deres familie til at tage en videregående uddannelse.", 25000));
        legatListe.add(new Legat("Tech-Kvinder Fonden", "Til kvindelige studerende inden for STEM-fagene (Science, Tech, Engineering, Math).", 15000));
        legatListe.add(new Legat("Bornholmerfonden", "Til studerende med fast bopæl på Bornholm, uanset uddannelsesretning.", 8000));
        legatListe.add(new Legat("Pædagogisk Udviklingsfond", "Til pædagogstuderende med særlig interesse for udsatte børn og unge.", 6000));
        legatListe.add(new Legat("Senior-Uddannelseslegatet", "Til studerende over 30 år, der er vendt tilbage til uddannelsessystemet.", 10000));
        legatListe.add(new Legat("Det Maritime Stipendium", "Til studerende på maritime uddannelser (skibsfører, maskinmester).", 12000));
        legatListe.add(new Legat("Journalistikkens Fremtid", "Til journaliststuderende til støtte for undersøgende projekter.", 10000));
        legatListe.add(new Legat("Esbjerg Erhvervsfond", "Til studerende på erhvervsakademiuddannelser i Esbjerg-området.", 5000));
        legatListe.add(new Legat("Medicinstuderendes Forskningslegat", "Til medicinstuderende, der tager et forskningsår (prægraduat).", 40000));
        legatListe.add(new Legat("Sprogrejse-Puljen", "Til sprogstuderende på universitetet til ophold i det land, hvis sprog de studerer.", 8000));
        legatListe.add(new Legat("Værdigt Trængende Studerende (Aarhus)", "Generelt legat til studerende i Aarhus med dokumenteret lav rådighedsbeløb.", 3000));
        legatListe.add(new Legat("Tandlægeforeningens Studiehjælp", "Til tandlægestuderende på 3. år eller derover til dyrt udstyr.", 12000));
    }

    // Metode til at hente hele listen
    public List<Legat> getAllLegater() {
        return legatListe;
    }


    // Laver listen om til én lang tekst-string til AI'en
    public String getLegaterAsString() {
        StringBuilder sb = new StringBuilder();
        for (Legat l : legatListe) {
            sb.append("- NAVN: ").append(l.getNavn())
                    .append(", KRAV: ").append(l.getBeskrivelse())
                    .append(", BELØB: ").append(l.getBeløb()).append(" kr.\n");
        }
        return sb.toString();
    }

}
