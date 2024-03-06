package Day35;

/**
 * Dutchflag Meyhod 01
 */
public class Dutchflag {

    public static void main(String[] args) {
        int[] arr={0,0,0,1,2,1,0,1,0,1,0,2,2,1};
        
        int noofzeros=0;
        int noofones=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0) noofzeros++;
            if(arr[i]==1) noofones++;

        }
        for(int i=0;i<arr.length;i++){
            if(i<noofzeros) arr[i]=0;
            else if(i<noofzeros+noofones) arr[i]=1;
            else arr[i]=2;
        }
        // for(int ele:arr){
        //     System.out.print(ele+" ");
        // }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}