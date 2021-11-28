import java.util.ArrayList;
import java.util.Collections;
public class App {
    
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(4);
        list.add(9);
        list.add(16);
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(9);
        list2.add(7);
        list2.add(4);
        list2.add(9);
        list2.add(11);
        ArrayList<Integer> lista3 = merge(list, list2);

        for(int i = 0; i <lista3.size(); i++){
           System.out.print(lista3.get(i)+" ");
        }
    }

    private static ArrayList<Integer> merge(ArrayList<Integer> list, ArrayList<Integer> list2) {
        ArrayList<Integer> wyn = new ArrayList<Integer>(list.size()+list2.size());
        int size = list.size() + list2.size();
        int index =0;
        for(int i=0;i<size-2;i++)
        {
            if(list.size() < list2.size()){
                if((i%2!=0 && i >0) || i > list.size()-1) wyn.add(list2.get(index-1));
                else{ 
                    wyn.add(list.get(index));
                }
            }else{

            }
            index++;
        }
        return wyn;
    }
}
