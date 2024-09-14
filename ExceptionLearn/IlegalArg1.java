package ExceptionLearn;

public class IlegalArg1 {
    public static void main(String[] args) {
        try {


            Thread thread = new Thread();
            thread.setPriority(10);
            thread.setPriority(100);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
