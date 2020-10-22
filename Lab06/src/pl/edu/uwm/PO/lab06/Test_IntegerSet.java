package pl.edu.uwm.PO.lab06;

public class Test_IntegerSet {
    public static void main(String[] args) {

        IntegerSet zbior1 = new IntegerSet();
        IntegerSet zbior2 = new IntegerSet();

        zbior1.insertElement(20);
        zbior1.insertElement(30);
        zbior1.insertElement(50);
        zbior1.insertElement(70);

        zbior2.insertElement(20);
        zbior2.insertElement(30);
        zbior2.insertElement(50);
        zbior2.insertElement(70);
        zbior2.insertElement(80);

        IntegerSet suma = IntegerSet.union(zbior1,zbior2);
        System.out.println(suma.toString());

        IntegerSet iloczyn = IntegerSet.intersection(zbior1,zbior2);
        System.out.println(iloczyn.toString());

        System.out.println(zbior1.equals(zbior2));
        zbior2.deleteElement(80);
        System.out.println(zbior1.equals(zbior2));

    }
}
