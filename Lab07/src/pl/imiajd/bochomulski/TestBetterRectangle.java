package pl.imiajd.bochomulski;

public class TestBetterRectangle {
    public static void main(String[] args) {

        BetterRectangle br = new BetterRectangle(10,20);
        System.out.printf("Szerokosc: %d\nWysokosc: %d\n\n", br.width, br.height);
        System.out.printf("Obwod: %f\n", br.getPerimeter());
        System.out.printf("Pole: %f\n", br.getArea());

    }
}
