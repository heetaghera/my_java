public class selectionsort {

    public static void sort(int nums[]) {
       int k=7;
        for (int i = 0; i < nums.length; i++) {
            int minpos= i;
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[minpos]>nums[j]){
                    minpos=j;
                }
            }
            int temp=nums[minpos];
            nums[minpos]=nums[i];
            nums[i]=temp;
        }
    }

    public static void printarray(int nums[]){
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
//            System.out.println("k = "k);
        }
    }

    public static void main(String args[]){
        int k=5;
        int nums[]={5,4,1,3,2};
        sort(nums);
        printarray(nums);
    }
}
