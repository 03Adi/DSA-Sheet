package Day20;
import java.util.Scanner;
public class starpluspattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();

        int mid=n/2 + 1;
        for(int i=1;i<=n;i++){//row
            for(int j=1;j<=n;j++){//column
               if(i==mid || j==mid) 
               System.out.print("*"+" ");
               else
               System.out.print(" "+" ");

            }
            System.out.println();
        }
    }
}
