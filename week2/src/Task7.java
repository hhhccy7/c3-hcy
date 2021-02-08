public class Task7 {
    public static abstract class Poultry{
        private  String name;
        protected String symptom;
        private int age;
        private String illness;
        public Poultry(){}

        public Poultry(String name, String symptom, int age, String illness) {
            this.name = name;
            this.symptom = symptom;
            this.age = age;
            this.illness = illness;
        }
        public abstract void showSymptom();
        public  void showMsg(){
            System.out.println("动物种类:"+name+"，年龄:"+age+"岁");
            System.out.println("入院原因:"+illness);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSymptom() {
            return symptom;
        }

        public void setSymptom(String symptom) {
            this.symptom = symptom;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getIllness() {
            return illness;
        }

        public void setIllness(String illness) {
            this.illness = illness;
        }
    }
    public static class Duck extends Poultry{
        public Duck() {
        }

        public Duck(String name, String symptom, int age, String illness) {
            super(name, symptom, age, illness);
        }
        @Override
        public  void showSymptom(){
            System.out.println("症状为:"+symptom);
        }
    }

    public static void main(String[] args) {
        Duck duck = new Duck("鸭子","发烧",2,"感冒");
        duck.showMsg();
        duck.showSymptom();
    }

}