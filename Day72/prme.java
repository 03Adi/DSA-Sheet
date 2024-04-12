package Day72;
import java.util.*;

public class prme {
    //new approch
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=sc.nextInt();
        int count =0;

        //now use for loop for all other numbers---
        for(int i=0;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }


        // baically sbse phle 2 ko alg kr liya kuki ye prime no hai ----
        if(count==2)
        System.out.println("entered no is prime no: "+n);
        else
        System.out.println("Not a prime no: "+n);
    }
}
