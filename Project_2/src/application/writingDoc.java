package application;

import java.io.*;
import java.util.Map;
import java.util.Properties;

public class writingDoc {

    public void write(Map<String, Integer> fileToWritte){
        try{
            File fileOut = new File("result.out");
            if (fileOut.createNewFile()) {
                System.out.println("create file: " + fileOut.getName());
            } else {
                System.out.println("File already exists.");
            }

            Properties properties = new Properties();

            for (Map.Entry<String,Integer> entry : fileToWritte.entrySet()) {
                properties.put(entry.getKey(), entry.getValue());
                System.out.println("getKey" + entry.getKey());
                System.out.println("getValue" + entry.getValue());
                System.out.println("entry" + entry);
            }
            properties.store(new FileOutputStream("result.out"), null);
            System.out.println("properties" + properties);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

