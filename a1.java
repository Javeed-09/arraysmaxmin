
    import java.util.*;
    public class a1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println(Arrays.toString(arr));
        System.out.println("enter your target");
        int target=sc.nextInt();
        for(int index=0;index<arr.length;index++){
            if(arr[index]==target){
                System.out.println(index);
            }
        }
        if()
        

    }
    
}


