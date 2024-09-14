package InterfaceConcepts;
interface Laptop{
    abstract public void copy();
    void paste();
    default void print(){
        System.out.println("Laptop");
    }
     static void display(){
        System.out.println("Laptop display");
    }
}
class Desktop implements Laptop{
    @Override
    public void copy(){
        System.out.println("Dektop copy features");
    }
    @Override
    public void paste(){
        System.out.println("Dektop paste features");
    }

}

public class InterfLearn1 {
    public static void main(String[] args) {
        Desktop l = new Desktop();
        l.copy();
        l.paste();
        l.print();
        Laptop.display();




    }
}
