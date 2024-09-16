package FilesLearn;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Buffer {
    public static void main(String[] args)throws IOException {
        File f = new File("./.sample.txt");
        if(!f.exists()){
            f.createNewFile();
        }
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        int i;
        while((i = br.read())!=-1){
            System.out.print((char)i);
        }
        fr.close();
        br.close();
    }
}
