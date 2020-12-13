package pl.edu.uwm.po.lab13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        studentList lista = new studentList();
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
                case "nowy":
                    lista.dodajStudenta(inputArr[1],inputArr[2]);
                    break;
                case "usun":
                    lista.usunStudenta(Integer.parseInt(inputArr[1]));
                    break;
                case "dodaj":
                    lista.dodajOcene(Integer.parseInt(inputArr[1]),inputArr[2]);
                    break;
                case "wyswietl":
                    lista.wyswietlListe();
                    break;
                case "zmien":
                    lista.zmienOcene(Integer.parseInt(inputArr[1]),inputArr[2]);
                    break;
                default:
                    System.out.println("Niepoprawne polecenie!");
                    System.out.println("Lista polecen: \n" +
                            "nowy imie nazwisko - dodaje studenta o podanym imieniu i nazwisku\n" +
                            "usun index - usuwa studenta o podanym indeksie z listy\n" +
                            "dodaj index ocena - dodaje ocene dla studenta o danym indeksie\n" +
                            "zmien index ocena - zmienia ocene studenta o podanym indeksie\n" +
                            "zakoncz - konczy prace programu\n");
            }
        }
    }

    public static class studentList{
        private HashMap<Integer, Student> indeksy;
        private HashMap<Student, String> oceny;
        private int nextIndex = 150000;

        public studentList(){
            oceny = new HashMap<Student, String>();
            indeksy = new HashMap<Integer, Student>();
        }

        public void dodajOcene(int index, String ocena){
            if (indeksy.containsKey(index)) {
                if (!oceny.containsKey(this.indeksy.get(index)))
                {
                    this.oceny.put(this.indeksy.get(index), ocena);
                    System.out.printf("Dodano ocene %s dla studenta o indeksie %d.\n", ocena, index);
                }
                else
                    System.out.printf("Student o indeksie %d ma juz wpisana ocene. Uzyj polecenia 'zmien'.\n", index);
            }
            else
                System.out.println("Nie znaleziono studenta o podanym indeksie.");
        }

        public void usunStudenta(int index){
            Student s = this.indeksy.get(index);
            this.oceny.remove(s);
            this.indeksy.remove(index);
            System.out.printf("Student o indeksie %d zostal usuniety.\n", index);
        }

        public void dodajStudenta(String imie, String nazwisko){
            indeksy.put(this.nextIndex, new Student(imie, nazwisko, this.nextIndex));
            System.out.printf("Student %s %s o indeksie %d zostal dodany.\n", imie,nazwisko,this.nextIndex++);
        }

        public void zmienOcene(int index, String nowaOcena){
            System.out.printf("%s: Zmieniono ocene z %s na %s.\n", index, oceny.get(indeksy.get(index)), nowaOcena);
            this.oceny.replace(indeksy.get(index),nowaOcena);
        }

        public void wyswietlListe(){
            System.out.println("Lista ocen studentow:");
            ArrayList<Student> studenci = new ArrayList<>();
            for(Student s: oceny.keySet())
                studenci.add(s);
            studenci.sort(Student::compareTo);

            for(Student s: studenci)
                System.out.println(s.toString() + ": " + oceny.get(s));
        }
    }

    public static class Student implements Comparable<Student>{
        private String imie;
        private String nazwisko;
        private int id;

        public Student(String imie, String nazwisko, int id) {
            this.imie = imie;
            this.nazwisko = nazwisko;
            this.id = id;
        }

        public String getImie() {
            return imie;
        }

        public String getNazwisko() {
            return nazwisko;
        }

        public int getId() {
            return id;
        }

        @Override
        public String toString() {
            return nazwisko + " " + imie;
        }

        @Override
        public int compareTo(Student o) {
            int result = this.nazwisko.compareTo(o.getNazwisko());
            if (result == 0)
            {
                int result2 = this.imie.compareTo(o.getImie());
                if (result2 == 0)
                    return Integer.compare(this.id,o.getId());
                return result2;
            }
            return result;
        }
    }
}