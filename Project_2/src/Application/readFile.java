package Application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class readFile {
    public static void main(String[] args) {
        BufferedReader file;
        try {
            file = new BufferedReader(new FileReader(
                    "symptoms.txt"));
            String line = file.readLine();
            while (line != null) {
                System.out.println(line);
                line = file.readLine();
            }
        } catch (IOException  e) {
            e.printStackTrace();
        }
    }
}
