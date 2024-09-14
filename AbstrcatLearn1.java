abstract class Laptop{
    abstract public void copy();
    abstract public void paste();
    abstract public void display();

    public void print(){
        System.out.println("this is a laptop");
    }
    public void security(){
        System.out.println("provides security");
    }

}
abstract class HPLaptop extends Laptop{
    public void copy(){
        System.out.println("this is a hplaptop");
    }
    public void paste(){
        System.out.println("this is a hplaptop features");

    }
    abstract public void display();
}
class Lenovo extends HPLaptop{
    public void display(){
        System.out.println("this is a lenovo");
    }
}
public class AbstrcatLearn1 {
    public static void main(String[] args) {
       // HPLaptop hpl = new HPLaptop();
        //hpl.copy();
        //hpl.paste();
        //hpl.print();
        //hpl.security();
        Lenovo lenovo = new Lenovo();
        lenovo.copy();
        lenovo.paste();
        lenovo.display();
        lenovo.print();
        lenovo.security();





    }
}
