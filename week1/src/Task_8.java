/*

7. 声明并测试一个复数类，其中包括 add()、reduce()、multiply()三种方法，分别实现两
个复数的相加、相减、相乘，然后输出计算的结果。
示例：（第一行输入两个数字分别表示第一个复数的实部和虚部、第二行输入的两个数字表
示第二个复数的实部和虚部）
输入：
2 3
1 2
输出：
两复数相加的结果为：3+5i
两复数相减的结果为：1+i
两复数相乘的结果为：-4+7i
 */

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Complex c1 = new Complex(in.nextInt(),in.nextInt());
        Complex c2 = new Complex(in.nextInt(),in.nextInt());

        for (int i = 0; i <1 ; i++) {
            int a=0;
        }
        System.out.println(c1.add(c2));
        System.out.println(c1.reduce(c2));
        System.out.println(c1.multiply(c2));
    }

}
