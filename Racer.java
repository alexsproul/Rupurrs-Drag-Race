/* 
    Rupurr's Cat Race: Racer Class
    A Racer is a CatQueen that is participating in a current Season of Rupurr's Cat Race.
    Racers inherit the skill attributes from the CatQueen class as well as a name from the
    Character class.

    The Racer class introduces the following attributes:
        level: 
            When a Racer's level increases, they earn a skill point that can be used to increase one of their attributes.
            I haven't yet decided how the levelling system is going to work. 
        score:
            A Racer's score is the sum of their scores from all Challenges in the current Season. Score determines which Racer
            wins the entire Season.
        isEliminated:
            A boolean value indicating whether or not the Racer is still in the current Season. Initialized to false. A Racer loses when
            this value is set to true. (Unless they can be brought back?)
    
    Alexander Sproul - April 5, 2020
*/
public class Racer extends CatQueen {
    //VARIABLE DECLARATIONS:
    private int level;
    private double score;
    private boolean isEliminated;

    //CONSTRUCTOR:
    public Racer(String name, int purrisma, int mewniqueness, int nurrve, int tailent, int level, double score)
    {
        //Passes first five parameters to the CatQueen class. The name attribute is then passed to the Character class.
        super(name, purrisma, mewniqueness, nurrve, tailent);
        this.level = level;
        this.score = score;
        //Initializes isEliminated to false. 
        this.isEliminated = false; 
    }

    //GETTER METHODS:
    //Returns attributes of the current Racer.
    public int getLevel(){return this.level;}
    public double getScore(){return this.score;}

    //SETTER METHODS:
    //Allows changes to be made to the Racer's attributes.
    public void setLevel(int level){this.level = level;}
    public void setScore(double score){this.score = score;}
}
