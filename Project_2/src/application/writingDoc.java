package application;

import java.io.*;
import java.util.Map;
import java.util.Properties;

public class writingDoc {

    public void write(Map<String, Integer> fileToWrite){
        try{
            //Create file
            File fileOut = new File("result.out");
            if (fileOut.createNewFile()) {
                System.out.println("create file: " + fileOut.getName());
            } else {
                System.out.println("File already exists.");
            }
            //Write in file
            BufferedWriter writingFile = new BufferedWriter(new FileWriter(fileOut));
            for (Map.Entry<String,Integer> entry : fileToWrite.entrySet()) {
                //Write key : value
                writingFile.write(entry.getKey() + ":"
                        + entry.getValue());
                //Add line
                writingFile.newLine();
            }
            //Write close
            writingFile.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

