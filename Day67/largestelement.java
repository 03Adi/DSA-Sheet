package Day67;

public class largestelement {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,4,33};
        int target=0;
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            target=arr[i];

        }
        System.out.println("The largest element in an array: "+target);

    }
}
