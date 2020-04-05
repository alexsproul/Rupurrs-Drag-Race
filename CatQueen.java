/*
    Rupurr's Cat Race: CatQueen Class
    A CatQueen is a Character (and thus extends the Character class) with four different
    attributes representing their skills.
        Purrisma: How likeable they are. A higher value of purrisma will be beneficial 
        in Challenges dependent on purrsonality (like Scratch Game). 
        Mewniqueness: How much the CatQueen stands out. Useful in Nip Synchs an dancing challenges.
        Nurrve: How fur-ocious the CatQueen is. Allows the CatQueen to success when making a risky
        choice. Useful in paw-medy challenges.
        Tailent: How creative your CatQueen is. Allows the CatQueen to construct garments from unique
        materials and develop better lyrics in mewsic challenges.
    Alexander Sproul - April 5, 2020
*/

public class CatQueen extends Character {
    //VARIABLE DECLARATIONS
    private int purrisma, mewniqueness, nurrve, tailent;

    //CONSTRUCTOR:
    //Takes a String value for the name (passed to the Character constructor) and an integer
    //value for each of the CatQueen's skills.
    public CatQueen(String name, int purrisma, int mewniqueness, int nurrve, int tailent){
        super(name); //Passes the name to the Character constructor.
        this.purrisma = purrisma;
        this.mewniqueness = mewniqueness;
        this.nurrve = nurrve;
        this.tailent = tailent;
    }

    //GETTER METHODS:
    //Returns integer values for each of the CatQueen's attributes.
    public int getPurrisma(){return this.purrisma;}
    public int getMewniqueness(){return this.mewniqueness;}
    public int getNurrve(){return this.nurrve;}
    public int getTailent(){return this.tailent;}

    //SETTER METHODS:
    //Changes the values for each of the CatQueen's attributes.
    public void setPurrisma(int purrisma){this.purrisma = purrisma;}
    public void setMewniqueness(int mewniqueness){this.mewniqueness = mewniqueness;}
    public void setNurrve(int nurrve){this.nurrve = nurrve;}
    public void setTailent(int tailent){this.tailent = tailent;}
}
