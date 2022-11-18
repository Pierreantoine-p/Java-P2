package application;

import Interface.ISymptomReader;
import Interface.ISymptomWrite;

import java.io.*;
import java.util.Map;

public class WriteSymptomDataFromCount implements ISymptomWrite {

    private Map<String, Integer>resultToWrite;

    public WriteSymptomDataFromCount (Map<String, Integer>resultToWrite) {this.resultToWrite = resultToWrite;}
    /**
     * @param
     */
    @Override
    public Map<String, Integer> WriteSymptoms() {

        try {
            File fileOut = new File("result.out");
            if (fileOut.createNewFile()) {
                System.out.println("create file: " + fileOut.getName());
            } else {
                System.out.println("File already exists.");
            }

            BufferedWriter writingFile = new BufferedWriter(new FileWriter(fileOut));
            for (Map.Entry<String, Integer> entry : resultToWrite.entrySet()) {

                writingFile.write(entry.getKey() + ":"
                        + entry.getValue());
                System.out.println("getKey : " + entry.getKey() );
                System.out.println("getValue : " + entry.getValue() );

                writingFile.newLine();
            }
            writingFile.flush();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("error : " + e);
        }
        return null;
    }
}
    /*
    public void write(Map<String, Integer>
                              fileToWrite){


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

    }*/



