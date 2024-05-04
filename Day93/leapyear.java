package Day93;

public class leapyear {
    public static void  main(String arg[]){
        int year=2023;

        if((year%400==0)||(year%100!=0 && year%4==0)){
            System.out.println("Given year is leap year: "+year);
        }
        else{
            System.out.println("given year is not leap year: "+year);
        }
    }
}
