package Day29;

public class reversearray {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,66,66,7,88,4,66};
        int n=arr.length;
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();

        for(int i=0;i<n/2;i++){ // and int j=n-1-i
            int temp=arr[i];// arr[i] ki value ko tempt me store kiya
            arr[i]=arr[n-i-1];// arr[j] ki value me arr[i] me store kiya
            arr[n-i-1]=temp;// now store the value of temp to arr[j]
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
