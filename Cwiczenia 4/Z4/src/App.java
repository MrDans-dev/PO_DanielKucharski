import java.math.BigInteger;

public class App {
    public static void main(String[] zmienne) throws Exception {
        BigInteger a = new BigInteger("2");
        int n = Integer.valueOf(zmienne[0]);
        System.out.println(zmienne[1]+" "+zmienne[2]);
        System.out.println(a.pow(n-1));
    }
}
