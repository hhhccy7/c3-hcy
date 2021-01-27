import java.util.Scanner;

/*
6. 编写一个银行账户类，类的构成包括：
数据成员：用户的账户名称、用户的账户余额;
方法包括：开户（设置账户名称及余额, 利用构造方法完成)；查询余额。
 */
public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("输入开户名:");
        String name =  in.nextLine();
        System.out.println("输入开户金额:");
        double money =  in.nextDouble();
        Account account = new Account(name,money);
        account.getMoney();
    }
}
class Account{
    String name;
    Double money;

    public Account(String name,Double money){
        this.money = money;
        this.name = name;
        System.out.println("开户"+name+"成功  金额:"+money);
    }
    public void getMoney(){
        System.out.println("查询余额:"+money);
    }
}