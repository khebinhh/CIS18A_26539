/* 4.	FreshFoods is a grocery store that sells bulk food items at a discount rate:
            •	$3 discount for every 10 pounds of nuts
            •	$5 discount for every 20 pounds of flour
            •	$7 discount for every 10 pounds of vegetables
            •	$10 discount for every 50 pounds of grains
 * Create, compile and run a Java program that displays 
 * the total discount for a customer who purchases 20 pounds 
 * of nuts, 20 pound of flour, 20 pounds of vegetables and 
 * 50 pounds of grains. The program should contain classes, 
 * objects, methods, appropriate variables and data type.
 * 
 */
class Discount{
    int discount, pounds, rate;
    String name;

    void savings(){  //method
    System.out.println("The total discounted cost from the bulk of " + name + " is $" + discount);
    }
}
class Customer {
    public static void main(String args[]){
    Discount nuts = new Discount();
    Discount flour = new Discount();
    Discount vegetables = new Discount();
    Discount grains = new Discount();

    // Assign name to class
    nuts.name = "nuts";
    flour.name = "flour";
    vegetables.name = "vegetables";
    grains.name = "grains";

    // Assign values of pounds
    nuts.pounds = 20;
    flour.pounds = 20;
    vegetables.pounds = 20;
    grains.pounds = 50;

    // Assign rate of discount
    nuts.rate = 10;
    flour.rate = 20;
    vegetables.rate = 10;
    grains.rate = 50;
    // Assign discount for the rate of pounds
    nuts.discount = 3 * (nuts.pounds / nuts.rate);
    flour.discount = 5 * (flour.pounds / flour.rate);
    vegetables.discount = 7 * (vegetables.pounds / vegetables.rate);
    grains.discount = 10 * (grains.pounds / grains.rate);

    // Display
    nuts.savings();
    flour.savings();
    vegetables.savings();
    grains.savings();
    }
}
