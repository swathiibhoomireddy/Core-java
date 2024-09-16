package FilesLearn;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileOperations {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\jyoth\\OneDrive\\Desktop\\TestFiles\\sample.txt");
        if (!f.exists()) {
            f.createNewFile();

        }
        FileInputStream fis = new FileInputStream(f);
        int i;
        while((i= fis.read())!=-1) {
            System.out.print((char) i);
        }
        fis.close();
        //System.out.println("File created: " + f.getAbsolutePath());

    }
}
