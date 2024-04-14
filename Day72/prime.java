package Day72;
import java.util.*;
public class prime {

    static boolean isprime(int num) {
        if (num <= 1)
            return false;

        for (int i = 2; i*i <= num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no: ");
        int num = sc.nextInt();

        if (isprime(num))
            System.out.println("Prime no: " + num);
        else
            System.out.println("Not prime no: " + num);
        sc.close();

    }
}