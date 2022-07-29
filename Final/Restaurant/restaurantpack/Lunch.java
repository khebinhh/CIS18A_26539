package Final.Restaurant.restaurantpack;

public class Lunch {
    protected int itemNum;
    protected String dishName;
    protected double price;
    //set method
    public Lunch(int i, String n, double p) { 					
        itemNum = i;
        dishName = n;
        price = p;
    }
    //get method
    public double getPrice() {
        return price;
    }
    //get method
    public int getItemNum() {
        return itemNum;
    }
    //show method
    public void showDish() {
        System.out.println(itemNum + ": " + dishName + "  $" + price);
    }
    //show method
    public String toString() {
        return itemNum + ": " + dishName + "  $" + price;
    }
}

