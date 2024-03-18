package Day46;

public class largestelement {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{22,33,3},{5,6,5}};
        // int mx=Integer.MIN_VALUE;
        int mx=0;
        int m=arr.length;//row
        int n=arr[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mx=Math.min(mx,arr[i][j]);
            }
        }
        System.out.println(mx);
    }
    
}
