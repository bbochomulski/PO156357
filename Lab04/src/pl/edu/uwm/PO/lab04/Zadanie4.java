package pl.edu.uwm.PO.lab04;

import java.math.BigInteger;
import java.util.Scanner;


public class Zadanie4 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Podaj liczbe n: ");
        int n = s.nextInt();
        System.out.println("Funkcja seed: ");
        System.out.println("Wynik: " + seed(n));

    }

    public static BigInteger seed(int n)
    {
        BigInteger wynik = new BigInteger("0");
        BigInteger temp = new BigInteger("0");
        for(int i = 0; i <= (n*n)-1; i++)
        {
            temp = BigInteger.valueOf((long) Math.pow(2,i));
            wynik = wynik.add(temp);
        }
        return wynik;
    }
}
