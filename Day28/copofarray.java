package Day28;
import java.util.*;

public class copofarray {
    public static void main(String[] args) {
        
        // using simple shadow copy---local(fake copy of an array)************

        // int[] arr={10,20,30,43,54,34,50};
        // for(int ele:arr){
        //     System.out.print(ele+" ");
        // }
        // System.out.println();
        // int[] num=arr;
        // for(int value:num){
        //     System.out.print(value+" ");
        // }

        // using the built in function to create copy of array**********

        // int[] arr={10,20,30,40,50,60};
        // for(int ele: arr){
        //     System.out.print(ele+" ");
        // }
        // System.out.println();
        // int[] brr=Arrays.copyOf(arr,arr.length);
        // for(int ele:brr){
        //     System.out.print(ele+" ");
        // }


        // using the for loop to original copy of array
        
        // int[] arr={10,20,30,40,50,60};
        // for(int ele:arr){
        //     System.out.print(ele+" ");
        // }
        // System.out.println();
        // int[] brr=new int[arr.length];
        // for(int i=0;i<arr.length;i++){
        //     brr[i]=arr[i];
        //     int num=brr[i];
        //     System.out.print(num+" ");
        // }

    }
}
