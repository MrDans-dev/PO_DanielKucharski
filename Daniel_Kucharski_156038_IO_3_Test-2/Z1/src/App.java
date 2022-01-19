import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Kandydat k1 = new Kandydat("K1", 21, "licencjat", 4);
        Kandydat k2 = new Kandydat("K2", 21, "mistrzowie", 7);
        Kandydat k3 = new Kandydat("K3", 21, "licencjat", 7);
        Kandydat k4 = new Kandydat("K4", 21, "licencjat", 4);
        Kandydat k5 = new Kandydat("K5", 20, "licencjat", 1);
        ArrayList Kandydaci = new ArrayList<Kandydat>();
        Kandydaci.add(k1);
        Kandydaci.add(k2);
        Kandydaci.add(k3);
        Kandydaci.add(k4);
        Kandydaci.add(k5);
        for(int i = 0;i< Kandydaci.size();i++){
            System.out.println(Kandydaci.get(i).toString()); 
        }
        System.out.println(k1.compareTo(k2));
        System.out.println(k1.compareTo(k3));
        System.out.println(k1.compareTo(k4));
        System.out.println(k1.compareTo(k5));
        Rekrutacja r1 = new Rekrutacja();
        r1.set();
        System.out.println(r1.Qualified(k1));
        System.out.println(r1.Qualified(k5));
    }
}
