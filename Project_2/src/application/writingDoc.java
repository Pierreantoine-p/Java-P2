package application;

import java.io.*;
import java.util.Map;
import java.util.Properties;

public class writingDoc {

    /**
     *
     * @param fileToWrite
     */
    public void write(Map<String, Integer> fileToWrite){
        try{

            File fileOut = new File("result.out");
            if (fileOut.createNewFile()) {
                System.out.println("create file: " + fileOut.getName());
            } else {
                System.out.println("File already exists.");
            }

            BufferedWriter writingFile = new BufferedWriter(new FileWriter(fileOut));
            for (Map.Entry<String,Integer> entry : fileToWrite.entrySet()) {

                writingFile.write(entry.getKey() + ":"
                        + entry.getValue());

                writingFile.newLine();
            }

            writingFile.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

