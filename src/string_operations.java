public class string_operations {
//    code for compare strings
    public static void compare(){
        String s1="heet";
        String s2="heet";
        String s3=new String("heet");

        if(s1==s2){
            System.out.println("s1 and s2 are same");
        }
        else{
            System.out.println("s1 and s2 are not same");
        }

        if(s1==s3){
            System.out.println("s1 and s3 are same");
        }
        else{
            System.out.println("s1 and s3 are not same");
        }

        if(s1.equals(s3)){
            System.out.println("s1 and s3 are same");
        }
        else{
            System.out.println("s1 and s2 are same");
        }
    }

    //code for find the shortest direction of path
    public static float path(String path){
        int x=0;
        int y=0;
        for(int i=0;i<path.length();i++){
            int dir=path.charAt(i);
            if(dir=='N'){
               y++;
            }
            else if(dir=='S'){
                y--;
            }
           else if(dir=='E'){
                x++;
            }
           else {
                x--;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return((float)Math.sqrt(x2+y2));
    }
    public static void main(String[]args){
        String path="WNEENESENNN";
        System.out.println(path(path));
        System.out.println(path.substring(0,5));
        compare();
    }
}
