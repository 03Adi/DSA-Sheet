package Day95;
import java.util.*;
public class compareelement {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int largest=a;

        if(b>largest){
            largest=b;
        }
        if(c>largest){
            largest=c;
        }
    
        System.out.println("The largest element is : "+largest);
    }
}
