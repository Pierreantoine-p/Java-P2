
package application;


public class Main {
    public static void main(String[] args) {
        readFile fileRead = new readFile();
        createDoc fileCreate = new createDoc();
        writingDoc fileWriting = new writingDoc();

        fileRead.addFile("symptoms.txt");
        fileRead.read();

        fileCreate.nameFileOut("result.out");
        fileCreate.create();
        //fileWriting.nameWriteFile("result.out");
        //fileWriting.write();
    }
}