package pl.edu.uwm.PO.lab06;

import java.util.Arrays;

public class IntegerSet {
    private final boolean[] tablica;


    public IntegerSet()
    {
        this.tablica = new boolean[100];
        Arrays.fill(this.tablica, false);
    }

    public static IntegerSet union(IntegerSet a, IntegerSet b){
        IntegerSet wynik = new IntegerSet();
        for(int i=0;i<100;i++){
            if(a.tablica[i] || b.tablica[i])
                wynik.tablica[i] = true;
        }
        return wynik;
    }

    public static IntegerSet intersection(IntegerSet a, IntegerSet b){
        IntegerSet wynik = new IntegerSet();
        for(int i=0;i<100;i++){
            if(a.tablica[i] && b.tablica[i])
                wynik.tablica[i] = true;
        }
        return wynik;
    }

    public void insertElement(int liczba){
        if( liczba<100 && liczba>=0 )
        {
            this.tablica[liczba-1] = true;
        }
        else System.out.println("Out of range 1-100");
    }

    public void deleteElement(int liczba){
        if( liczba<100 && liczba>=0 )
        {
            this.tablica[liczba-1] = false;
        }
        else System.out.println("Out of range 1-100");
    }

    public String toString(){
        String liczby = "";
        for(int i = 0;i < 100;i++){
            if(this.tablica[i]){
                liczby += (i+1) + " ";
            }
        }
        return liczby;
    }
    public boolean equals(IntegerSet b){
        if(this.toString().equals(b.toString()))
            return true;
        else
            return false;
    }
}
