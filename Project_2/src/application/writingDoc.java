package application;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class writingDoc {
    /*public void create(){
        try {
            //Create new file
            File fileOut = new File("result.out");
            if (fileOut.createNewFile()){
                System.out.println("create file: " + fileOut.getName());
            }else{
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/
    public void write(Map<String, Integer> fileToWritte){
        try{
            File fileOut = new File("result.out");

            if (fileOut.createNewFile()){
                System.out.println("create file: " + fileOut.getName());
            }else{
                System.out.println("File already exists.");
            }
            BufferedWriter writer = new BufferedWriter(new FileWriter("result.out"));
            writer.write(fileToWritte.size());
            writer.close();
            System.out.println("in the doc" + writer);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
