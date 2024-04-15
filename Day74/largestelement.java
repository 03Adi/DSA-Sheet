package Day74;

import Day22.sumofarray;

public class largestelement {
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6,7,8,9,33};
        int n=arr.length;
        int max=arr[0];

        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
