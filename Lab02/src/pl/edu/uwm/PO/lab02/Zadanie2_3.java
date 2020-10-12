package pl.edu.uwm.PO.lab02;

import java.util.Scanner;
import java.util.Random;

public class Zadanie2_3 {

    public Zadanie2_3() {

        System.out.print("Podaj liczbe m: ");
        int m = pobierzLiczbe();
        System.out.print("Podaj liczbe n: ");
        int n = pobierzLiczbe();
        System.out.print("Podaj liczbe k: ");
        int k = pobierzLiczbe();

        int[][] a = new int [m][n];
        generujMacierz(a, m, n);
        System.out.println("Macierz A");
        wypiszMacierz(a);
        int[][] b = new int[n][k];
        generujMacierz(b, n, k);
        System.out.println("Macierz B");
        wypiszMacierz(b);
        int[][] c = pomnozMacierze(a,b);
        System.out.println("Macierz C");
        wypiszMacierz(c);
    }

    public static int pobierzLiczbe(){
        Scanner s = new Scanner(System.in);
        int liczba;
        liczba = s.nextInt();
        while(liczba < 1 || liczba > 10)
        {
            System.out.print("Blad! Podaj liczbe z przedzialu 1-10: ");
            liczba = s.nextInt();
        }
        return liczba;
    }

    public static void generujMacierz(int[][] tab, int kolumny, int wiersze)
    {
        for(int i = 0; i < kolumny; i++)
        {
            for(int j = 0;j<wiersze;j++)
            {
                tab[i][j] = generujLiczbe(0,20);
            }
        }
    }
    public static void wypiszMacierz(int[][] tab)
    {
        if(tab == null) {System.out.println("Macierz pusta");}
        else {
            for (int[] i : tab) {
                for (int j : i) {
                    System.out.printf("%d ", j);
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static int[][] pomnozMacierze(int[][] tab1, int[][] tab2)
    {
        int t1wiersze = tab1.length;
        int t1kolumny = tab1[0].length;
        int t2wiersze = tab2.length;
        int t2kolumny = tab2[0].length;

        if(t1kolumny != t2wiersze)
        {
            System.out.println("Liczba kolumn pierwszej macierzy musi byc rowna liczbie wierszy drugiej macierzy!");
            return null;
        }
        int[][] wynik = new int[t1kolumny][t2wiersze];
        for(int i = 0; i < t1kolumny; i++) {
            for (int j = 0; j < t2wiersze; j++) {
                for (int k = 0; k < t1wiersze; k++) {
                    wynik[i][j] += tab1[i][k] * tab2[k][j];
                }
            }
        }
        return wynik;
    }

    public static int generujLiczbe(int minWartosc, int maxWartosc)
    {       Random r = new Random();
            return r.nextInt(maxWartosc - minWartosc) + minWartosc;
    }
}