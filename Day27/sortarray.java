package Day27;
import java.util.*;
public class sortarray {
    public static void main(String[] args) {
        int[] arr={13,23,22,20,15,46};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        Arrays.sort(arr);// basically it sort the array ---

        System.out.println();// only for next line to understand the code
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
