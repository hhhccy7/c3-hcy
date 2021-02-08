/**
 * copy from zyh
 */

public class Task6 {
    public static void main(String[] args) {
        Car car =new Car(4,1150.0);
        Truck truck = new Truck(6,15000.0);
        car.getWheels();
        car.getWeight();
        car.setLoader(6);
        car.getLoader();
        System.out.println("------------------");
        truck.getWheels();
        truck.getWeight();
        truck.setLoader(1);
        truck.getLoader();
        truck.setPayload(7000.0);
        truck.getPayload();
    }

    public static class Car extends Vehicle {
        int loader;
        public Car(int wheels, double weight){
            super(wheels,weight);
        }
        public void getLoader() {
            if(loader<=5){
                System.out.println("这是一辆小车，能载5人，实载"+loader+"人");
            }
            else{
                System.out.println("这是一辆小车，能载5人，实载"+loader+"人,你超员了！");}
        }

        public void setLoader(int loader) {
            this.loader = loader;
        }
    }

    public static class Truck extends Vehicle {
        int loader;
        double payload;
        public Truck(int wheels, double weight){
            super(wheels,weight);
        }
        public void getLoader() {
            if(loader<=3){
                System.out.println("这是一辆卡车，能载3人，实载"+loader+"人");
            }
            else{
                System.out.println("这是一辆卡车，能载3人，实载"+loader+"人,你超员了！");}
        }

        public void setLoader(int loader) {
            this.loader = loader;
        }

        public void getPayload() {
            if(payload<=5000.0){
                System.out.println("这是一辆卡车，核载5000kg，你已装载"+payload+"kg");
            }
            else{
                System.out.println("这是一辆卡车，核载5000kg，你已装载"+payload+"kg,你超载了！");}
        }

        public void setPayload(double payload) {
            this.payload = payload;
        }
    }

    public static class Vehicle {
        int wheels;
        double weight;
        public Vehicle(){

        }
        public Vehicle(int wheels, double weight){
            this.wheels = wheels;
            this.weight = weight;
        }
        public void getWheels() {
            System.out.print("车轮的个数是："+wheels);
        }

        public void getWeight() {
            System.out.println(" 车重："+weight);
        }

        public void setWheels(int wheels) {
            this.wheels = wheels;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }
    }
}