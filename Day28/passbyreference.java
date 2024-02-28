package Day28;

public class passbyreference {
    public static void main(String[] args) {
        int[] arr={10,13,43,54,65,76};
        System.out.println(arr[3]);

        change(arr);
        System.out.println(arr[3]);
    }
    public static void change(int[] x){
    x[3]=30;
    }
}
