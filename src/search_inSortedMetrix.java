import java.util.*;
public class search_inSortedMetrix {
    public static void search(int [][]arr, int key){
        int i=0,j=arr.length-1;
        while(i<arr.length && j>=0){
            if(arr[i][j]==key){
                System.out.println(i + ","+j);
                return;
            }
            else if(key<arr[i][j]){
                j--;
            }
            else {
                i++;
            }
        }
        System.out.println("key is not found");
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the element for search");
        int key=sc.nextInt();
        int [][]arr={{1,2,3},
                {4,5,6},
                {7,8,9}};
        search(arr,key);
    }
}
