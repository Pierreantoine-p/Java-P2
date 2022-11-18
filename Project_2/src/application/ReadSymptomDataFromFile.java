package application;

import Interface.ISymptomReader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadSymptomDataFromFile implements ISymptomReader {

   private String filepath;
    public ReadSymptomDataFromFile (String filepath) {this.filepath = filepath;}
    /**
     * method
     * @param
     * @return
     */
    @Override
    public List<String> GetSymptoms() {

        final List<String> result = new ArrayList<>();

        try{
            BufferedReader reader = new BufferedReader (new FileReader(filepath));
            String line = reader.readLine();

            while (line != null){
                line = reader.readLine();
                result.add(line);
            }
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("error : " + e );
        }
        return result;
    }
}
    /*
    public  read() {

        ArrayList<String> stringArray = new ArrayList<>();
        try {
            file = new BufferedReader(new FileReader(
            ));
            String line = file.readLine();
            while (line != null) {
                line = file.readLine();
                stringArray.add(line);

            }
        } catch (IOException e) {
            e.printStackTrace();

        }
        System.out.println(stringArray);

        return stringArray;
    }*/
