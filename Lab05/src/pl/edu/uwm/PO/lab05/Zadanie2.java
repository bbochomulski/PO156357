package pl.edu.uwm.PO.lab05;

import java.util.ArrayList;

public class Zadanie2 {
    public static void main(String[] args) {

        int[] l1 = {1,4,9,16};
        ArrayList<Integer> lista1 = new ArrayList<>();
        lista1 = wprowadzDane(lista1, l1);
        int[] l2 = {9,7,4,9,11};
        ArrayList<Integer> lista2 = new ArrayList<>();
        lista2 = wprowadzDane(lista2, l2);

        ArrayList<Integer> wynik = merge(lista1, lista2);

        int[] checkArr = {1,9,4,7,9,4,16,9,11};
        ArrayList<Integer> check = new ArrayList<>();
        check = wprowadzDane(check, checkArr);

        System.out.println(wynik);
        System.out.println(check);
        assert check.equals(wynik);
    }

    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b)
    {
        ArrayList<Integer> merged = new ArrayList<Integer>();
        if(a.toArray().length < b.toArray().length)
        {
            for(int i = 0; i < a.toArray().length; i++)
            {
                merged.add(a.get(i));
                merged.add(b.get(i));
            }
            for(int i = a.toArray().length; i < b.toArray().length; i++)
            {
                merged.add(b.get(i));
            }
        }
        else
        {
            for(int i = 0; i < b.toArray().length; i++)
            {
                merged.add(a.get(i));
                merged.add(b.get(i));
            }
            for(int i = b.toArray().length; i < a.toArray().length; i++)
            {
                merged.add(a.get(i));
            }
        }

        return merged;
    }

    public static ArrayList<Integer> wprowadzDane(ArrayList<Integer> a, int[] b){
        for(int i : b)
        {
            a.add(i);
        }
        return a;
    }
}
