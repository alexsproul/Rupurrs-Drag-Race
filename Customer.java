import java.util.ArrayList;

import org.graalvm.compiler.debug.CSVUtil.Escape;
public class Customer {
    private Racer racer;
    private int budget;
    private ArrayList<ShopItem> shoppingCart;

    public Customer(Racer racer, int budget){
        this.racer = racer;
        this.budget = budget;
        this.shoppingCart = new ArrayList<ShopItem>();
    }

    public Racer getRacer(){return this.racer;}
    public int getBudget(){return this.budget;}
    public ArrayList<ShopItem> getShoppingCart(){return this.shoppingCart;}

    public void setRacer(Racer racer){this.racer = racer;}
    public void setBudget(int budget){this.budget = budget;}
    public void setShoppingCart(ArrayList<ShopItem> shoppingCart){this.shoppingCart = shoppingCart;}

    public void addToCart(ShopItem item){
        shoppingCart.add(item);
        this.setBudget(this.getBudget() - item.getPrice());
    }

    public void removeFromCart(ShopItem item){
        boolean isInCart = false;
        for (int i = 0; i < this.shoppingCart.size(); i++){
            if (item == this.shoppingCart.get(i)){
                isInCart = true;
                shoppingCart.remove(i);
            }
        }
        if (isInCart){
            System.out.println(item + " was removed from cart.");
            this.setBudget(this.getBudget() + item.getPrice());
        }

        else {
            System.out.println(item + " was not located in shopping cart.");
        }
    }

    public ArrayList<ShopItem> checkout(Shop shop){
        
        if (this.getBudget() >= 0){
            return this.getShoppingCart();
        }
        else {
            return null;
        }

    }
    
}