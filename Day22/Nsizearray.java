package Day22;
import java.util.*;
public class Nsizearray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<=n-1;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<=n-1;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
