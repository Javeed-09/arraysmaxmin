import java.util.*;
public class a2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        char[] arr=name.toCharArray();
        System.out.println(arr);
        char a=sc.next().charAt(0);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==a){
                System.out.println(i);
                break;
            }
        }

    }
    
}
