class Car2{
    public void move(){
        System.out.println("Car2.move");
    }

}
class Car3 extends Car2{
    @Override
    public void move(){
        System.out.println("Car3.move");
    }
}

public class Poly {
    public static void main(String[] args) {
        Car3 car = new Car3();
        car.move();

    }
}
