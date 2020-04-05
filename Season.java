import java.util.ArrayList;
public class Season {
    private int numQueens;
    private ArrayList<Racer> racers;
    private ArrayList<Week> weeks;
    private Racer winner;

    public Season(int numQueens, ArrayList<Racer> racers, ArrayList<Week> weeks)
    {
        this.numQueens = numQueens;
        this.racers = racers;
        this.weeks = weeks;
        this.winner = null;
    }

    public int getNumQueens(){return this.numQueens;}
    public ArrayList<Racer> getRacers(){return this.racers;}
    public ArrayList<Week> getWeeks(){return this.weeks;}
    public Racer getWinner(){return this.winner;}
}
