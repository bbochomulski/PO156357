package pl.edu.uwm.PO.lab06;

public class Test_RachunekBankowy {
    public static void main(String[] args) {

        RachunekBankowy saver1 = new RachunekBankowy(2000,4);
        RachunekBankowy saver2 = new RachunekBankowy(3000,4);
        saver1.obliczMiesieczneOdsetki();
        saver2.obliczMiesieczneOdsetki();
        System.out.printf("Saldo saver1: %f\n",saver1.getSaldo());
        System.out.printf("Saldo saver2: %f\n",saver2.getSaldo());
        saver1.setRocznaStopaProcentowa(5);
        saver2.setRocznaStopaProcentowa(5);
        System.out.println("Zmiana rocznej stopy procentowej na 5%");
        saver1.obliczMiesieczneOdsetki();
        saver2.obliczMiesieczneOdsetki();
        System.out.printf("Saldo saver1: %f\n",saver1.getSaldo());
        System.out.printf("Saldo saver2: %f\n",saver2.getSaldo());


    }
}
