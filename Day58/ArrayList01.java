package Day58;
import java.util.*;
public class ArrayList01 {
    public static void main(String[] args) {
        List<Integer> arr=new ArrayList<>();
        arr.add(10);arr.add(20);arr.add(30);

        List<Integer> arr1=new ArrayList<>();
        arr1.add(40);arr1.add(50);

        List<Integer> arr2=new ArrayList<>();
        arr2.add(60);

        List<List<Integer>> store=new ArrayList<>();// basically is used to store the 2 array and multiple aray at a same time
        store.add(arr);
        store.add(arr1);
        store.add(arr2);

        // this loop is print the full length of l name of array
        for (int i = 0; i < store.size(); i++) {
            System.out.println(store.get(i));
        }
                    // print and get specific no of array element then we use this technique---

        //   System.out.print(store.get(1).get(2));          
    }
}
