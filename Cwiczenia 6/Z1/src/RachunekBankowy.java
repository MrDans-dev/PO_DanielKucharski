public class RachunekBankowy {
    private static double rocznaStopaProcentowa;
    private double saldo;

    RachunekBankowy(double saldo){
        this.saldo = saldo;
    }

    public void obliczMiesieczneOdsetki(){
        this.saldo += (this.saldo * this.rocznaStopaProcentowa)/12;
    }

    public void setRocznaStopaProcentowa(double x){
        this.rocznaStopaProcentowa = x;
    }

    public double getSaldo(){
        return this.saldo;
    }
}
