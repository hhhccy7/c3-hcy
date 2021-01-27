import java.util.Scanner;

/*
编写一个函数，其作用是将输入的字符串反转过来。
*/
public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();

        System.out.println(reverse(str));
    }
    public static String reverse(String s){
        String[] ss = s.split("");
        return new StringBuffer(s).reverse().toString();
    }

}
