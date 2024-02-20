// // for * flipped triangle------

// package Day20;
// import java.util.*;
// public class flippedtriangle {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter n: ");
//        int n=sc.nextInt();

//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n+1-i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
// }

// // for flipped ABCD triangle----

// package Day20;
// import java.util.*;
// public class flippedtriangle {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter n: ");
//        int n=sc.nextInt();

//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n+1-i;j++){
//                System.out.print((char)(j+64)+" ");
//            }
//            System.out.println();
//        }
//    }
// }

// for flipped N0(1,2,3....) triangle----

package Day20;
import java.util.*;
public class flippedtriangle {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter n: ");
       int n=sc.nextInt();

       for(int i=1;i<=n;i++){
           for(int j=1;j<=n+1-i;j++){
               System.out.print(j+" ");
           }
           System.out.println();
       }
   }
}
