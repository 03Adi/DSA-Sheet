package Day46;
/// basically  for the second largest element in array-----------

public class secondlargest {
    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 9, 5};

int max = arr[0];

int Elemx = arr[0];

for (int i = 1; i < arr.length; i++) {

    if (arr[i] > max) {

       Elemx = max;

        max = arr[i];

    } else if (arr[i] >Elemx && arr[i] != max) {

        Elemx = arr[i];

    }

}
    }
}
