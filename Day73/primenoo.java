package Day73;
import java.util.*;
class primenoo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=sc.nextInt();
        int count=0;

        for(int i=1;i<=n;i++){
            if(n%i==0){
            count++;
            break;
            }
        }
        sc.close();
        
        if(n==2|| count==0){
            System.out.println(n+" prime no");
        }
        else{
            System.out.println(n+" not a prime no");
        }
    }
}