public class subarray_Brute_Force {
        public static void maxsubarray(int[]nums) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < nums.length; i++) {
                for (int j = i; j < nums.length; j++) {
                    int sum = 0;
                    for (int k = i; k <= j; k++) {
//                    System.out.print(nums[k]+" ");
                        sum = sum + nums[k];
                    }
                    System.out.println("sum = " + sum);
                    if (max < sum) {
                        max = sum;
                    }
                }
                System.out.println();
            }
//            System.out.println();
            System.out.println("max =" + max);
        }

        public static void main(String[]args){
            int[]nums={2,4,6,8,10};
            maxsubarray(nums);
        }
}

