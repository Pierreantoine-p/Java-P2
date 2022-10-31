package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class writingDoc {

    private String nameFile;

    public void nameWriteFile(String nameFile) {this.nameFile = nameFile;}

    //par ordre alphabetique
    public void write(){

        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(nameFile));
            writer.write();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
