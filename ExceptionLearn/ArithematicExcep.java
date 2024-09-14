package ExceptionLearn;

public class ArithematicExcep {
    public static void main(String[] args) {
        try{
            int a = 17/0;
            System.out.println(a);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
            System.out.println(e);
            System.out.println(e.toString());
        }
    }
}
