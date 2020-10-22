package pl.edu.uwm.PO.lab06;

public class RachunekBankowy {

        double rocznaStopaProcentowa;
        private double saldo;

        public RachunekBankowy(){
            this.saldo = 0;
            this.rocznaStopaProcentowa = 0;
        }

        public RachunekBankowy(double saldo,double rSP){
            this.saldo = saldo;
            this.rocznaStopaProcentowa = rSP;
        }

        public void obliczMiesieczneOdsetki() {
            this.saldo += (saldo * rocznaStopaProcentowa) / 12;
        }

        public void setRocznaStopaProcentowa(double rocznaStopaProcentowa) {
            this.rocznaStopaProcentowa = rocznaStopaProcentowa;
        }

        public double getSaldo() {
            return saldo;
        }
}

