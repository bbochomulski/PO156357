package pl.edu.uwm.obiektowe.s156357.kolo2;

public class Osobowy extends Pojazd implements IMozeCofac{

    public Osobowy(String prod, String model) {
        super(prod, model);
    }

    @Override
    public void uzyjKlaksonu() {
        System.out.println("*dzwiek klaksonu osobowki*");
    }

    @Override
    public String toString() {
        return "Samochod osobowy " + super.toString();
    }

}
