public class bubblesort {

    public static void sort(int nums[]) {
        int temp = 0;
        int swap = 0;
        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] > nums[i + 1]) {
                temp = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = temp;
                swap++;
            }
        }

            if (swap == 0) {
                System.out.println("array is salready sorted");
            } else {

                for (int i = 0; i < nums.length - 1; i++) {
                    for (int j = 0; j < nums.length - 1; j++) {
                        if (nums[j] > nums[j + 1]) {
                            temp = nums[j];
                            nums[j] = nums[j + 1];
                            nums[j + 1] = temp;
                        }
                    }
                }
                System.out.println("array is not sorted");

        }
    }
    public static void printarray(int nums[]){
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
    public static void main(String args[]){
        int nums[]={1,2,3,4,5};
        sort(nums);
        printarray(nums);
    }
}
