package application;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Init method
        readFile fileRead = new readFile();
        count counter = new count();

        // Catch return methods
        fileRead.addFile("symptoms.txt");
        List<String> listToCount = fileRead.read();
        counter.countSymptoms(listToCount);
    }
}