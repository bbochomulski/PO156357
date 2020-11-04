package pl.imiajd.bochomulski;

public class TestAdres {
    public static void main(String[] args) {

        Adres a = new Adres("Pilsudskiego", 33, "Kadzidlo", "24-420");
        if(a.przed("34/420"))
        {
            System.out.println("Adres2 jest przed"); //adres jest "przed"
        }
        else
        {
            System.out.println("Adres2 nie jest przed"); //adres jest "po"
        }

    }
}
