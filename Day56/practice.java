package Day56;

public class practice {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6}};
        int m=arr.length;
        int n=arr[0].length;

        int[][] transpose=new int[n][m];//basically for row and column
        for(int j=0;j<n;j++){
            for(int i=0;i<m;i++){
                transpose[j][i]=arr[i][j];
                System.out.print(transpose[j][i]+" ");
            }
            System.out.println();
        }
    }
}
