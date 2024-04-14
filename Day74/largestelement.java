package Day74;

public class largestelement {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int n=arr.length;
        int max=arr[0];//max element ko array ki 0 indexing ke sath initilize kr dete hain
        
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("Largest element of an array: "+max);

    }
}
