package Day63;
import java.util.*;
public class vowelcounting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter details: ");
        String s=sc.nextLine();
        int count=0;

        int n=s.length();
        for (int i = 0; i < n; i++) {
            char ch=s.charAt(i);
            if(vowel(ch)==true)
            count++;
        }
        System.out.println(count);
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



