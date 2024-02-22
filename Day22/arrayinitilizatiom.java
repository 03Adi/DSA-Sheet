package Day22;//arrayintilization
import java.util.*;
public class arrayinitilizatiom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];//Take 10 size element
        System.out.println("Enter n: ");

        for(int i=0;i<=9;i++) {//initilaze 0 to 9
            arr[i]=sc.nextInt();

        }
        for(int i=0;i<=9;i++)// loop for elements
          System.out.println(arr[i]);

    }
}