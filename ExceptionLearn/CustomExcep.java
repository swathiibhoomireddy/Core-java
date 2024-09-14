package ExceptionLearn;

class CustomException extends Exception {
   public CustomException(String s) {
     super(s);
    }
}
public class CustomExcep {
    public static void main(String[] args) {
        try {
            int age = 21;
            System.out.println("the age is" + age);
            while (age > 20) {
                System.out.println("the age is greater than 20");
                throw new CustomException("the age is greater than equal to 20");
            }
        }
        catch(CustomException e){
            System.out.println(e);
        }
        finally {
            System.out.println("finally");
        }


    }
}
