import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        ArrayList<Integer> lista3 = reversed(lista);
        for(int i = 0; i <=lista3.size()-1; i++) {
            System.out.println(lista3.get(i));
        }
    }
    
    public static ArrayList<Integer> reversed(ArrayList<Integer> a){
        ArrayList<Integer> lista = new ArrayList<Integer>();
        for(int i=a.size()-1;i>=0;i--)
            lista.add(a.get(i));
        return lista;
    }
}
