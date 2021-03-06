import sun.security.x509.CertificatePolicyMap;

import java.util.Scanner;

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


public class Task7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        Complex c1 = new Complex(a, b);

        a = in.nextInt();
        b = in.nextInt();
        Complex c2 = new Complex(a, b);
        System.out.println("add:" + c1.add(c2));
        System.out.println("reduce:" + c1.reduce(c2));
        System.out.println("multiple:" + c1.multiply(c2));
    }
}

class Complex {
    private int a, b;

    public Complex(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Complex add(Complex that) {
        return new Complex(this.a + that.a, this.b + that.b);
    }

    public Complex reduce(Complex that) {
        return new Complex(this.a - that.a, this.b - that.b);
    }

    public Complex multiply(Complex that) {
        return new Complex(this.a * that.a - this.b * that.b, this.a * that.b + this.b * that.a);
    }

    @Override
    public String toString() {
        if(a==0&&b==0) return "0";//实部虚部同为0时候 返回0
        String str ;
        //不同为0时
        if(a==0){
            return b+"i";
        }
        if(b==0){
            return a+"";
        }//使用三目运算符 表达式?a:b   了解使用，不用深入理解
        //此处在于给大家讲解toString方法的重写，并在作为String类型参数时候自动调用toString方法
        return a+(b>0?"+":"")+(b==1?"":(b==-1?"-":b))+"i";
    }
}
