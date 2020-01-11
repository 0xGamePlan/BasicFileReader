import java.io.*;
import java.util.*;

public class FileReader {

    public static void main(String[] args){
        try {
            File myFile = new File("textFilePathName");
            Scanner myScanner = new Scanner(myFile);
            while (myScanner.hasNext()) {
                String line = myScanner.nextLine();
                System.out.println(line);
            }
            myScanner.close();
        } catch (FileNotFoundException e){
            System.out.println("The file was not found!");
        }
    }
}
