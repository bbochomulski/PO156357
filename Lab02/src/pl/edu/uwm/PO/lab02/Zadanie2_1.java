package pl.edu.uwm.PO.lab02;

import java.util.Scanner;
import java.util.Random;

public class Zadanie2_1 {

    public Zadanie2_1() {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int n;
        System.out.print("Podaj liczbe n: ");
        n = s.nextInt();
        while(n < 1 || n > 100)
        {
            System.out.print("Blad! Podaj liczbe z zakresu 1-100: ");
            n = s.nextInt();
        }

        int[] tab = new int[n];
        int parzyste = 0;
        int nieparzyste = 0;
        int ujemne = 0;
        int dodatnie = 0;
        int zerowe = 0;
        int max = 0;
        int max_ile = 0;
        int sumaujemnych = 0;
        int sumadodatnich = 0;
        int najdluzszydodatni = 0;
        int najdluzszytemp = 0;

        for(int i = 0; i < n; i++)
        {
            tab[i] = (r.nextInt(1998))-999;

            if(tab[i] % 2 == 0){parzyste += 1;}
            if(tab[i] % 2 == 1 || tab[i] % 2 == -1){nieparzyste += 1;}
            if(tab[i] > 0){
                dodatnie += 1;
                sumadodatnich += tab[i];
                najdluzszytemp += 1;
            }
            if(tab[i] == 0){zerowe += 1;}
            if(tab[i] < 0){
                ujemne += 1;
                sumaujemnych += tab[i];
                if(najdluzszytemp > najdluzszydodatni) {najdluzszydodatni = najdluzszytemp;}
                najdluzszytemp = 0;
            }
            if(tab[i] > max) {
                max = tab[i];
                max_ile = 1;
            }
            if(tab[i] == max) {max_ile += 1;}

            if(tab[i] > 0) {tab[i] = 1;}
            if(tab[i] < 0) {tab[i] = -1;}
            System.out.printf("%d ", tab[i]);
        }
        System.out.printf("\nParzystych: %d\nNieparzystych: %d\nDodatnich: %d\nUjemnych: %d\nZerowych: %d\nNajwiekszy element to %d i wystapil %d razy\nNajdluzszy dodatni fragment: %d\n", parzyste, nieparzyste, dodatnie, ujemne, zerowe, max, max_ile, najdluzszydodatni);

        int lewy, prawy;
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

        int temp;
        for(int i = lewy; i < prawy; i++)
        {
            temp = tab[i];
            tab[i] = tab[prawy];
            tab[prawy--] = temp;
        }

        for(int i : tab) {System.out.printf("%d ", i);}

    }
}
