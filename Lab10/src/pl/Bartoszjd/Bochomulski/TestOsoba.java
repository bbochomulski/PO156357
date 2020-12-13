package pl.bartoszjd.bochomulski;

import java.util.ArrayList;
import java.util.Collections;

public class TestOsoba {
    public static void main(String[] args) {
        ArrayList<Osoba> osoby = new ArrayList<>(5);
        osoby.add(new Osoba("Kowalski", "1990-03-27"));
        osoby.add(new Osoba("Nowak", "1998-01-13"));
        osoby.add(new Osoba("Kowalski", "1975-03-27"));
        osoby.add(new Osoba("Dijkstra", "1985-09-27"));
        osoby.add(new Osoba("Bochomulski", "1998-01-13"));

        System.out.println("Przed sortowaniem:");
        for (Osoba o : osoby)
            System.out.println(o);
        Collections.sort(osoby);
        System.out.println("Po sortowaniu:");
        for (Osoba o : osoby)
            System.out.println(o);
    }
}
