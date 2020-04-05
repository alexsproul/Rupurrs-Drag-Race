/*
    Rupurr's Cat Race: Character Class
    A Character is the parent class for any character in the Rupurr's Cat Race game.
    Every Character has a name and (eventually) will have a photo associated them.
    Several subclasses extend Character.
    Alexander Sproul - April 5, 2020
*/
public class Character {
    private String name; //The Character's name.

    //CONSTRUCTOR:
    //Single-argument Constructor: Only takes the name as a String for an argument.
    public Character(String name)
    {
        this.name = name;
    }

    //SETTER METHODS:
    public void setName(String name) {this.name = name;} //Sets the Character's name attribute.

    //GETTER METHODS:
    public String getName(){return this.name;} //Returns the Character's name as a String.

    /*
        TO STRING METHOD: 
        Returns the Character's name as a String. All subclasses of Character
        will inherit this toString() method and I currently can't anticipate
        needing to override it.
    */
    public String toString() {return this.name;}

}
