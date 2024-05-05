package Day95;

public class sumo{
    public static void main(String arf[]){
        int n=10;
        int max=20;
        int suminrange=0;

        for(int i=n;i<=max;i++){
            suminrange=suminrange+i;
        }
        System.out.println(suminrange);
    }
}