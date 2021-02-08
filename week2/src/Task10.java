import java.util.ArrayList;
import java.util.List;

interface Usb{
    public void turnOn();
    public void turnOff();
}
class Mouse implements Usb{
    @Override
    public void turnOn() {
        System.out.println("鼠标启动了");
    }

    @Override
    public void turnOff() {
        System.out.println("鼠标关闭了");
    }
}
class Keyboard implements Usb{
    @Override
    public void turnOn() {
        System.out.println("键盘启动了");
    }

    @Override
    public void turnOff() {
        System.out.println("键盘关闭了");
    }
}
class Microphone implements Usb{
    @Override
    public void turnOn() {
        System.out.println("麦克风启动了");
    }

    @Override
    public void turnOff() {
        System.out.println("麦克风关闭了");
    }
}
class Computer{
    // 将 Usb插槽定义成 集合类（数组也可以）
    List<Usb> usbs = new ArrayList<>();
    // 安装USB设备
    public void add(Usb usb)
    {
        usbs.add(usb);
    }

    /**
     * 卸载USB设备 可写可不写
     */

    public void powerOn()
    {
        System.out.println("电脑开机成功");
        for (Usb a : usbs) {
            a.turnOn();
        }
    }
    public void powerOff()
    {
        for(Usb a : usbs){
            a.turnOff();
        }
        System.out.println("电脑关机成功");
    }

}
public class Task10 {
    public static void main(String[] args) {
        Computer c=new Computer();
        c.add(new Mouse());
        c.add(new Keyboard());
        c.add(new Microphone());
        c.powerOn();
        System.out.println("-----------------");
        c.powerOff();
    }
}