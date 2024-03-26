package Day55;

public class Transposematrix {
    public static void main(String[] args) {
        // 1 2
        // 3 4
        // 5 6

        int[][] arr={{1,2},{3,4},{5,6}};
        int m=arr.length;
        int n=arr[0].length;
        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
            // System.out.println();
        // }
        for(int j=0;j<n;j++){
            for(int i=0;i<m;i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        }
}

// basically transpose matrix ko store krne ke liye we are used the some common way----
// int[][] transpose=new int[n][m]//row / column
// for loop wahi same use hoga
// after for loop
// tranpose arr[i][j]=arr[j][i];
// sout(transpose[i][j]+" ")
// sout() -- for next line