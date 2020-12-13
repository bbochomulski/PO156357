package pl.edu.uwm.obiektowe.s156357.kolo2;

import java.util.ArrayList;

public class Zbior {
    private ArrayList<Liczba> liczby;

    public Zbior(){
        this.liczby = new ArrayList<>();
    }
    public void dodajLiczbe(Liczba l){
        boolean check = false;
        for(Liczba x : liczby)
            if(x.compareTo(l)==0)
                check = true;
        if(!check)
            liczby.add(l);
    }

    @Override
    public String toString() {
        return liczby.toString();
    }
}
