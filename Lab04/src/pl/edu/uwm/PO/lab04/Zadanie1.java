package pl.edu.uwm.PO.lab04;

import java.util.Scanner;
import java.util.Arrays;

public class Zadanie1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Podaj ciag znakow: ");
        String ciag = s.next();
        System.out.print("Podaj znak: ");
        char znak = s.next().charAt(0);
        System.out.printf("Liczba wystapien znaku %s: %d\n", znak, countChar(ciag,znak));

        System.out.print("Podaj ciag znakow: ");
        ciag = s.next();
        System.out.print("Podaj drugi ciag znakow: ");
        String ciag2 = s.next();
        System.out.printf("Liczba wystapien ciagu znakow '%s': %d\n",ciag2, countSubStr(ciag,ciag2));

        System.out.print("Podaj ciag znakow: ");
        ciag = s.next();
        System.out.printf("Wynik uzycie funkcji middle: %s\n", middle(ciag));

        System.out.print("Podaj ciag znakow: ");
        ciag = s.next();
        System.out.printf("Wynik uzycie funkcji repeat: %s\n", repeat(ciag, 3));

        System.out.print("Podaj ciag znakow: ");
        ciag = s.next();
        System.out.print("Podaj drugi ciag znakow: ");
        ciag2 = s.next();
        System.out.printf("Indeksy wystapien ciagu znakow '%s': %s\n",ciag2, Arrays.toString(where(ciag,ciag2)));

        System.out.print("Podaj ciag znakow: ");
        ciag = s.next();
        System.out.printf("Wynik dzialania funkcji change: %s\n", change(ciag));

        System.out.print("Podaj ciag cyfr: ");
        ciag = s.next();
        System.out.printf("Wynik dzialania funkcji nice: %s\n", nice(ciag));
        System.out.printf("Wynik dzialania zmodyfikowanej funkcji nice: %s\n", nice(ciag, '"',5));


    }

    public static int[] tabappend(int[] tab, int n){
        int dlugosc = tab.length;
        if(dlugosc == 0)
        {
            return new int[]{n};
        }
        else {
            int[] nowa = new int[dlugosc + 1];
            System.arraycopy(tab, 0, nowa, 0, dlugosc);
            nowa[nowa.length - 1] = n;
            return nowa;
        }
    }

    public static int countChar(String str, char c){

        int suma = 0;
        for(int i = 0;i<str.length();i++) {
            if (str.charAt(i) == c) {
                suma++;
            }
        }
        return suma;
    }

    public static int countSubStr(String str, String subStr){

        char[] ciag1 = str.toCharArray();
        char[] ciag2 = subStr.toCharArray();
        int suma = 0;

        for(int i = 0;i<str.length();i++)
        {
            if(ciag1[i] == ciag2[0] && i+subStr.length()-1 < str.length())
            {
                boolean check = true;
                for(int j = 0;j<subStr.length();j++)
                {
                    if (ciag1[i + j] != ciag2[j]) {
                        check = false;
                        break;
                    }
                }
                if(check){
                    suma++;
                    i += subStr.length()-1;
                }
            }
        }

        return suma;
    }

    public static String middle(String str){

        int dlugosc = str.length();
        int srodek = dlugosc/2;
        String wynik;
        if(dlugosc % 2 == 0)
        {
            wynik = "" + str.charAt(srodek-1) + str.charAt(srodek);
        }
        else
        {
            wynik = "" + str.charAt(srodek);
        }

        return wynik;
    }

    public static String repeat(String str, int n){

        String wynik = "";
        for(int i = 1;i <=n;i++)
        {
            wynik = wynik + str;
        }

        return wynik;
    }

    public static int[] where(String str, String subStr){

        char[] ciag1 = str.toCharArray();
        char[] ciag2 = subStr.toCharArray();
        int[] wynik = new int[0];

        for(int i = 0;i<str.length();i++)
        {
            if(ciag1[i] == ciag2[0] && i+subStr.length()-1 < str.length())
            {
                boolean check = true;
                for(int j = 0;j<subStr.length();j++)
                {
                    if (ciag1[i + j] != ciag2[j]) {
                        check = false;
                        break;
                    }
                }
                if(check){
                    wynik = tabappend(wynik, i);
                    i += subStr.length()-1;
                }
            }
        }
        return wynik;
    }
    public static String change(String str)
    {
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i<str.length();i++)
        {
            if(Character.isUpperCase(str.charAt(i)))
            {
                sb.append(Character.toLowerCase(str.charAt(i)));
            }
            else
            {
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
        }

        return sb.toString();
    }

    public static String nice(String str){

        StringBuffer sb = new StringBuffer("'");
        int licznik = 0;
        for(int i = str.length()-1;i>-1;i--)
        {
            sb.append(str.charAt(i));
            licznik++;
            if(licznik == 3) {
                sb.append("'");
                licznik = 0;
            }
        }
        if(licznik != 0){sb.append("'");}
        sb.reverse();

        return sb.toString();
    }
    public static String nice(String str,char sep, int n){

        StringBuffer sb = new StringBuffer("" + sep);
        int licznik = 0;
        for(int i = str.length()-1;i>-1;i--)
        {
            sb.append(str.charAt(i));
            licznik++;
            if(licznik == n) {
                sb.append(sep);
                licznik = 0;
            }
        }
        if(licznik != 0){sb.append(sep);}
        sb.reverse();

        return sb.toString();
    }
}
