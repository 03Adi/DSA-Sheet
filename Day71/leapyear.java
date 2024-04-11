package Day71;
import java.util.Scanner;
public class leapyear {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year: ");
        int x=sc.nextInt();
        if((x%400==0)||(x%4==0 && x%100!=0)){
            System.out.println("Given year is leap year: "+x);
        }
        else
        System.out.println("Given yaer not a leap year: "+x);

    }
}
