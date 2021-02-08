import java.util.Scanner;

/**
 * copy from wwn
 *  👆 逻辑有小问题，越界风险
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String s = in.next();
        System.out.print("其中的数字有：");
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                System.out.print(s.charAt(i));
            } else {
                while( i < s.length() && !(s.charAt(i) >= '0' && s.charAt(i) <= '9') ){
                    i++;
                }
                i--;
                if (i < s.length()-1)System.out.print(",");
            }
        }
    }
}