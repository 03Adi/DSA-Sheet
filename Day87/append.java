package Day87;

public class append {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder("Aditya");
        System.out.println(s);

        // now we are using th append()function okk----

    s.append(" Prakash");
    System.out.println(s);

    // now we are also add some integer value at the last of the string ----
    s.append(" "+333);
    System.out.println(s);
    }
}
