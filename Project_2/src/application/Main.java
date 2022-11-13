

package application;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Init method
        readFile fileRead = new readFile();
        count counter = new count();
        writingDoc fileWriting = new writingDoc();

        // Catch return methods
        fileRead.addFile("symptoms.txt");
        List<String> listToCount = fileRead.read();
        counter.countSymptoms(listToCount);
        Map<String, Integer> fileToWrite = counter.countSymptoms(listToCount);
        fileWriting.write(fileToWrite);

    }
}