
package application;

//import application.readFile;
public class Main {
    public static void main(String[] args) {
        readFile file = new readFile();

        file.addFile("symptoms.txt");
        file.read();
    }
}