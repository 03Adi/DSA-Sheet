package Day95;
import java.util.*;

public class leapyear{
    public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter year: ");

    int n=sc.nextInt();

    if((n%400==0)||(n%100!=0 && n%4==0))
    System.out.println("Enterd year is leap year: "+n);

    else
    System.out.println("Enterd year is not leap year: "+n);
}
}
