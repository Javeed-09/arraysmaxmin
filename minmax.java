import java.util.*;
public class minmax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int ans=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>ans){
                ans=arr[i];


            }
        
        }
        System.out.println(ans);
    }

    
}
