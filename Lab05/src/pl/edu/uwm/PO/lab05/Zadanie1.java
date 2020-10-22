package pl.edu.uwm.PO.lab05;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Zadanie1 {
    public static void main(String[] args) {

        int[] l1 = {1,4,9,16};
        ArrayList<Integer> lista1 = new ArrayList<>();
        lista1 = wprowadzDane(lista1, l1);
        int[] l2 = {9,7,4,9,11};
        ArrayList<Integer> lista2 = new ArrayList<>();
        lista2 = wprowadzDane(lista2, l2);

        ArrayList<Integer> wynik = append(lista1, lista2);
        
        int[] checkArr = {1,4,9,16,9,7,4,9,11};
        ArrayList<Integer> check = new ArrayList<>();
        check = wprowadzDane(check, checkArr);
        
        assert check.equals(wynik);
    }

    public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b)
    {
        ArrayList<Integer> appended = a;
        appended.addAll(b);

        return appended;
    }
    
    public static ArrayList<Integer> wprowadzDane(ArrayList<Integer> a, int[] b){
        for(int i : b)
        {
            a.add(i);
        }
        return a;
    }
}
