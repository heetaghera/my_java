public class Getters_Setters {
    public static void main(String[]args){
        pencil p1=new pencil();
        p1.setColor("blue");
        System.out.println(p1.getColor());
        p1.setTip(10);
        System.out.println(p1.getTip());

    }
}
    class pencil{
        private String color;
        private int tip;

        String getColor(){
            return this.color;
        }
        void setColor(String newcolor){
            color = newcolor;
        }

        int getTip(){
            return this.tip;
        }
        void setTip(int newtip){
            tip = newtip;
        }
    }

