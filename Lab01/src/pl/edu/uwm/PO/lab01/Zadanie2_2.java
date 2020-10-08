package pl.edu.uwm.PO.lab01;

import java.util.Scanner;

public class Zadanie2_2 {

    public Zadanie2_2(){
        Scanner s = new Scanner(System.in);
        System.out.print("Podaj liczbe n: ");
        int n = s.nextInt();

        float suma = 0;

        for(int i=1;i<=n;i++){
            System.out.printf("Liczba %d: ",i);
            float liczba = s.nextFloat();
            if(liczba>0) {suma += liczba;}
        }
        suma *= 2;
        System.out.printf("Wynik: %f", suma);

    }

}
