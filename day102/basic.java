package day102;
import java.util.*;
public class basic{
    public static void main(String[] arg){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no: ");
        int n=sc.nextInt();

        for(int i=1;i<=n*10;i++){
        
            if(i%n==0)
            System.out.println(i);
           }

      
    }
}