package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class readFile {

    //Name file who need read
    private static String nameFile;
    //Add file who need read in method read
    public void addFile(String nameFile) {
        readFile.nameFile = nameFile;
    }

    public ArrayList<String> read() {
        BufferedReader file;
        //Read line file
        ArrayList<String> stringArray = new ArrayList<>();
        try {
            file = new BufferedReader(new FileReader(
                    nameFile));
            String line = file.readLine();
            while (line != null) {
                line = file.readLine();
                stringArray.add(line);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringArray;
    }
}
