
package application;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        readFile fileRead = new readFile();
        count counter = new count();
        //createDoc fileCreate = new createDoc();
        //writingDoc fileWriting = new writingDoc();


        fileRead.addFile("symptoms.txt");
        List<String> A = fileRead.read();
        counter.countSymptoms(A);
        //fileCreate.nameFileOut("result.out");
        //fileCreate.create();
        //fileWriting.nameWriteFile("result.out");
        //fileWriting.write();
    }
}