package pl.edu.uwm.PO.lab02;

import java.util.Random;
import java.util.Scanner;

public class Zadanie2_2 {

    public Zadanie2_2()
    {
        Scanner s = new Scanner(System.in);
        int[] tab = genNewTab();
        System.out.printf("Nieparzystych: %d\n", ileNieparzystych(tab));
        tab = genNewTab();
        System.out.printf("Parzystych: %d\n", ileParzystych(tab));
        tab = genNewTab();
        System.out.printf("Dodatnich: %d\n", ileDodatnich(tab));
        tab = genNewTab();
        System.out.printf("Ujemnych: %d\n", ileUjemnych(tab));
        tab = genNewTab();
        System.out.printf("Zerowych: %d\n", ileZerowych(tab));
        tab = genNewTab();
        System.out.printf("Maksymalnych: %d\n", ileMaksymalnych(tab));
        tab = genNewTab();
        System.out.printf("sumaDodatnich: %d\n", sumaDodatnich(tab));
        tab = genNewTab();
        System.out.printf("sumaUjemnych: %d\n", sumaUjemnych(tab));
        tab = genNewTab();
        System.out.printf("dlugoscMaksymalnegoCiaguDodatnich: %d\n", dlugoscMaksymalnegoCiaguDodatnich(tab));
        tab = genNewTab();
        signum(tab);
        tab = genNewTab();

        int lewy, prawy;
        int n = tab.length-1;
        System.out.print("Zmienna lewy: ");
        lewy = s.nextInt();
        System.out.print("Zmienna prawy: ");
        prawy = s.nextInt();
        while(lewy<1 || lewy > n)
        {
            System.out.printf("Blad! Podaj wartosc zmiennej lewy z przedzialu 1-%d: ", n);
            lewy = s.nextInt();
        }
        while(prawy<1 || prawy > n)
        {
            System.out.printf("Blad! Podaj wartosc zmiennej prawy z przedzialu 1-%d: ", n);
            prawy = s.nextInt();
        }
        if(prawy<lewy)
        {
            int temp;
            temp = prawy;
            prawy = lewy;
            lewy = temp;
        }

        odwrocFragment(tab,lewy,prawy);

    }

    public static int ileNieparzystych(int[] tab){
        int wynik = 0;
        for(int i : tab){if(i % 2 == 1 || i % 2 == -1){wynik+=1;}}
        return wynik;
    }
    public static int ileParzystych(int[] tab){
        int wynik = 0;
        for(int i : tab){if(i % 2 == 0){wynik+=1;}}
        return wynik;
    }
    public static int ileDodatnich(int[] tab){
        int wynik = 0;
        for(int i : tab){if(i > 0){wynik+=1;}}
        return wynik;
    }
    public static int ileUjemnych(int[] tab){
        int wynik = 0;
        for(int i : tab){if(i < 0){wynik+=1;}}
        return wynik;
    }
    public static int ileZerowych(int[] tab){
        int wynik = 0;
        for(int i : tab){if(i == 0){wynik+=1;}}
        return wynik;
    }
    public static int ileMaksymalnych(int[] tab){
        int wynik = 0;
        int max = 0;
        for(int i : tab)
        {
            if(i == max) {wynik += 1;}
            if(i > max)
            {
                max = i;
                wynik = 1;
            }
        }
        return wynik;
    }
    public static int sumaDodatnich(int[] tab){
        int wynik = 0;
        for(int i : tab) {if(i>0){wynik += i;}}
        return wynik;
    }
    public static int sumaUjemnych(int[] tab){
        int wynik = 0;
        for(int i : tab) {if(i<0){wynik += i;}}
        return wynik;
    }
    public static int dlugoscMaksymalnegoCiaguDodatnich(int[] tab){
        int wynik = 0;
        int temp = 0;
        for(int i : tab){
            if(i>0)
            {
                temp += 1;
            }
            if(i<0)
            {
                wynik = temp;
                temp = 0;
            }
        }
        return wynik;
    }
    public static void signum(int[] tab){
        for(int i = 0;i < tab.length;i++)
        {
            if (tab[i] > 0) {tab[i] = 1;}
            if (tab[i] < 0) {tab[i] = -1;}
        }
        wypisz(tab);
    }
    public static void odwrocFragment(int[] tab, int lewy, int prawy){
        int temp;
        for(int i = lewy; i < prawy; i++)
        {
            temp = tab[i];
            tab[i] = tab[prawy];
            tab[prawy--] = temp;
        }
        wypisz(tab);
    }


    public static int pobierzn(){
        Scanner s = new Scanner(System.in);
        int n;
        System.out.print("Podaj liczbe n: ");
        n = s.nextInt();
        while(n < 1 || n > 100)
        {
            System.out.print("Blad! Podaj liczbe z zakresu 1-100: ");
            n = s.nextInt();
        }
        return n;
    }
    public static int[] genNewTab(){
        int[] tab = new int[pobierzn()];
        generuj(tab,-999,999);
        wypisz(tab);
        return tab;
    }

    public static void generuj(int[] tab, int minWartosc, int maxWartosc)
    {
        Random r = new Random();
        for (int i = 0; i < tab.length; i++) {
            tab[i] = r.nextInt(maxWartosc - minWartosc) + minWartosc;
        }
    }

    public static void wypisz(int[] tab){
        for(int i : tab) {
            System.out.printf("%d ",i);
        }
        System.out.println();
    }


}
