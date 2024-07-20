public class Main {
    public static void main(String[] args) {
        Bicycle bicycle1 = new Bicycle("bicycle1",2);
        Bicycle bicycle2 = new Bicycle("bicycle2",2);
        Car car1 = new Car("car1",4);
        Car car2 = new Car("car2",4);
        Truck truck1 = new Truck("track1",6);
        Truck truck2 = new Truck("track1",8);
        bicycle1.updateTyre();
        car1.updateTyre();
        truck1.updateTyre();
        bicycle1.checkEngine();
        car1.checkEngine();
        truck1.checkEngine();
        System.out.println();
        car1.check(car1);
        bicycle1.check(bicycle1);
     }
}