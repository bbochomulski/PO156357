package pl.imiajd.Bochomulski;

import java.time.LocalDate;

abstract class Osoba {
    public Osoba(String nazwisko, String imiona, String dataUrodzenia, char plec) {
        this.nazwisko = nazwisko;
        this.imiona = imiona.split(" ");
        this.dataUrodzenia = LocalDate.parse(dataUrodzenia);
        this.plec = plec == 'M';
    }

    public abstract String getOpis();

    public String getNazwisko() {
        return nazwisko;
    }

    public String getImiona() {
        StringBuilder imiona = new StringBuilder();

        for (String imie : this.imiona) {
            imiona.append(imie).append(" ");
        }
        return imiona.toString();
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    public String getPlec() {
        if (this.plec)
            return "Mezczyzna";
        else
            return "Kobieta";
    }

    private String nazwisko;
    private String[] imiona;
    private LocalDate dataUrodzenia;
    private boolean plec;
}
