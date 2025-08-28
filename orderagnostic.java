import java.util.*;
//it is arranged in descending order
public class orderagnostic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] rr={1,2,3,4,5,6,7,8,9};
        int start=0;
        int end=rr.length-1;
        boolean isasc;
        if(rr[start]>rr[end]){
            isasc=false;
        }
        else{
            isasc=true;
        }
        int target=9;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(rr[mid]==target){
                System.out.println("found"+mid);
                break;
            }
            if(isasc){
                if(rr[mid]<target){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            else{
                System.out.println("agnostic");
                if(rr[mid]<target){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            
        }
    }
    
}
