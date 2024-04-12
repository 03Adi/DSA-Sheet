package Day71;
import java.util.*;
public class primeno {
    static boolean isprime(int num){
        if(num<=1)
        return false;

        for (int i = 2; i <= num; i++) {
            if(num%i==0)
            return false;
        }
        return true;
    }



    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();


        if(isprime(num))
        System.out.println("Enterned number is prime number: "+num);

        else
        System.out.println("Entered number is not prime number: "+num);


        sc.close();
    }

}
