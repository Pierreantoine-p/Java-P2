

package application;


import java.util.*;

public class Main {
    public static void main(String[] args) {

        readFile fileRead = new readFile();
        count counter = new count();
        writingDoc fileWriting = new writingDoc();

        fileRead.addFile("symptoms.txt");
        List<String> listToCount = fileRead.read();
        counter.countSymptoms(listToCount);
        Map<String, Integer> fileToWrite = counter.countSymptoms(listToCount);
        fileWriting.write(fileToWrite);

    }
}