import java.util.*;
public class searchinrange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int start=sc.nextInt();
        int end=sc.nextInt();
        String name=sc.next();
        char[] arr=name.toCharArray();
        char  target=sc.next().charAt(0);
        for(int index=start;index<end;index++){
            if(arr[index]==target){
                System.out.println(index);
            }
        }
        
        
    }
    
}
