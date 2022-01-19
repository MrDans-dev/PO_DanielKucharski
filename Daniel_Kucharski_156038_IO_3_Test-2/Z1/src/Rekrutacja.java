import java.lang.reflect.Array;
import java.util.ArrayList;

public class Rekrutacja{
    static int doswiadczenie;
    private ArrayList<Kandydat> lista;

    public void set(){
        Rekrutacja.doswiadczenie = 2;
    }

    public static boolean Qualified(Kandydat k){
        if(k.getlatadoswiadczenia() >= Rekrutacja.doswiadczenie) return true;
        return false;
    }
}
