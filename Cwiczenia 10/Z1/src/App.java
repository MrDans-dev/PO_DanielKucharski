import java.time.LocalDate;
import pl.daniel.kucharski.*;

public class App {
    public static void main(String[] args) throws Exception {
        Osoba o1 = new Osoba("kucharski", LocalDate.of(1999, 9, 14));
        System.out.println(o1.toString());
    }
}
