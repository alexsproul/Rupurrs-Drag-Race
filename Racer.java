public class Racer extends CatQueen {
    private int level;
    private double score;
    private boolean isEliminated;

    public Racer(String name, int charisma, int uniqueness, int nerve, int talent, int level, double score)
    {
        super(name, charisma, uniqueness, nerve, talent);
        this.level = level;
        this.score = score;
        this.isEliminated = false;
    }

    public int getLevel(){return this.level;}
    public double getScore(){return this.score;}
}
