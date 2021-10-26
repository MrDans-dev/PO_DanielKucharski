import java.util.Scanner;
import java.math.*;

public class App {

    public static float a(int n, float tab[]){
        float suma = 0;
        for(int i=0;i<n;i++){
            suma+= tab[i];
        }
        return suma;
    }

    public static float b(int n, float tab[]){
        float iloczyn = 1;
        for(int i=0;i<n;i++){
            iloczyn *= tab[i];
        }
        return iloczyn;
    }

    public static float bezw(float a){
        if(a < 0){
            return -a;
        }
        return a;
    }

    public static float c(int n, float tab[]){
        float suma = 0;
        for(int i=0;i<n;i++){
            suma+= bezw(tab[i]);
        }
        return suma;
    }

    public static float d(int n, float tab[]){
        float suma = 0;
        for(int i=0;i<n;i++){
            suma+= Math.sqrt(tab[i]);
        }
        return suma;
    }

    public static float e(int n, float tab[]){
        float iloczyn = 1;
        for(int i=0;i<n;i++){
            iloczyn *= bezw(tab[i]);
        }
        return iloczyn;
    }

    public static float f(int n, float tab[]){
        float suma = 0;
        for(int i=0;i<n;i++){
            suma+= Math.pow(tab[i],2);
        }
        return suma;
    }

    public static void g(int n, float tab[]){
        float suma = 0;
        float iloczyn = 1;
        for(int i=0;i<n;i++){
            Float o = tab[i];
            suma+= o;
            iloczyn *= o;

        }
        System.out.println(suma);
        System.out.println(iloczyn);
    }

    public static float h(int n,float tab[]){
        float suma = 0;
        for(int i=0;i<n;i++)
        {
            suma += (Math.pow(-1, i+2) * tab[i]);
        }
        return suma;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Podaj n:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        float tab[] = new float[n];
        for(int i=0;i<n;i++){
            tab[i] = scan.nextFloat();
        }
        System.out.println(a(n,tab));
        System.out.println(b(n,tab));
        System.out.println(c(n,tab));
        System.out.println(d(n,tab));
        System.out.println(e(n,tab));
        System.out.println(f(n,tab));
        g(n,tab);
        System.out.println(h(n,tab));



    }
}
