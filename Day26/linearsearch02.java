package Day26;
import java.util.*;
public class linearsearch02{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements: ");
        int x=sc.nextInt();

        System.out.println("Enter Array size");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter elements of array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x)
                flag=true;
            break;
        }
        if(flag==true)
            System.out.println("Element found");
        else
            System.out.println("Element not found");
}
}
