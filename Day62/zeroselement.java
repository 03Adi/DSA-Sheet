package Day62;

public class zeroselement {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{3,0,5},{5,6,6}};
        int m=arr.length;
        int n=arr[0].length;
        int[][] helper=new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                helper[i][j]=arr[i][j];
            System.out.print(helper[i][j]+" ");  
            }    
            System.out.println();     
        }

        for (int i = 0; i <m; i++) {
            for (int j = 0; j <n; j++) {
                if(helper[i][j]==0){
                    for(int b=0;b<n;b++){// basically for make column element zeros
                    helper[i][b]=0;
                    }
                    for(int a=0;a<n;a++){// basically for make the row element zeros
                        helper[a][j]=0;
                    }
                    System.out.print(helper[i][j]+" ");
                }
            
                
            }
            
        }
       

    }
}
