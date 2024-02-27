package Day27;

public class findmaxno {
    public static void main(String[] args) {

        int max=Integer.MIN_VALUE;// more usefull when negative value in an array
        int[] arr={-3,-14,-56,-12,-23,-32,-33};

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("max value is: "+max);

    }
}
