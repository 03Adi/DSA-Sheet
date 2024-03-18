package Day46;
import java.util.*;

// import Day37.sortingarray;
public class rollnumbermarksdata {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[4][2];
        System.out.println("Enter Students roll number and marks: ");

        for(int i=0;i<4;i++){
            for(int j=0;j<2;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        // for(int[] ele:arr){
        //     for(int x:ele){
        //         System.out.print(x+" ");
        //     }
        //     System.out.println();
        // }
        for(int i=0;i<4;i++){
            for(int j=0;j<2;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
