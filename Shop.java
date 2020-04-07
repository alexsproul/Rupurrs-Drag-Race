import java.util.ArrayList;

public class Shop {
    private String shopName;
    private ArrayList<ShopItem> shopItems;
    
    public Shop(String shopName, ArrayList<ShopItem> shopItems){
        this.shopName = shopName;
        this.shopItems = shopItems;

    }

    //TODO: Add a sellItem function that removes an item from the list of shopItems.
}