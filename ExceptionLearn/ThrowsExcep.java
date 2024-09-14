package ExceptionLearn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsExcep {
    public static void checkAge(int age) throws ArithmeticException {
        if (age < 18){
            System.out.println("You are older than 18 years old");
            throw new ArithmeticException("/ by zero");
        }
        else{
            System.out.println("You are elder than 18 years old");
        }
    }
    public static void main(String[] args) throws ArithmeticException, InterruptedException {
        checkAge(15);
        //Thread.sleep(1000);
        //System.out.println("Hello World");


    }
}
