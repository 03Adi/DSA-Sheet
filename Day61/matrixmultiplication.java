package Day61;

public class matrixmultiplication {
    public static void main(String[] args) {
        int[][] a={{1,2,1},{2,1,2}};
        int[][] b={{1,0,1,2},{2,1,0,0},{0,3,1,1}};
        if(a[0].length!=b.length){
            System.out.println("multiplication not possible");
    }
    else{//multiplication is possible
        int[][] c=new int[a.length][b[0].length];//row and column
        for (int i = 0; i < c.length; i++) {//row
            for (int j = 0; j < c[0].length; j++) {//column
              for (int k = 0; k < b.length; k++) {
                c[i][j]+=a[i][k]*b[k][j];
              }  
              System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }

    }

}
}