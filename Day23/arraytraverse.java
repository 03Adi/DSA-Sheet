package Day23;

public class arraytraverse {
    public static void main(String[] args) {
        //this program is basically for the travers a 2D array-----
        int[][] arr={{12,13,14},{15,16,17}};

        for(int i=0;i<arr.length;i++){
            for(int j=0;i<arr[i].length;j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}
