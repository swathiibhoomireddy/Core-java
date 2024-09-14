package ExceptionLearn;

public class NullPointerExcep {
    public static void main(String[] args) {
        try{
            String str = "sai";
            System.out.println(str.length());
        }
        catch(NullPointerException e){
            System.out.println(e);
        }
    }
}
