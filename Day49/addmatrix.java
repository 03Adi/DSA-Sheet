package Day49;

public class addmatrix {
    public static void main(String[] args) {
        int[][] a={{1,9,3},{2,3,4},{6,2,1}};
        int[][] b={{9,7,4},{3,5,6},{4,6,4}};
        

        int m=a.length;
        int n=b[0].length;
        int[][] res=new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                res[i][j]=a[i][j]+b[i][j];
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }

    }
}
