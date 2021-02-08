/**
 * copy from zyh
 */

public class Task5 {
    public static void main(String[] args) {
        Monkey monkey = new Monkey("啊吧啊吧");
        People people = new People();
        monkey.speak();
        people.speak();
        people.think();
    }
    static class Monkey{
        String s="";
        public Monkey(String s){
            this.s=s;}
        public Monkey(){}

        public void speak(){
            System.out.println("咿咿呀呀......");
        }
    }
    static class People extends Monkey {
        public People(String s) {
            super(s);
        }
        public People(){
            super();

        }
        public void speak(){
            System.out.println("小样的，不错嘛！会说话了！");

        }
        void think(){
            System.out.println("别说话！认真思考！");
        }
    }
}