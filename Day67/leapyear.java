package Day67;

public class leapyear {
    public static void main(String[] args) {
        int year = 2024;

        if((year%400==0)||(year%4==0 && year%100 !=0)){
            System.out.println("Given year is leap year: "+year);
        }
        else
        System.out.println("Given year not a leap year: "+year);
    }
}
