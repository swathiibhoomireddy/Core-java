package ExceptionLearn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FilenotFoundExcep {
    public static void main(String[] args) {
        try{
            File f = new File("");
            FileInputStream fp = new FileInputStream(f);
            fp.read();

        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
