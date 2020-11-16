package pl.edu.uwm.obiektowe.s156357.kolo1;

import java.time.LocalDate;
import java.time.Period;

public class Osoba {
    private String imie;
    private String nazwisko;
    private LocalDate dataUrodzenia;
    private int wiek;

    public Osoba(String imie, String nazwisko, String dataUrodzenia)
    {
        if(!imie.equals("") && !nazwisko.equals("") && !dataUrodzenia.equals(""))
        {
            this.imie = imie;
            this.nazwisko = nazwisko;
            this.dataUrodzenia = LocalDate.parse(dataUrodzenia);
            this.wiek = ustalWiek();
        }
    }

    private int ustalWiek() {
        return this.dataUrodzenia.until(LocalDate.now()).getYears();
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getDataUrodzenia() {
        return dataUrodzenia.toString();
    }

    public void setDataUrodzenia(String dataUrodzenia) {
        LocalDate nowaData = LocalDate.parse(dataUrodzenia);
        if(Period.between(LocalDate.now(), nowaData).getDays() > 0)
            System.out.println("Nie możesz zmienić daty urodzenia na wartość z przyszłości!");
        else
        {
            this.dataUrodzenia = nowaData;
            this.wiek = ustalWiek();
        }

    }

    public int getWiek() {
        return ustalWiek();
    }

    @Override
    public String toString() {
        return "Osoba " + this.imie + " " + this.nazwisko +" urodzona " + getDataUrodzenia() + ", wiek " + this.wiek +". ";
    }
}
