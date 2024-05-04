package Day93;

public class largest {
    public static void main(String arg[]){
        int[] arr={2,424,5656,67876,2342,567678,233424};
        int n=arr.length;
        int maxele=0;

        for(int i=0;i<n;i++){
            if(maxele<arr[i])
            maxele=arr[i];
        }
System.out.println(maxele);

    }
}
