package Day95;

public class subarray {
    public static void main(String arg[]){
        int[] arr={1,2,3,4,5,6,7,3,5,7};
        int n=arr.length;
        int target=7;
        int start=0;
        int currentsum=0;

        for(int i=0;i<n;i++){
            currentsum=currentsum+arr[i];

            while(currentsum>target && start<=i ){
                currentsum=currentsum-arr[start];

                start++;

            }
            if(currentsum==target){
                System.out.println(target+" value index are at "+start+ " and "+i);
                return;

            }

        }
        System.out.println("given target value are not contain any type of subarray in this array: "+target);
    }
}
