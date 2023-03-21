import java.util.*;
public class array_percentage{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int[]arr=new int[5];
        arr[0]=sc.nextInt();
        arr[1]=sc.nextInt();
        arr[2]=sc.nextInt();
        arr[3]=sc.nextInt();
        arr[4]=sc.nextInt();

        System.out.println("math :"+arr[0]);
        System.out.println("physics :"+arr[1]);
        System.out.println("chemistry :"+arr[2]);
        System.out.println("computer :"+arr[3]);
        System.out.println("english :"+arr[4]);

        int percentage=(arr[0]+arr[1]+arr[2]+arr[3]+arr[4])/5;
        System.out.println("petcentage = "+percentage+"%");
    }
}
