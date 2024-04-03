package Day64;
import java.util.*;


public class practice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter chartacters: ");
        String s=sc.nextLine();
        int n=s.length();

        for (int i = 0; i < n; i++) {
            if(vowel(s.charAt(i))){
                System.out.print(s.charAt(i)+" ");
            }
            
        }
    }
    public static boolean vowel(char ch){
        if(ch=='a'||ch=='A') return true;
        if(ch=='e'||ch=='E') return true;
        if(ch=='i'||ch=='I') return true;
        if(ch=='o'||ch=='O') return true;
        if(ch=='u'||ch=='U') return true;
        return false;
    }
}
