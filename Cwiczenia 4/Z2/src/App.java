import java.io.BufferedReader;
import java.io.FileReader;

public class App {
    public static void main(String[] args) throws Exception {
        FileReader reader = new FileReader(args[0]);
        BufferedReader bfr = new BufferedReader(reader);
        String str = bfr.readLine();
        int counter = 0;
        for(int i=0;i<str.length();i++)
            if(str.charAt(i) == args[1].toCharArray()[0]) counter++;
        System.out.println(counter);
    }
}
