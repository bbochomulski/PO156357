package pl.edu.uwm.obiektowe.s156357.kolo2;

import java.util.Stack;

public class LiczbaTest {
    public static void main(String[] args) {
        Liczba liczba1= new Liczba<>(123);
        Liczba liczba2= new Liczba<>(123.0);
        System.out.println(liczba1);
        System.out.println(liczba1.compareTo(liczba2));

        Stack stack = new Stack();
        stack.add(new Liczba<Integer>(12));
        stack.add(new Liczba<Double>(12.3));
        stack.add(new Liczba<Float>((float)12.34));
        stack.add(new Liczba<Long>((long)12123123));
        stack.add(new Liczba<Short>((short)12));

        Zbior z = new Zbior();
        while(!stack.isEmpty())
            z.dodajLiczbe((Liczba) stack.pop());

        System.out.println(z);
    }
}
