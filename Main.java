import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {

//kkhggghjio;l
    public static void main(String[] args) throws IOException {

       

       //String readLine = bufferedReader.readLine();

        //System.out.println(readLine);


        List<String> allLines = Files.readAllLines(Path.of("input.csv"));


        for (String eachLine
                : allLines) {

            System.out.println(eachLine);

        }
                      //dgetsujdfcjhx
        // Added another line to see if the change is pushed to remote
    }
}
