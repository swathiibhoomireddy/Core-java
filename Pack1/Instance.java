package Pack1;
 class Inst {
    //static int x=10;
    static int y = 90;

    public static void methodName() {
        System.out.println(y);

    }
}
public class Instance {

    public static void main(String[] args) {
        int x=10;
        System.out.println(x);
        //Inst inst = new Inst();
         Inst.methodName();
       // System.out.println(y);
    }
}
