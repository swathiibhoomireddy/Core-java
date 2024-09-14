@FunctionalInterface
interface Car1{
    void drive();

}


public class FunctioInter {
    public static void main(String[] args) {
        Car1 car = new Car1() {
            public void drive() {
                System.out.println("Car drive");
            }
        };
        car.drive();
    }
}
