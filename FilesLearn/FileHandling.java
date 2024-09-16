package FilesLearn;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class FileHandling {
    public static void main(String[] args)throws FileNotFoundException, IOException {
        File file = new File("C:\\Users\\jyoth\\OneDrive\\Desktop\\Reference\\MyLearning");
        System.out.println(file.listFiles());
        //System.out.println(file.createNewFile());
        //System.out.println(file.exists());
        //if(file.exists()){
          //  file.delete();
        //}
        //System.out.println(file.createNewFile());
        //System.out.println(file.canWrite());
        //System.out.println(file.delete());


    }
}
