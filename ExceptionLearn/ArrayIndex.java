package ExceptionLearn;

public class ArrayIndex {

        public static void main(String[] args) {
            try {

                int[] x = new int[10];
                //System.out.println(x[0]);
                System.out.println(x[100]);
            }
            catch(ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }



        }



}
