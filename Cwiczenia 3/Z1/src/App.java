import java.util.Random;

public class App {
    public static int[] generuj(int n,int max,boolean unsigneg){
        max +=1;
        int[] tab = new int[n];
        Random r = new Random();
        if(!unsigneg){
            for(int i=0;i<n;i++){
                if(r.nextBoolean()){
                    tab[i] = r.nextInt(max);
                }
                else{
                    tab[i] = -(r.nextInt(max));
                }    
            }
        }
        else{
            for(int i=0;i<n;i++){
                tab[i] = r.nextInt(max);
            }
        }
        return tab;
    }

    public static void wypisz(int n,int[] tab)
    {
        for(int i=0;i<n;i++){
            System.out.print(tab[i] +" ");
        }
        System.out.println("");
    }
    
    public static void main(String[] args) throws Exception {
        int n=20;
        int ilosc_parzyste= 0;
        int ilosc_ujemne = 0;
        int ilosc_dodatnie = 0;
        int ilosc_zerowe = 0;
        int max = 0;
        int min = 0;
        int tab[] = generuj(n, 999,false); // false/true for unsigned int
        
        wypisz(n, tab);

        // ============== A =======================================
        
        for(int i=0;i<n;i++){
            if(tab[i]%2==0){
                ilosc_parzyste++;
            }
        }
        System.out.println("Ilość parzystych liczb: "+ilosc_parzyste);

        // ============== B =======================================
        ilosc_ujemne = 0;
        for(int i=0;i<n;i++){
            if(tab[i]<0){
                ilosc_ujemne++;
            }
            else{
                ilosc_dodatnie++;
            }
            if(tab[i]==0){
                ilosc_zerowe++;
            }
        }
        System.out.println("Ilość ujemnych liczb: "+ilosc_ujemne);
        System.out.println("Ilość dodatnich liczb: "+ilosc_dodatnie);
        System.out.println("Ilość zerowych liczb: "+ilosc_zerowe);

        // ============== C =======================================
        max = tab[0];
        min = tab[0];
        for(int i=1;i<n;i++){
            if(tab[i]>max) max = tab[i];
            if(tab[i]<min) min = tab[i];
        }
        System.out.println("MAX: "+max);
        System.out.println("MIN: "+min);
    }
}
