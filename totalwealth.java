import java.util.Arrays;
import java.util.Scanner;
public class totalwealth {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));
        for(int i=0;i<n;i++){
            int temp[][]=new int[n][m];
            for(int j=0;j<m;j++){
                
                temp[i][j]=arr[j][i];

            }
            System.out.println(Arrays.deepToString(temp));
            
        }

    }
    
}
