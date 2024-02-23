package Day23;
// error alert........
import Day22.sumofarray;

public class linearsearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        int x=3;
        int ans=-1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
               ans=i;
               break;
            }
        }
        if(ans==-1){
            System.out.println("not found");
        }
        else{
            System.out.println(ans);
        }
    }
}
