package Day22;

public class problem1 {
    public static void main(String[] args) {
        int[] marks={22,33,44,55,66,100,3};
        int n=marks.length;

        for (int i = 0; i < n; i++) {
            if(marks[i]<35){
                System.out.println(i + " ");
            }
        }
    }
}
