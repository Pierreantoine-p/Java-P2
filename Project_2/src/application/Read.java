package application;

import interfac.Read;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile implements Read {

    /**
     * method
     * @param
     * @return
     */


    @Override
    public List<String> read() {
         final List<String> stringArray = new ArrayList<>();
        try{
            BufferedReader File = new BufferedReader()
        }catch (IOException e) {
            e.printStackTrace();

        }
        return read();
    }
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
    }
}
