package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class readFile {

    //Name file read
    private static String nameFile;
    //Method add name file  read
    public void addFile(String nameFile) {
        readFile.nameFile = nameFile;
    }

    public ArrayList<String> read() {
        BufferedReader file;

        ArrayList<String> stringArray = new ArrayList<>();
        try {
            // Path file read
            file = new BufferedReader(new FileReader(
                    nameFile));
            // init method read file
            String line = file.readLine();
            while (line != null) {
                //Read line file
                line = file.readLine();
                //Add line in stringArray
                stringArray.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringArray;
    }
}