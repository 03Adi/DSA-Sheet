package Day62;

public class findelement {
    public static void print(int[][] arr,int target){

        int m=arr.length;
        int n=arr[0].length;
        int value=3;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(value==target)
                System.out.println(value+" ");
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{3,4,5},{5,6,7}};
        int n=arr[0].length;//coulmn
        int m=arr.length;
        print(arr,m);
    }
    
}
