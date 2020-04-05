import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.*;
import java.awt.*;

public class Main {
    public static final String CHALLENGE_DATA_PATH = ".\\ChallengeData\\";
    public static final String QUEEN_DATA_PATH = ".\\QueenData\\";
    public static final String GAME_TEXT_PATH = ".\\GameText\\";
    public static final String DELIMITER = ",";
    public static final int WINDOW_HEIGHT = 500;
    public static final int WINDOW_WIDTH = 800;
    public static final String TITLE = "Rupurr's Drag Race";

    public static void main(String [] args)
    {
        loadRacers();
        launchGame();
    }

    public static ArrayList<Racer> loadRacers(){
        ArrayList<Racer> racers = new ArrayList<Racer>();
        ArrayList<String[]> splitLines = new ArrayList<String []>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(QUEEN_DATA_PATH + "RacersStart.csv"));
            String line = reader.readLine();
            while (line != null){
                splitLines.add(line.split(DELIMITER));
                line = reader.readLine();
            }
            reader.close();

            for (int i = 0; i < splitLines.size(); i++){
                racers.add(new Racer(splitLines.get(i)[0],
                        Integer.parseInt(splitLines.get(i)[1]),
                        Integer.parseInt(splitLines.get(i)[2]),
                        Integer.parseInt(splitLines.get(i)[3]),
                        Integer.parseInt(splitLines.get(i)[4]),
                        Integer.parseInt(splitLines.get(i)[5]),
                        Integer.parseInt(splitLines.get(i)[6])
                        ));
            }

            for (int i = 0; i < racers.size(); i++){
                System.out.println(racers.get(i));
            }
        }

        catch (FileNotFoundException e) {
            System.out.println("Could not load Racers.csv file.");
        }

        catch(IOException e){
            System.out.println("IOException. Problem reading file.");
        }
        return racers;
    }

    public static void launchGame(){
        JFrame homeScreen = new JFrame();
        homeScreen.setTitle(TITLE);
        homeScreen.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        homeScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String welcomeMessage = "";
        //TODO: Make a loadFileAsString method that opens and returns a file as is. This will be handy later.
        //TODO: Consider making a separate class for static methods to do with files.
        try {
            BufferedReader reader = new BufferedReader(new FileReader(GAME_TEXT_PATH + "WelcomeMessage.txt"));
            String line = reader.readLine();
            while (line != null)
            {
                welcomeMessage += (line + "<br/>");
                line = reader.readLine();
            }
            
            reader.close();
        }
        catch (FileNotFoundException e){
            System.out.println("Could not find WelcomeMessage.txt.");
        }
        catch (IOException e){
            System.out.println("Problem loading WelcomeMessage.txt.");
        }
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BorderLayout());
        JLabel welcomeLabel = new JLabel(welcomeMessage);

        Font font = new Font("Courier", Font.PLAIN, 30);
        welcomeLabel.setFont(font);
        contentPanel.add(welcomeLabel, BorderLayout.CENTER);
        JButton playButton = new JButton("Enter the Werk Room");
        contentPanel.add(playButton, BorderLayout.SOUTH);
        contentPanel.setBackground(Color.MAGENTA);

        homeScreen.add(contentPanel);
        homeScreen.setVisible(true);




    }
}
