package Day87;
import java.util.*;

public class tooglestring {
    public  static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        StringBuilder sb=new StringBuilder(sc.nextLine());
        int n=sb.length();

        for(int i=0;i<n;i++){
            char ch=sb.charAt(i);
            int ascii=(int)ch;

            if(ascii>=65 && ascii<=90){
                ascii+=32;
            }
            else if(ascii>=97 && ascii<=122){
                ascii-=32;
            }
            ch=(char)ascii;
            sb.setCharAt(i,ch);
        }
        System.out.println(sb);
    }
}
