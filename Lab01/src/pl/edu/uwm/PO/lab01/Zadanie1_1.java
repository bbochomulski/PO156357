package pl.edu.uwm.PO.lab01;

import java.util.Scanner;

class Zadanie1_1 {

    private int wczytaj() {
        Scanner s = new Scanner(System.in);
        System.out.print("Podaj liczbe n: ");
        return s.nextInt();
    }

    public void pdpktA() {
        System.out.println("\nDodawanie");
        int n = wczytaj();
        Scanner s = new Scanner(System.in);
        int wynik = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Liczba " + i + ": ");
            wynik += s.nextInt();
        }
        System.out.printf("Wynik: %d\n", wynik);
    }

    public void pdpktB() {
        System.out.println("\nMnozenie");
        int n = wczytaj();
        Scanner s = new Scanner(System.in);
        int wynik = 1;
        for(int i = 1;i<=n;i++) {
            System.out.print("Liczba "+ i +": ");
            wynik *= s.nextInt();
        }
        System.out.printf("Wynik: %d\n", wynik);
    }
    public void pdpktC() {
        System.out.println("\nSuma wartosci bezwzglednych");
        int n = wczytaj();
        Scanner s = new Scanner(System.in);
        int wynik = 0;
        for(int i = 1;i<=n;i++) {
            System.out.print("Liczba "+ i +": ");
            wynik += Math.abs(s.nextInt());
        }
        System.out.printf("Wynik: %d\n", wynik);
    }
    public void pdpktD() {
        System.out.println("\nSuma pierwiastkow");
        int n = wczytaj();
        Scanner s = new Scanner(System.in);
        float wynik = 0;
        for(int i = 1;i<=n;i++) {
            System.out.print("Liczba "+ i +": ");
            wynik += Math.sqrt(s.nextInt());
        }
        System.out.printf("Wynik: %.2f\n", wynik);
    }
    public void pdpktE() {
        System.out.println("\nIloczyn Bezwzglednych");
        int n = wczytaj();
        Scanner s = new Scanner(System.in);
        int wynik = 1;
        for(int i = 1;i<=n;i++) {
            System.out.print("Liczba "+ i +": ");
            wynik *= Math.abs(s.nextInt());
        }
        System.out.printf("Wynik: %d\n", wynik);
    }
    public void pdpktF() {
        System.out.println("\nSuma kwadratow");
        int n = wczytaj();
        Scanner s = new Scanner(System.in);
        int wynik = 0;
        for(int i = 1;i<=n;i++) {
            System.out.print("Liczba "+ i +": ");
            wynik += (Math.pow(s.nextInt(),2));
        }
        System.out.printf("Wynik: %d\n", wynik);
    }
    public void pdpktG() {
        System.out.println("\nDodawanie oraz Mnozenie");
        int n = wczytaj();
        Scanner s = new Scanner(System.in);

        int wynik = 0;
        int wynik2 = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print("Liczba " + i + ": ");
            wynik += s.nextInt();
        }
        for(int i = 1;i<=n;i++) {
            System.out.print("Liczba "+ i +": ");
            wynik2 *= s.nextInt();
        }
        System.out.printf("Wynik dodawania: %d\n\nWynik mnozenia: %d\n", wynik,wynik2);
    }
    public void pdpktH() {
        int n = wczytaj();
        Scanner s = new Scanner(System.in);
        int wynik = 0;
        for(int i = 1;i<=n;i++) {
            System.out.print("Liczba "+ i +": ");
            wynik += ((s.nextInt())*(Math.pow(-1,i+1)));
        }
        System.out.printf("Wynik: %d\n", wynik);
    }
    public void pdpktI() {
        int n = wczytaj();
        Scanner s = new Scanner(System.in);
        float wynik = 0;
        for(int i = 1;i<=n;i++) {
            System.out.print("Liczba "+ i +": ");
            wynik += (((s.nextInt())*(Math.pow(-1,i)))/silnia(i));
        }
        System.out.printf("Wynik: %f\n", wynik);
    }
    private int silnia(int i)
    {
        if (i == 0)
            return 1;
        else
            return i * silnia(i - 1);
    }
}
