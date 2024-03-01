package Day29;

//// Leetcode problem Two Sum----

public class twosum {
    public static void main(String[] args) {
        int[] arr={1,3,4,5,6,9};
        int x=9; // that is target value hai joo ki inhi issi array ki do values ka sum hai----
        int n=arr.length;

        for(int i=0;i<n;i++){// for first value
            for(int j=i+1;j<n;j++){//for second value
                if(arr[i]+arr[j]==x){
                    System.out.println(arr[i]+" "+arr[j]);
                    // break;
                }
            }
        }

    }
}
