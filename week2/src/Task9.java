interface Universe{
    public abstract void doAnything();
}

class Star{

    public void shine() {
        System.out.println("star:星光一闪一闪亮晶晶");
    }
}

class Sun extends Star implements Universe{

    @Override
    public void shine() {
        System.out.println("sun:光照8分钟到达地球");
    }

    @Override
    public void doAnything() {
        System.out.println("sun:太阳吸引着9大行星旋转");
    }
}
public class Task9 {
    public static void main(String[] args) {
        Star star = new Star();
        star.shine();
        Universe sun = new Sun();
        sun.doAnything();
        Sun sun1 = (Sun) sun;
        sun1.shine();
    }
}