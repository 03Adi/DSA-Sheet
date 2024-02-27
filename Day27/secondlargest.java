package Day27;

public class secondlargest {
    public static void main(String[] args) {
        int max=Integer.MIN_VALUE;/// for 1st largest value in an array--
        int[] arr={13,23,45,55,665,33,23,34};

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("1st largest value: "+max);

        int smax=Integer.MIN_VALUE;/// for 2nd largest value in an array---
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=max){// matlab ki 1st largest 2nd largest ke equal na ho paye---
                if(arr[i]>smax){
                    smax=arr[i];
                }
            }
        }
        System.out.println("2nd largest element is: "+smax);
    }
}
