public class Task8 {
    public static void main(String[] args) {

    }
}

interface ganfan {
    void eat();
}

class Animal implements ganfan {
    double height, weight;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void eat() {
        System.out.println("干饭");
    }

    public void sleep() {
        System.out.println("睡觉");
    }
}

class Tiger extends Animal {
    @Override
    public void eat() {
        System.out.println("吃肉");
    }
}

class Rabbit extends Animal {
    @Override
    public void eat() {
        System.out.println("吃草");
    }
}