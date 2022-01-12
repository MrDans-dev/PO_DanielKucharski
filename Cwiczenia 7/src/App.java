import pl.daniel.kucharski.*;

public class App {
    public static void main(String[] args) throws Exception {
        NazwanyPunkt a = new NazwanyPunkt(3, 5, "pkt1");
        a.show();
        Punkt b = new Punkt(3, 6);
        b.show();
        Punkt c = new NazwanyPunkt(3, 6, "pkt2");
        c.show();
    }
}
