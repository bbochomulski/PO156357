package pl.edu.uwm.PO.lab05;

import java.util.ArrayList;
import java.util.Collections;

public class Zadania {
    public static void main(String[] args) {

        int[] l1 = {1,4,9,16};
        int[] l2 = {9,7,4,9,11};
        ArrayList<Integer> lista1 = wprowadzDane(l1);
        ArrayList<Integer> lista2 = wprowadzDane(l2);

        System.out.print("Lista 1: " + lista1 + "\nLista 2: \" + lista2 + \"\\n\\n");


        ArrayList<Integer> wynik1 = append(lista1, lista2);
        ArrayList<Integer> wynik2 = merge(lista1, lista2);
        ArrayList<Integer> wynik3 = mergeSorted(lista1, lista2);
        ArrayList<Integer> wynik4 = reverced(lista1);
        reverce(lista2);

        System.out.println("Append lista1 + lista2: "+ wynik1);
        System.out.println("Merge lista1 + lista2: "+ wynik2);
        System.out.println("MergeSorted lista1 + lista2: "+ wynik3);
        System.out.println("Reverced lista1: "+ wynik4);
        System.out.println("Reverce lista2: "+ lista2);


        ////// TESTY //////
        int[] checkArr1 = {1,4,9,16,9,7,4,9,11};
        int[] checkArr2 = {1,9,4,7,9,4,16,9,11};
        int[] checkArr3 = {1,4,4,7,9,9,9,11,16};
        int[] checkArr4 = {16,9,4,1};
        int[] checkArr5 = {11,9,4,7,9};
        ArrayList<Integer> check1 = wprowadzDane(checkArr1);
        ArrayList<Integer> check2 = wprowadzDane(checkArr2);
        ArrayList<Integer> check3 = wprowadzDane(checkArr3);
        ArrayList<Integer> check4 = wprowadzDane(checkArr4);
        ArrayList<Integer> check5 = wprowadzDane(checkArr5);

        assert check1.equals(wynik1);
        assert check2.equals(wynik2);
        assert check3.equals(wynik3);
        assert check4.equals(wynik4);
        assert check5.equals(lista2);
        ///////////////////
    }

    public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b)
    {
        ArrayList<Integer> appended = new ArrayList<>();
        appended.addAll(a);
        appended.addAll(b);
        return appended;
    }

    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b)
    {
        ArrayList<Integer> merged = new ArrayList<>();
        for(int i = 0; i < (a.size()+b.size()); i++)
        {
            if(i<a.size()){merged.add(a.get(i));}
            if(i<b.size()){merged.add(b.get(i));}
        }
        return merged;
    }

    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b)
    {
        ArrayList<Integer> mergeSorted = merge(a,b);
        Collections.sort(mergeSorted);
        return mergeSorted;
    }

    public static ArrayList<Integer> reverced(ArrayList<Integer> a)
    {
        ArrayList<Integer> reverced = new ArrayList<>();
        for(int i = a.size()-1; i>=0;i--)
        {
            reverced.add(a.get(i));
        }
        return reverced;
    }

    public static void reverce(ArrayList<Integer> a)
    {
        ArrayList<Integer> temp = new ArrayList<>(a);
        a.clear();

        for(int i = temp.size()-1; i>=0;i--)
        {
            a.add(temp.get(i));
        }

    }

    public static ArrayList<Integer> wprowadzDane(int[] a){
        ArrayList<Integer> array = new ArrayList<>();
        for(int i : a)
        {
            array.add(i);
        }
        return array;
    }
}
