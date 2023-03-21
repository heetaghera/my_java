import java.util.*;
public class linear_search {
public static int linear(int nums[],int key){
    for(int i=0;i<nums.length;i++){
        if(nums[i]==key)

        return i;
    }
        return -1;
}
public static void main(String[]args){
    Scanner sc =new Scanner(System.in);
    int nums[]={1,2,3,4,5,6,7,8,9,10};
    int key= sc.nextInt();
    int index=linear(nums,key);
    if(index==-1)
        System.out.println("key is not found");
    else
        System.out.println("index of key="+index);
}
}
