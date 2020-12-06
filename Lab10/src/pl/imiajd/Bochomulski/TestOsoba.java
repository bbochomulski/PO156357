package pl.imiajd.Bochomulski;

import java.util.ArrayList;

public class TestOsoba {
    public static void main(String[] args) {

        ArrayList<Osoba> osoby = new ArrayList<Osoba>();
        osoby.add(new Osoba("Kowalski", "1998-01-13"));
        osoby.add(new Osoba("Nowak", "1980-01-03"));
        osoby.add(new Osoba("Kowalski", "1970-03-01"));
        osoby.add(new Osoba("Kaminski", "1980-01-03"));
        osoby.add(new Osoba("Kowalczyk", "1989-10-20"));
        System.out.println(osoby);
        osoby.sort(Osoba::compareTo);
        System.out.println(osoby);


    }
}
