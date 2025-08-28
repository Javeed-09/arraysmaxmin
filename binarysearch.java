import java.util.*;
public class binarysearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int star=0;
        int end=arr.length-1;
        int target=sc.nextInt();
        while(star<=end){
            int mid=(star+end)/2;
            if(arr[mid]==target){
                System.out.println("found"+" "+mid);
                break;
            }
            else if(arr[mid]<target){
                star=mid+1;
            }
            else{
                end=mid-1;
            }

        }
        int[] ar={6,5,4,3,2,19};
        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));

    }
    
}

