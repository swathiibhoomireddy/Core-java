package FilesLearn;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Read {
    public static void main(String[] args)throws IOException {
        File f = new File("./.sample.txt");
        if(f.exists()){
            System.out.println("File exists");
        }
        FileReader fr = new FileReader(f);
        int i;
        while((i = fr.read())!=-1){
            System.out.print((char)i);
        }
        fr.close();
    }
}


