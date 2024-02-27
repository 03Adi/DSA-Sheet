package Day26;

public class Leapyear {
    public static void main(String[] args) {
        int year=2024;
        boolean flag=false;

        if(year%4==0){
            if(year%100==0){
                if(year%400==0)
                    flag=true;
                    else
                    flag=false;
                
            }
           else
            flag=true;
        }
        else
        flag=false;

        if(flag)
        System.out.println("yaer is leap: "+year);
        else
        System.out.println("year is not leap: "+year);
    }
}
