public class array {

    public static void update(int marks[], int changable) {
        System.out.println("after change");
        changable= 10;

        System.out.println("after change");
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }


    }

    public static void main(String args[]) {

        int marks[]=new int[5];
            marks[0] =0;
            marks[1] =1;
            marks[2] =2;
            marks[3] =3;
            marks[4] =4;

         int changable= 5;
        System.out.println("before change");
        System.out.println(changable);
        update(marks, changable);
        System.out.println(changable);
        System.out.println("before change");
        for(int i=0;i<marks.length;i++) {
            System.out.println(marks[i]);
        }
    }
}
