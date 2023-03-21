public class Operation_Bitmanipulation {
    public static int GETIthbit(int n,int i){
        int bitmask= 1<<i;
        if((n & bitmask)==0) {
            return 0;
        }else {
            return 1;
        }
    }

    public static int SETIthbit(int n,int i){
        int bitmask= 1<<i;
        return (n | bitmask);
    }

    public static int CLEARIthbit(int n,int i){
        int bitmask = ~(1<<i);
        return (n & bitmask);
    }

    public static int UPDATEIthbit(int n,int i,int newbit){
        // 1ST METOD :-
        if (newbit==0) {
            return CLEARIthbit(n, i);
        }else{
              return SETIthbit(n,i);
        }
        //2ND METHOD:-
//        CLEARIthbit(n,i);
//        int bitmask=newbit<<i;
//        return n|bitmask;
    }

    public static int CLEARLAST_Ibits(int n,int i){
        int bitmask=(~0)<<i;
        return n & bitmask;
    }
    public static int CLEARLAST_Ibits(int n,int i,int j){
        int a=(~0)<<j+1;
        int b=(1<<i)-1;
        int bitmask=a|b;
        return n & bitmask;
    }
    public static boolean isPowerOfTwo(int n){
        return(n & (n-1))==0;
    }

    public static int CountSetbits(int n){  //here set bit means 1 (so, count bit 1 in number)
        int count=0;
        while(n>0){
            if((n&1)!=0){
               count++;
            }
            n=n>>1;
        }
        return count;
    }

    public static int FastExpo(int a,int n){  //to find a^n
        int ans=1;
        while(n>0){
            if((n&1)==1){
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }
    public static void main(String[]args){
        System.out.println(GETIthbit(10,2));
        System.out.println(SETIthbit(10,2));
        System.out.println(CLEARIthbit(10,2));
        System.out.println(UPDATEIthbit(10,2,1));
        System.out.println(CLEARLAST_Ibits(15,2));
        System.out.println(CLEARLAST_Ibits(10,2,4));
        System.out.println(isPowerOfTwo(8 ));
        System.out.println(CountSetbits(10));
        System.out.println(FastExpo(5,3));
    }
}