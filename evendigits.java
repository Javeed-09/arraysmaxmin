import java.util.*;
public class evendigits {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int[] arr=new int[n];
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       } 
       for(int i=0;i<n;i++){
        if(arr[i]%2==0){
            int count=0;
            
            System.out.println(arr[i]);
            while(arr[i]>0){
                count++;
                arr[i]=arr[i]/10;
                 
            }
            
            System.out.println(arr[i]+"even digit"+count);
        }
        
       }
    }
    
}
