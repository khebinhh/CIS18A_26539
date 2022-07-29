package Final.Restaurant.restaurantpack;
//access modifier
//inheritance
public class Dinner extends Lunch{
    private double newPrice = 0.0;

    public Dinner(int i, String n, double p) {
        super(i, n, p);
    }

    public Dinner(int i, String n, double p, double nP) {
        super(i, n, p);
    newPrice = nP;
    }

    public void showSpecial() {
        System.out.println(super.itemNum + ": " + "The special is " + super.dishName + " at $" + newPrice);
    }

    public String toString() {
        return itemNum + ": " + dishName + "  $" + price;
    }

    public double getNewPrice() {
        return newPrice;
    }
}