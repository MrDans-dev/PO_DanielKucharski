import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        reversed(lista);
        for(int i = 0; i <=lista.size()-1; i++) {
            System.out.println(lista.get(i));
        }
    }
    
    public static void reversed(ArrayList<Integer> a){
        int temp = a.get(0);
        for(int i=0;i<a.size();i++)
            a.set(i, a.size()-i);
        a.set(a.size()-1, temp);
    }
}
