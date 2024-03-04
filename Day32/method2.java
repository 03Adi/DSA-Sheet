package Day32;
/// method 2 of 0`s and 1`s elements in given array-----*******
 
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
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
