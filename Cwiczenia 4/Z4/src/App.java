import java.math.BigInteger;

;public class App {
    public static void main(String[] args) throws Exception {
        BigInteger a = new BigInteger("2");
        int n = Integer.valueOf(args[0]);
        System.out.println(a.pow(n-1));
    }
}
