package Day56;

public class matrixes {
    public static void main(String[] args) {
        int[][] arr={{1,2},{3,4},{5,6}};
        int m=arr.length;// rows
        int n=arr[0].length;//column

        /// basically print the array in i(row) and j(column) form


        // for(int i=0;i<m;i++){// for row
        //     for(int j=0;j<n;j++){// for column
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        /// Now print the array in transpose form and store it in new array

        int[][] transpose=new int[n][m];
        for(int j=0;j<n;j++){//column
            for(int i=0;i<m;i++){
                transpose[j][i]=arr[i][j];
                System.out.print(transpose[j][i]+" ");
                // System.out.print(arr[i][j]+" ");
            }
            System.out.println();
    }
}
}
