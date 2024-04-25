package Day85;
import java.util.*;

public class primeno {

    static boolean isprime(int num){
        if(num<=1)
            return false;

            for(int i=2;i*i<=num;i++){
                return false;
            }
            return true;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No: ");
        int num=sc.nextInt();

        if(isprime(num))
        System.out.println(num+" is prime no");
        else
        System.out.println(num+" is not prime no");
    }
}
