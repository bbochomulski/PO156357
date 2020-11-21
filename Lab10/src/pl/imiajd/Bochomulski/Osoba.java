package pl.imiajd.Bochomulski;

import java.time.LocalDate;
import java.util.Objects;

public class Osoba implements Cloneable, Comparable<Osoba>{

    private String nazwisko;
    private LocalDate dataUrodzenia;

    public Osoba(String nazwisko, String dataUrodzenia){
        this.nazwisko = nazwisko;
        this.dataUrodzenia = LocalDate.parse(dataUrodzenia);
    }
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "[" + this.nazwisko + " " + this.dataUrodzenia + "]";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Osoba osoba = (Osoba) o;
        return Objects.equals(nazwisko, osoba.nazwisko) &&
                Objects.equals(dataUrodzenia, osoba.dataUrodzenia);
    }
    @Override
    public int compareTo(Osoba o) {
        int result = this.nazwisko.compareTo(o.nazwisko);
        if (result == 0)
            return this.dataUrodzenia.compareTo(o.dataUrodzenia);
        return result;
    }

}
