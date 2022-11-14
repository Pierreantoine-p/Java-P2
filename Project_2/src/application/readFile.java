package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class readFile {


    private static String nameFile;

    public void addFile(String nameFile) {
        readFile.nameFile = nameFile;
    }

    /**
     * method
     * @param
     * @return
     */
    public ArrayList<String> read() {
        /**
         *
         */
        BufferedReader file;
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
        System.out.println(stringArray);

        return stringArray;
    }
}
