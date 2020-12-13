package pl.edu.uwm.po.lab13;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Zad1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        listaZadan lz = new listaZadan();
        String input = "";
        while (input != "exit")
        {
            System.out.print("Wpisz polecenie: ");
            input = s.nextLine();
            String[] inputArr = input.split(" ");
            switch (inputArr[0])
            {
                case "zakoncz":
                    input = "exit";
                    break;
                case "dodaj":
                    int p = Integer.parseInt(inputArr[1]);
                    String d = "";
                    for(int i = 2; i < inputArr.length;i++)
                    {
                        if(i != inputArr.length-1)
                            d += inputArr[i] + " ";
                        else
                            d += inputArr[i];
                    }
                    lz.dodajZadanie(p,d);
                    break;
                case "nastepne":
                    lz.nastepne();
                    break;
                case "wyswietl":
                    lz.wyswietl();
                    break;
                default:
                    System.out.println("Niepoprawne polecenie!");
                    System.out.println("Lista polecen: \ndodaj priorytet opis - dodaje zadanie do listy zadan\nnastepne - usuwa najbardziej pilne zadanie z listy\nzakoncz - konczy prace programu\n");
            }
        }

    }

    public static class listaZadan {
        PriorityQueue<zadanie> kolejka;


       public listaZadan()
       {
           this.kolejka = new PriorityQueue();
       }

       public void dodajZadanie(int priority, String description)
       {
           zadanie tmp = new zadanie(priority,description);
           this.kolejka.add(tmp);
       }

       public void nastepne()
       {
           this.kolejka.poll();
       }

       public void wyswietl()
       {
           if (this.kolejka.size() == 0)
               System.out.println("Lista zadan jest pusta.");
           else {
               for(zadanie z : this.kolejka)
               {
                   System.out.printf("Zadanie: '%s'\t\tPriorytet: %d\n", z.getDescription(), z.getPriority());
               }
           }
       }
    }

    public static class zadanie implements Comparable<zadanie>{
        private int priority;
        private String description;

        public zadanie(int priority, String description)
        {
            if(priority > 0 && priority < 10){
                this.priority = priority;
                this.description = description;
            }
            else
            {
                System.out.println("Priorytet musi byc cyfra z przedzialu 1-9");
                this.priority = -1;
                this.description = null;
            }
        }

        public int getPriority() {
            return priority;
        }

        public String getDescription() {
            return description;
        }

        @Override
        public int compareTo(zadanie z) {
            if(this.priority == z.getPriority())
                return 0;
            if(this.priority < z.getPriority())
                return -1;
            if(this.priority > z.getPriority())
                return 1;

            return 0;
        }
    }
}
