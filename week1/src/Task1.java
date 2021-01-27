import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("输入体重(kg):");
        double weight = in.nextDouble();

        System.out.println("输入身高(m):");
        double height = in.nextDouble();

        double BMI = weight/height/height;
        System.out.println(BMI);
        if(BMI<18.5){
            System.out.println("过轻");
        }else if(BMI<25){
            System.out.println("正常");
        }else if(BMI<28){
            System.out.println("过重");
        }else {
            System.out.println("肥胖");
        }
    }
}
