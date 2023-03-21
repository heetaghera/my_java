public class reversearray {
    public static void revarray(int nums[]){
        int n=nums.length;
        System.out.println(n);
        for(int i=n-1;i<=0;i++){
            int temp=nums[i];
            nums[i]=nums[n-i];
            nums[n-i]=temp;
        }
        System.out.println("reversed array :" );
        for(int i=0;i<n;i++) {
            System.out.println(nums[i]);
        }
    }
    public static void main(String args[]){
        int nums[]={1,2,3,4,5};
       revarray(nums);
    }
}

/* temporary closed because there are some problems in this
code anderror of ARRAY INDEX OUT OF BOUND EXCEPTION IN JAVA
 */