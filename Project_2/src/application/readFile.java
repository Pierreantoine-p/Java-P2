package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class readFile {

    private static String nameFile;

    public void addFile(String nameFile) {
        readFile.nameFile = nameFile;
    }

    public List<String> read() {
        BufferedReader file;

        List<String> stringArray = null;
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
            String str = builder.toString();
            stringArray.add(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringArray;
    }
}
