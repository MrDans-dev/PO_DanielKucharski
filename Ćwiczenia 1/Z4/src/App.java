public class App {
    public static void main(String[] args) throws Exception {
        double proc = 0.06;
        double saldo = 1000;
        saldo += (saldo * proc); //Saldo za 1 rok
        System.out.println(saldo);
        saldo += (saldo * proc); // Saldo za 2 rok
        System.out.println(saldo);
        saldo += (saldo * proc); // Saldo za 3 rok
        System.out.println(saldo);
    }
}
