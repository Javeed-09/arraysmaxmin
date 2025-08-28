import java.util.*;
public class searchin2Darray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("2d array");
         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.println(arr[i][j]+" ");

            }
            System.out.println();
        }
        int target=sc.nextInt();
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==target){
                    System.out.println(i+" "+j);
                }
            }
        }
        
    }
    
}
