package Day86;

public class subarray {
    public static void main(String arg[]){
        int[] arr={1,3,4,-7,1,3,3,1,-4};
        int n=arr.length;
        int targetsum=7;
        int currentsum=0;
        int start=0;

        for(int i=0;i<n;i++){
            currentsum=currentsum+arr[i];

            while(currentsum>targetsum && start<=i){
                currentsum=currentsum-arr[start];// mtlb ki jo array store kr rahe hain usme se previous element ko remove kr dena hain---
    
                start++;
            }
            if(currentsum==targetsum){
                System.out.println(targetsum+" is at index "+start+" to "+i);
                return;
            }
        }
        System.out.println("Given target element sum are not found in given array !!");
    }
}
