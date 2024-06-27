package day101;
import java.util.*;

public class lambda {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("banana", "apple", "cherry", "date");

        // Using lambda expression to sort the list
        Collections.sort(list, (s1, s2) -> s1.compareTo(s2));

        System.out.println(list);
    }
}
