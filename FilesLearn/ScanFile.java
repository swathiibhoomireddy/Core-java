package FilesLearn;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ScanFile {
    public static void main(String[] args)throws IOException {
        File f = new File("./.sample.txt");
        if(f.exists()){
            System.out.println("File exists");
        }
        Scanner sc = new Scanner(f);
        while(sc.hasNextLine()){
            System.out.print(sc.nextLine());
        }
    }
}
