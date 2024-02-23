package Day23;
// Basically for find the maximum from an array
public class maxno {
    public static void main(String[] args) {
        int ans=0;
        int[] arr={10,12,23,21,33,4};

        for(int i=0;i<arr.length;i++){
            if(arr[i]>ans)
            ans=arr[i];
        }
        System.out.println(ans);
    }
}
