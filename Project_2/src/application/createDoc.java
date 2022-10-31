package application;

import java.io.IOException;
import java.io.File;
public class createDoc {

    private String nameCreateFile;

    public void nameFileOut(String nameFileOut) {
        this.nameCreateFile = nameFileOut;
    }

    public void create(){
        try {
            File fileOut = new File(nameCreateFile);
            if (fileOut.createNewFile()){
                System.out.println("create file: " + fileOut.getName());
            }else{
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
