public class CatQueen extends Character {
    private int charisma, uniqueness, nerve, talent;

    public CatQueen(String name, int charisma, int uniqueness, int nerve, int talent){
        super(name);
        this.charisma = charisma;
        this.uniqueness = uniqueness;
        this.nerve = nerve;
        this.talent = talent;
    }

    public int getCharisma(){return this.charisma;}
    public int getUniqueness(){return this.uniqueness;}
    public int getNerve(){return this.nerve;}
    public int getTalent(){return this.talent;}

    public void setCharisma(int charisma){this.charisma = charisma;}
    public void setUniqueness(int uniqueness){this.uniqueness = uniqueness;}
    public void setNerve(int nerve){this.nerve = nerve;}
    public void setTalent(int talent){this.talent = talent;}
}
