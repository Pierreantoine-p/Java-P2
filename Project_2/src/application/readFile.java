package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class readFile {

    //Name file who need read
    private static String nameFile;
    //Add file who need read in method read
    public void addFile(String nameFile) {
        readFile.nameFile = nameFile;
    }

    public List<String> read() {
        BufferedReader file;
    //Create list
        List<String> stringArray = null;
    //Read line file
        try {
            file = new BufferedReader(new FileReader(
                    nameFile));
            String line = file.readLine();
            StringBuilder builder = new StringBuilder();
            stringArray = new ArrayList<>();
            while (line != null) {
                builder.append(line).append("\n");
                line = file.readLine();
            }
    //Add line in list
            String str = builder.toString();
            stringArray.add(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringArray;
    }
}
