import java.util.Arrays;
import java.util.Collections;

public class inbuiltsort {
    public static void printarray(Integer arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[]args){
       Integer arr[]={5,4,1,3,2};
        //Arrays.sort(arr);
        //Arrays.sort(arr,0,3);//here,ending index is nonexclusive,in this ex. it sort (0to2) index
        //Arrays.sort(arr,Collections.reverseOrder());
        Arrays.sort(arr,0,4,Collections.reverseOrder());
        printarray(arr);
    }
}
