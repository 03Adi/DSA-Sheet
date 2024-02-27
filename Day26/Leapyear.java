package Day26;

public class Leapyear {
    public static void main(String[] args) {
        int year=2020;
        // boolean flag=false;

        // if(year%4==0){
        //     if(year%100==0){
        //         if(year%400==0)
        //             flag=true;
        //             else
        //             flag=false;
                
        //     }
        //    else
        //     flag=true;
        // }
        // else
        // flag=false;

        // if(flag)
        // System.out.println("yaer is leap: "+year);
        // else
        // System.out.println("year is not leap: "+year);


        // second technique using if else condition----

        if((year%400==0) || (year%4==0 && year%100!=0)){
            System.out.println("Given year is leap year");
        }
        else
        System.out.println("Given year is not leap year");
        }
}
