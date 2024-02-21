package Day22;

public class sumofarray {
    public static void main(String[] args) {
        int[] arr={10,33,44,22,33,44,55 ,4,33,322};
        int sum=0;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.print(sum);
    }
}
