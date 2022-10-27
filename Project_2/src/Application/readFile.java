package Application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class readFile {
    public static void main(String[] args) {
        BufferedReader symptoms;
        try {
            symptoms = new BufferedReader(new FileReader(
                    "symptoms.txt"));
            String line = symptoms.readLine();
            while (line != null) {
                System.out.println(line);
                line = symptoms.readLine();
            }
        } catch (IOException  e) {
            e.printStackTrace();
        }
    }
}
