import java.util.Scanner;

/**
 * copy from wwn
 */
public class Task4 {
    static class Game{
        private int v = 100;
        private int number;
        public void guess() {
            System.out.println("欢迎来到猜字游戏，请输入一个数：");
            do {
                Scanner in = new Scanner(System.in);
                number = in.nextInt();
                if (number > v) {
                    System.out.println("猜大了奥，再试一下吧！");
                }
                else if (number < v) {
                    System.out.println("猜的有点小，再试一下吧！");
                }
                else {
                    System.out.println("恭喜你，猜对了！");
                }
            } while (number != 100);
        }
    }
    public static void main(String[] args) {
        Game game = new Game();
        game.guess();
    }
}