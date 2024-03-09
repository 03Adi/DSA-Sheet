package Day37;

import java.util.Arrays;

public class sortingarray {
    public static void main(String[] args) {
        int[] arr={1,0,0,2,1,0,2,2,0,1,0,0,1};
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        Arrays.sort(arr);
        System.out.println();

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
