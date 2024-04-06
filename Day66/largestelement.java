package Day66;

public class largestelement {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,44,6,7,8};
        int n=arr.length;
        int max=arr[0];

        for (int i = 0; i < n; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
            
        }
        System.out.println("The largest element in an array: "+max);
    }
}
