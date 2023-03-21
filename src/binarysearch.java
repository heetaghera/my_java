import java.util.*;

public class binarysearch {
    public static int binsearch(int nums[],int key){
        int start=0,end= nums.length-1;

        while(start<=end){
            int mid= (start+end)/2;

            if(nums[mid]==key) {
                return mid;
            }
                if(nums[mid]<key){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
        }
        return -1;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int nums[]={2,3,6,5,9};
        int key=sc.nextInt();
        int ans=binsearch(nums,key);

        if (ans>-1) {
            System.out.println("index of the key is : "+ans);
        }
        else{
            System.out.println("NOT FOUND");
        }
    }
}


