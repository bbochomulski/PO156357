package pl.edu.uwm.PO.lab01;

import java.util.Scanner;

public class Zadanie1_2 {

    private Zadanie1_2() {
        Scanner s = new Scanner(System.in);
        System.out.print("Podaj liczbe n: ");
        int n = s.nextInt();

        float[] tab = new float[n];

        for(int i=1;i<=n;i++){
            System.out.printf("Liczba %d: ",i);
            tab[i-1] = s.nextFloat();
        }

        for(int i=1;i<n;i++){
            System.out.print(tab[i] + ", ");
        }
        System.out.println(tab[0]);
    }


}
