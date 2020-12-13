package pl.edu.uwm.obiektowe.s156357.kolo2;

public class PojazdTest {
    public static void main(String[] args) {
        Osobowy o = new Osobowy("SKODA", "Octavia");
        System.out.println(o.toString());
        o.cofaj();
        o.uzyjKlaksonu();
        o.jedzDoPrzodu();
    }
}
