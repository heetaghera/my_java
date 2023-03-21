public class practice_while {
    public static void main(String[]argsg){
        int arr[]={1,2,3,4,5};
        int num[]={1,2,3,4,5};
        int i=0;
        while(arr[i]<5) {
            while (arr[i] < 2) {
                System.out.println(arr[i]);
                i++;
                System.out.println("while 1");
            }
            while (num[i] < 3) {
                System.out.println(arr[i]);
                i++;
                System.out.println("while 2");
            }
            if(arr[i]<2){
                System.out.println(arr[i]);
                i++;
                System.out.println("if here");
            }
        }
    }

}
