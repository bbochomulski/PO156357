package pl.bartoszjd.bochomulski;

public class TestOsoby {
    public static void main(String[] args) {

        Student s = new Student("Kowalski", 1995, "Informatyka");
        Nauczyciel n = new Nauczyciel("Nowak", 1975, 3500);

        System.out.println(s.toString());
        System.out.println(n.toString());
        System.out.println(s.getKierunek());
        System.out.println(n.getNazwisko());

    }
}
