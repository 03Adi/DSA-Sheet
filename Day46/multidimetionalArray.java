package Day46;

class multidimentionalArray{
    public static void main(String[] args) {
        
        int[][] arr=new int[3][3];
        // print the 2D array with any value store in array
        
        for(int i=0;i<3;i++){//row
            for(int j=0;j<3;j++){//column
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}