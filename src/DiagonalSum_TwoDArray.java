public class DiagonalSum_TwoDArray {
    public static void basicmethod(int[][] arr) {    //here we are calculate the sum of primary and secondary both diagonal's element
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    sum += arr[i][j];
                } else if (i + j == arr.length - 1) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("sum = " + sum);
    }

    public static void optimize_method(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int j = arr.length - 1 - i;
            sum += arr[i][i];
            if (i != j) {
                sum += arr[i][j];
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        basicmethod(arr);
        optimize_method(arr);
    }
}