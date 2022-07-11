class Discount{
    int discount, pounds, rate;
    String name;

    Discount(String n, int p, int r){   //constructor
        pounds = p;
        rate = r;
        name = n;
    }

    void savings(){  //method
    System.out.println("The total discounted cost from the bulk of " + name + " is $" + discount);
    }
}
class Customer {
    public static void main(String args[]){
    Discount nuts = new Discount("nuts", 20, 10);
    Discount flour = new Discount("flour", 20, 20);
    Discount vegetables = new Discount("vegetables", 20, 10);
    Discount grains = new Discount("grains", 50, 50);

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
