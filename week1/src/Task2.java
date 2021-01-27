/*计算 1000 以内的水仙花数有多少个。所谓的“水仙花数”是指一个三位数其各位数字的
        立方和等于该数本身
        */

public class Task2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    if(Math.pow(i,3)+Math.pow(j,3)+Math.pow(k,3)==100*i+10*j+k){
                        System.out.println("水仙花数:"+i+j+k);
                    }
                }
            }
        }
    }
}
