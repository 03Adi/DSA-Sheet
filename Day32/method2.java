package Day32;

public class method2 {
    public static void main(String[] args) {
        int[] arr={1,0,0,1,1,0,1,0,0,0,1};
        int n=arr.length;

        int noofzeros=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0)
            noofzeros++;
        }
        for(int i=0;i<n;i++){
            if(i<noofzeros) arr[i]=0;
            else arr[i]=1;
        }
    }
}
