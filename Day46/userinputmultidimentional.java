package Day46;
import java.util.*;
public class userinputmultidimentional {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[5][5];
        System.out.println("Enter elements: ");

        // For the imput elements---
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                arr[i][j]=sc.nextInt();
                // System.out.print(arr[i][j]+" ");
            }
        }
        // For the output elements----
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
