import java.util.*;
public class OddOrEven_bitmanipulation {
    public static void OddOrEven(){
        Scanner sc= new Scanner(System.in);
        int bitmask=1;
        int n=sc.nextInt();
        if((n & bitmask) ==0)
            System.out.println(n+" is even");
        else
            System.out.println(n+" is odd");
    }
    public static void main(String[]args){
        OddOrEven();
    }
}
