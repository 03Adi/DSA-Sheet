package Day32;
import java.util.*;

/// Basically the qustion is about the o`s and 1`s sorted array-------

/// #Method [01] ************** 

public class osand1s {
     public static void main(String[] args) {
        int[] arr={1,0,0,0,1,0,1,0,1,0,1};
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
        Arrays.sort(arr);

        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
     }
}
