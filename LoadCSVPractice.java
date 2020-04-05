import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LoadCSVPractice {
    public static void main(String[] args) {
        String filePath = ".\\src\\QueenData\\RacersStart.csv";
        BufferedReader br = null;
        String line = "";
        String delimiter = ",";

        try {
            br = new BufferedReader(new FileReader(filePath));
            line = br.readLine();
            while (line != null){
                String[] racer = line.split(delimiter);
                for (int i = 0; i < racer.length; i++){
                    System.out.println(racer[i]);
                }
                line = br.readLine();
            }
        }
        catch (FileNotFoundException e){
            System.out.println("Could not find file.");
        }
        catch (IOException e){
            System.out.println("Problem reading file.");
        }


    }
}
