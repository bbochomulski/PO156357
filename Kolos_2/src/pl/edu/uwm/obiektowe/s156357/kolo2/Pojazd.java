package pl.edu.uwm.obiektowe.s156357.kolo2;

import java.time.LocalDate;

public abstract class Pojazd implements IMozeCofac{
    private String model;
    private Producent producent;
    private LocalDate dataProdukcji;

    public abstract void uzyjKlaksonu();

    public Pojazd(String prod, String model){
        this.model = model;
        this.dataProdukcji = LocalDate.now();
        prod = prod.toUpperCase();
        switch (prod)
        {
            case "FORD" :
                this.producent = Producent.FORD;
                break;
            case "AUDI":
                this.producent = Producent.AUDI;
                break;
            case "BMW":
                this.producent = Producent.BMW;
                break;
            case "SKODA":
                this.producent = Producent.SKODA;
                break;
            default:
                System.out.println("Podano zlego producenta");
        }
    }

    @Override
    public void cofaj() {
        System.out.println("Uwaga, cofam...");
    }

    public void jedzDoPrzodu(){
        System.out.println("Jadę do przodu");
    }

    private enum Producent {
        FORD, AUDI, BMW, SKODA
    }

    @Override
    public String toString() {
        return "" + this.producent + " " + this.model + " - Data produkcji: " + this.dataProdukcji.toString();
    }

    public String getModel() {
        return model.toString();
    }

    public String getProducent() {
        return producent.toString();
    }

    public String getDataProdukcji() {
        return dataProdukcji.toString();
    }
}


