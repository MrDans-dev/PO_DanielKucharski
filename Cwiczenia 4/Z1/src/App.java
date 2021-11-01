import java.lang.String;
import java.util.Scanner;
import java.lang.StringBuffer;

public class App {

    public static int countChar(String str, char c ){
        int counter = 0;
        for(int i=0;i<str.length();i++)
            if(str.charAt(i) == c) counter++;
        return counter;
    }

    //public static int countSubStr(String str , String sub)
    //{
    //    return 0;
    //}

    public static String middle(String str){
        StringBuffer buffer = new StringBuffer();
        int mid_index = str.length()/2;
        if(str.length()%2!=0){
            buffer.append(str.charAt(str.length()/2));
        }
        else{
            buffer.append(str.charAt(mid_index));
            mid_index--;
            buffer.append(str.charAt(mid_index));
        }
        return buffer.toString();
    }

    public static String repeat(String str , int n){
        return str.repeat(n);
    }

    public static String change(String str){
        StringBuffer buffer = new StringBuffer();
        for(int i=0;i<str.length();i++){
            if(Character.isUpperCase(str.charAt(i)))
                buffer.append(Character.toLowerCase(str.charAt(i)));
            else
                buffer.append(Character.toUpperCase(str.charAt(i)));
        }
        return buffer.toString();
    }

    public static String nice(String str)
    {
        StringBuffer buffer = new StringBuffer();
        for(int i=str.length()-1;i>=0;i--){
            buffer.append(str.charAt(i));
            if((i+1)%3==0 && i!=str.length()-1)
                buffer.append("'");
        }
        return buffer.reverse().toString();
    }

    public static String nice(String str , String sep){
        StringBuffer buffer = new StringBuffer();
        for(int i=str.length()-1;i>=0;i--){
            buffer.append(str.charAt(i));
            if((i+1)%3==0 && i!=str.length()-1)
                buffer.append(sep);
        }
        return buffer.reverse().toString();
    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(countChar(str, 'a'));
        //System.out.println(countSubStr(str, "lol"));
        System.out.println(middle("middle"));
        System.out.println(repeat(str, 6));
        System.out.println(change(str));
        System.out.println(nice(str));
        System.out.println(nice(str,":"));
    }
}
