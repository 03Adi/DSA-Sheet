package Day58;

public class Spiralmatrix {
    public static void print(int[][] arr){
        int m=arr.length;
        int n=arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
            
        }
        System.out.println();

    }
    
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25},{26,27,28,29,30}};
        print(arr);
        int m=arr.length;
        int n=arr[0].length;

        int minr=0; int maxr=m-1;
        int minc=0; int maxc=n-1;

        while(minr<=maxr && minc<=maxc){
            for(int j=minc;j<=maxc;j++){
                System.out.print(arr[minr][j]+" ");
            }
            minr++;

            if(minr>maxr || minc>maxc)break;
            for(int i=minr;i<=maxr;i++){
                System.out.print(arr[i][maxc]+" ");
            }maxc--;

            if(minr>maxr || minc>maxc)break;
            for(int j=maxc;j>=minc;j--){
                System.out.print(arr[maxr][j]+" ");
            }maxr--;

            if(minr>maxr || minc>maxc)break;
            for(int i=maxr;i>=minr;i--){
               System.out.print(arr[i][minc]+" ");
            }minc++;
        }
        
    }
}
