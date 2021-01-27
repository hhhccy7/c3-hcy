

/*
给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的
相对顺序。
示例：
输入: [0,1,0,3,12]
输出: [1,3,12,0,0]


 *
附加题：（如果你已经通过自主学习了解了继承的概念，欢迎来挑战噢！）
请编码实现动物世界的继承关系∶
动物( Animal )具有属性：身高、体重；具有行为︰吃( eat )﹑睡觉( sleep )
动物包括︰兔子(Rabbit )、老虎( Tiger )
这些动物吃的行为各不相同（兔子吃草，老虎吃肉）但睡觉的行为是一致的。
 */
public class Task4 {
    public static void main(String[] args) {
        int[] nums = new int[]{0,1,0,3,12};
        moveZero(nums);
        for(int a : nums){
            System.out.println(a);
        }
    }
    public static void moveZero(int[] numbers){
        int pos=0;
        for (int i = 0; i < numbers.length; i++) {
            if(0 != numbers[i]){
                numbers[pos] = numbers[i];
                pos++;
            }
        }
        for (; pos < numbers.length; pos++) {
            numbers[pos] = 0;
        }
    }
}
