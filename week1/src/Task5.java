import java.util.Scanner;

/*
5. 定义一个 Circle 类，其中成员变量 radius 表示圆的半径，编写方法 getArea() 计
算圆的面积、getPerimeter()计算圆的周长，并在主函数中构造一个 Circle 的对象进行测
试。
示例：
输入：3
输出：the area is 28.26
 the perimeter is 18.84
 */
public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Circle c = new Circle(in.nextDouble());
        System.out.println("the area is"+c.getArea());
        System.out.println("the perimeter is"+c.getPerimeter());
    }
}
class Circle{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return 3.14*radius*radius;
    }

    public double getPerimeter(){
        return 3.14*2*radius;
    }
}