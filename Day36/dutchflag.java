package Day36;
// // ** dutc flag method 2nd---------**********

public class dutchflag {
    public static void main(String[] args) {
        int[] arr={0,1,2,2,2,0,0,0,2,2,1,1,1,0};
        int n=arr.length;
        int mid=0,hi=n-1,lo=0;
        while(mid<=hi){
            if(arr[mid]==0){
                int temp=arr[mid];
                arr[mid]=arr[lo];
                lo++;
                mid++;
            }
            else if(arr[mid]==1) mid++;
            else{
                int temp=arr[mid];
                arr[mid]=arr[hi];
                arr[hi]=temp;
                hi--;
            }
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
