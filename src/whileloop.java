public class whileloop {
    public static void check(int nums[]){
        int i=0;
        for(i=0;i<nums.length;i++) {
            while (i<6){
                System.out.println("while is used");
                i++;
            };
            System.out.println("here is check");
        }
    }

    public static void main(String args[]){
        int nums[]={1,2,3,4,5};
        check(nums
        );
    }
}
