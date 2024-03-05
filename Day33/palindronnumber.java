package Day33;
import java.util.Scanner;
public class palindronnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int sum=0,temp,r;
        temp=n;
        while(n!=0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;

        }
        if(temp==sum)

        System.out.println("palindrom");

        else
        System.out.println("not a palindrom");


        // System.out.println("Enter name");
        // String st=sc.next();
        // String rev="";

        // for(int i=st.length()-1;i>=0;i--){
        //     rev=rev+st.charAt(i);
        // }

        // if(st.equals(rev)){
        //     System.out.println("entered string is palindrom number: ");
        // }
        // else{
        //     System.out.println("not a palindrom number: ");
        // }
    }
}
