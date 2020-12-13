package pl.bartoszjd.bochomulski;

import java.time.LocalDate;
import java.util.Objects;

public class Osoba implements Cloneable, Comparable<Osoba>{
    private String nazwisko;
    private LocalDate dataUrodzenia;

    public Osoba(String nazwisko, String dataUrodzenia) {
        this.nazwisko = nazwisko;
        this.dataUrodzenia = LocalDate.parse(dataUrodzenia);
    }

    @Override
    public String toString() {
        return Osoba.class.getSimpleName() + "[" + this.nazwisko + " " + this.dataUrodzenia + "]";
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
        int compare = this.nazwisko.compareTo(o.nazwisko);
        if (compare == 0){
            return this.dataUrodzenia.compareTo(o.dataUrodzenia);
        }
        return compare;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

}
