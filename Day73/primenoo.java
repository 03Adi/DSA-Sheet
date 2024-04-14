package Day73;
import java.util.*;

class primenoo{
    static boolean isprime(int n){
        if(n<=1)
        return false;

        for(int i=2;i*i<=n;i++){
            if(n%i==0)
            return false;
        }
        return true;
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no");
        int n=sc.nextInt();

        if(isprime(n))
       System.out.println("Prime no: "+n); 
       else
       System.out.println("not prime no: "+n);
    }
}