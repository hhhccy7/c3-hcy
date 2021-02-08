
import java.util.Scanner;

/**
 * copy from wwn
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("请输入n*n矩阵中n的值(n >= 2)：");
        int n = in.nextInt();
        int[][] a = new int[n][n];
        System.out.println("请按照每一行由左到右的顺序输入数字：");
        for ( int i = 0; i < n; i++ ) {
            for ( int j = 0; j < n; j++ ) {
                a[i][j] = in.nextInt();
            }
        }
        int[][] b = new int[n][n];
        for ( int i = 0; i < n; i++ ) {
            for ( int j = 0; j < n; j++ ) {
                b[j][n - 1 - i] = a[i][j];
            }
        }
        System.out.println("旋转后结果为：");
        for ( int i = 0; i < n; i++ ) {
            for ( int j = 0; j < n; j++ ) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}