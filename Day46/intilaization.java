package Day46;

public class intilaization {
    public static void main(String[] args) {
        int [][] arr={{1,2,3},{3,4,5}};

        for(int[] ele: arr){
            for(int x:ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
