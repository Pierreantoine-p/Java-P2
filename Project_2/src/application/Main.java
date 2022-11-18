package application;

import Interface.ISymptomCount;
import Interface.ISymptomReader;
import Interface.ISymptomWrite;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ISymptomReader GetSymptoms = new ReadSymptomDataFromFile("symptoms.txt");
        ISymptomCount CountSymptoms = new CountSymptomDataFromReader(GetSymptoms.GetSymptoms());
        ISymptomWrite WriteSymptoms = new WriteSymptomDataFromCount(CountSymptoms.CountSymptoms());

        GetSymptoms.GetSymptoms();
        CountSymptoms.CountSymptoms();
        WriteSymptoms.WriteSymptoms();

       /* count counter = new count();
        writingDoc fileWriting = new writingDoc();

        fileRead.addFile("symptoms.txt");
        List<String> listToCount = fileRead.read();
        counter.countSymptoms(listToCount);
        Map<String, Integer> fileToWrite = counter.countSymptoms(listToCount);
        fileWriting.write(fileToWrite);*/

    }
}