package Day95;
import java.util.*;
public class primeno {

    static boolean isprime(int num){
        if(num<=1)
        return false;

        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }


    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no: ");
        int num=sc.nextInt();

        if(isprime(num)){
            System.out.println("Given no is prime no: "+num);
        }
        else
        System.out.println("Given no is not prime no: "+num);
    }
}
