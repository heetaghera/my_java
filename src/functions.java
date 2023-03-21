import java.util.*;

public class functions {
    public static int btd(int n){
        int pow=0;
        int b=0;
        int d=n;

        while(n>0){
            int rem=n%2;
            b=b+(rem*(int)Math.pow(10,pow));

            pow++;
            n=n/2;
        }

        return b;
    }

    public static void main(String args[]){
         int heet = btd(6);
         System.out.print(heet);
    }
}
