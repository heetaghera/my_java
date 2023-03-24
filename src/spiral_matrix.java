public class spiral_matrix {
    public static void spiral(int[][]arr ){
        int StartRow=0;
        int EndRow=arr.length-1;
        int StartCol=0;
        int EndCol=arr[0].length-1;
        while(StartRow<=EndRow && StartCol<=EndCol){

            for(int j=StartCol;j<=EndCol;j++){
                System.out.print(arr[StartRow][j]+" ");
            }
            for(int i=StartRow+1;i<=EndRow;i++){
                System.out.print(arr[i][EndCol]+" ");
            }
            for(int j=EndCol-1;j>=StartCol;j--){
                System.out.print(arr[EndRow][j]+" ");
            }
            for(int i=EndRow-1;i>=StartRow+1;i--){
                System.out.print(arr[i][StartCol]+" ");
            }

            StartRow++;
            EndRow--;
            StartCol++;
            EndCol--;
        }
        System.out.println();
    }
    public static void main(String[]args){
        int [][]arr={{1,2,3,4},
                     {5,6,7,8},
                     {9,10,11,12},
                     {13,14,15,16}};
        spiral(arr);
    }
}
