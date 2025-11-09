package org.example.legatai.model;

public class Legat {
    private String navn;
    private String beskrivelse;
    private int beløb;

    public Legat(String navn, String beskrivelse, int beløb) {
        this.navn = navn;
        this.beskrivelse = beskrivelse;
        this.beløb = beløb;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public void setBeskrivelse(String beskrivelse) {
        this.beskrivelse = beskrivelse;
    }

    public int getBeløb() {
        return beløb;
    }

    public void setBeløb(int beløb) {
        this.beløb = beløb;
    }

    @Override
    public String toString() {
        return "Legat{" +
                "navn='" + navn + '\'' +
                ", beskrivelse='" + beskrivelse + '\'' +
                ", beløb=" + beløb +
                '}';
    }

}
