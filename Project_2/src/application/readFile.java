package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class readFile {

    private String nameFile;

    public void addFile(String nameFile) {
        this.nameFile = nameFile;
    }

    public void read() {
        BufferedReader file;

        try {
            file = new BufferedReader(new FileReader(
                    nameFile));
            String line = file.readLine();

            while (line != null) {
                System.out.println(line);
                line = file.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
