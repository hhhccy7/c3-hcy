public class Task8 {
    public static abstract class A{
        public int numa=10;
        public abstract void showA();
    }
    public static abstract class B extends A{
        public int numb=20;
        public abstract void showB();
    }
    public static class C extends B{
        public int numc=30;
        public void showB(){
            System.out.println("B类中numb："+numb);
        }
        public void showA(){
            System.out.println("A类中numa："+numa);
        }
        public void showC(){
            System.out.println("C类中numc："+numc);
        }
    }

    public static void main(String[] args) {
        C c=new C();
        c.showA();
        c.showB();
        c.showC();
    }
}