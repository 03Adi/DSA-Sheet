package Day85;
import java.util.*;
public class vowelcounting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your namr: ");
        String s=sc.nextLine();
        int n=s.length();
        int count=0;

        for (int i = 0; i < n; i++) {
            char ch=s.charAt(i);
            if(vowel(ch)==true)
            count++;
        }
        System.out.println("Total no of vowel in given String is: "+count);
    }
    static boolean vowel(char ch){
        if(ch=='A'||ch=='a') return true;
        if(ch=='E'||ch=='e') return true;
        if(ch=='I'||ch=='i') return true;
        if(ch=='O'||ch=='o') return true;
        if(ch=='U'||ch=='u') return true;

        else return false;

    }
}
