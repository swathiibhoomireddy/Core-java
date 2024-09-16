package FilesLearn;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args)throws IOException {
        File f = new File("./.sample.txt");
        if(!f.exists()){
            f.delete();
        }
        f.createNewFile();
        String s = "hello";
        FileOutputStream fos = new FileOutputStream(f);
        for(char i:s.toCharArray()){
            fos.write(i);
        }

        fos.close();
    }
}
