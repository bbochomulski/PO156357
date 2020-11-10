package pl.imiajd.Bochomulski;

import java.time.LocalDate;

class Pracownik extends Osoba {
    public Pracownik(String nazwisko, String imiona, String dataUrodzenia, char plec, double pobory, LocalDate dataZatrudnienia) {
        super(nazwisko, imiona, dataUrodzenia, plec);
        this.pobory = pobory;
        this.dataZatrudnienia = dataZatrudnienia;
    }

    public double getPobory() {
        return pobory;
    }

    public String getOpis() {
        return String.format("pracownik z pensją %.2f zł", pobory);
    }

    public LocalDate getDataZatrudnienia() {
        return dataZatrudnienia;
    }

    private double pobory;
    private final LocalDate dataZatrudnienia;
}
