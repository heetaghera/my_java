public class subarray_max_min {
    public static void printsubarray(int[]nums){
        int max=0,min=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
//                    System.out.print(nums[k]+" ");
                    sum=sum+nums[k];
                    }System.out.println("sum = "+sum);
                     if(max<sum){
                        max=sum;
                     }
                     if(min>sum){
                        min=sum;
                     }
                }
                System.out.println();
            }
//            System.out.println();
        System.out.println("max ="+ max);
        System.out.println("min ="+ min);
    }

    public static void main(String[]args){
        int[]nums={2,4,6,8,10};
        printsubarray(nums);
    }
}

