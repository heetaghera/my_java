import java.util.*;
public class twoD_array {
    public static void max(int[][]arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++) {
                if (arr[i][j] > max) {
                    max=arr[i][j];
                }
            }
        }System.out.println("max = " + max);
    }
    public static void min(int[][]arr){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++) {
                if (arr[i][j] < min) {
                    min=arr[i][j];
                }
            }
        }System.out.println("min = " + min);
    }
    public static void search(int[][]arr,int key){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==key){
                    System.out.println("key is at"+"arr"+"["+i+"]"+"["+j+"]");
                }
            }
        }
        System.out.println();
    }
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr =new int[3][3];
        int n=arr.length;int m=arr[0].length;
        System.out.println("enter key");
        int key=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        for(int i=0; i<n;i++){
            for(int j=0; j<m;j++){
                System.out.println(arr[i][j]);
            }
        }
        search(arr,key);
        max(arr);
        min(arr);
    }
    }