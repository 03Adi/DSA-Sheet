package Day42;

public class mergearray {
    public static void main(String[] args) {
        // // baisically using merge sort method to sort the array-------

        int[] a={11,23,33,45,65};
        int[] b={26,54,63,62,81,94};
        int[] c=new int[a.length+b.length];
        int i=0,j=0;k=0;

        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                c[k]=a[i];
                i++;
                k++;

            }
            else{
                c[k]=b[i];
                j++;
            }
            k++;

        }


    }
}
