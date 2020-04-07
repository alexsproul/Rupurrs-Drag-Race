
public class ShopItem {
    private String name, description, colour;
    private int price;
    
    public ShopItem(String name, String description, String colour, int price){
        this.name = name;
        this.description = description;
        this.colour = colour;
        this.price = price;
    }

    public String getName(){return this.name;}
    public String getDescription(){return this.description;}
    public String getColour(){return this.colour;}
    public int getPrice(){return this.price;}

    public void setName(String name){this.name = name;}
    public void setDescription(String description){this.description = description;}
    public void setColour(String colour){this.colour = colour;}
    public void setPrice(int price){this.price = price;}

    public String toString(){
        return this.name + "\n" + this.description;
    }
}