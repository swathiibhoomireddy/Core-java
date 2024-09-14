package ExceptionLearn;

public class IllegalArg {
    public static void main(String[] args) {
        test(7);
        //test(100);

    }
    public static void test(int a) {
        if(a<10 && a>20){
            throw new IllegalArgumentException("JSJKS");
        }
        else{
            System.out.println(a);
        }
    }
}
