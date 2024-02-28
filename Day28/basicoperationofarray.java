package Day28;
import java.util.*;
public class basicoperationofarray {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>(6);//Initilization of ArrayList
        arr.add(0,10);
        arr.add(1,20);
        arr.add(2,30);
        arr.add(3,40);
        arr.add(4,50);
        arr.add(5,60);
        arr.add(6,70);

        // System.out.print(arr);// simple method to print the array list

        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");// second for loop method to print the array list
        }

        

    }

}
