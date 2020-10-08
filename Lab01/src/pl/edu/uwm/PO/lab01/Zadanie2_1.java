package pl.edu.uwm.PO.lab01;

import java.util.Scanner;

public class Zadanie2_1 {

    private int wczytaj() {
        Scanner s = new Scanner(System.in);
        System.out.print("Podaj liczbe n: ");
        return s.nextInt();
    }

    public void pdpktA() {
        System.out.println("\nLiczby nieparzyste");
        int n = wczytaj();
        Scanner s = new Scanner(System.in);
        int wynik = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Liczba " + i + ": ");
            if(s.nextInt() % 2 == 1) { wynik += 1;}
        }
        System.out.printf("Liczb nieparzystych: %d\n", wynik);
    }

    public void pdpktB() {
        System.out.println("\nPodzielnosc");
        int n = wczytaj();
        Scanner s = new Scanner(System.in);
        int wynik = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Liczba " + i + ": ");
            int liczba = s.nextInt();
            if(liczba % 3 == 0 && liczba %5 != 0) { wynik += 1;}
        }
        System.out.printf("Podzielne przez 3 i niepodzielne przez 5: %d\n", wynik);
    }

    public void pdpktC() {
        System.out.println("\nKwadraty liczby parzystej");
        int n = wczytaj();
        Scanner s = new Scanner(System.in);
        int wynik = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Liczba " + i + ": ");
            int liczba = s.nextInt();
            if(Math.sqrt(liczba) % 2 == 0) { wynik += 1;}
        }
        System.out.printf("Kwadratow liczby parzystej: %d\n", wynik);
    }

    public void pdpktF() {
        System.out.println("\nNieparzyste numery i parzyste liczby");
        int n = wczytaj();
        Scanner s = new Scanner(System.in);
        int wynik = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Liczba " + i + ": ");
            int liczba = s.nextInt();
            if(i % 2 == 1 && liczba % 2 == 0) { wynik += 1;}
        }
        System.out.printf("Wynik: %d\n", wynik);
    }

    public void pdpktG() {
        System.out.println("\nNieparzyste i nieujemne");
        int n = wczytaj();
        Scanner s = new Scanner(System.in);
        int wynik = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Liczba " + i + ": ");
            int liczba = s.nextInt();
            if(liczba % 2 == 1 && liczba >= 0) { wynik += 1;}
        }
        System.out.printf("Wynik: %d\n", wynik);
    }

}
