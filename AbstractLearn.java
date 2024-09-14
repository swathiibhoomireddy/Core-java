abstract class Car{
   abstract public void speed();
   public void wheels(){
       System.out.println("wheels");
   }

}
class Tesla extends Car{
    public void speed(){
        System.out.println("Tesla");

    }
    public void wheels(){
        System.out.println("four wheels");
    }

}
public class AbstractLearn {
    public static void main(String[] args) {
        Tesla tesla = new Tesla();
        tesla.speed();
        tesla.wheels();
    }


}
