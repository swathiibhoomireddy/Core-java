class A{
     protected int x=10;
    //System.out.println(x);
}
class B extends A{
    int y=20;
    //System.out.println("the value of y");
}
class C extends  B{
     int z=30;
    //System.out.println("the value of z"+z);
}
public class InheritLearn {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);

    }
}
