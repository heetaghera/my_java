public class KADANES {
    public static void Kadanes(int[] nums){
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            if(sum<0){
                sum=0;
            }
            max=Math.max(sum,max);
        }
        System.out.print("max= "+max);
    }

    public static void main(String[] args){
        int[]nums={-2,-3,4,-1,-2,1,5,-3};
        Kadanes(nums);
    }
}
