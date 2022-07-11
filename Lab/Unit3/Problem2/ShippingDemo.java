/*
 * Create and compile a program output that displays
 * the shipping cost for EACH of the listed products when
 * shipping company charges $1.25 per pound.
 * 
 * The program should include appropriate variables and data type.
 *      TV: weight is 15 lbs
 *      Laptop: weight is 7 lbs
 *      Game console: weight is 5 lbs
 */
class Electronics{
    double weight;
    double shipping; //shipping cost
}
class ShippingDemo {
    public static void main(String args[]){
        Electronics tv = new Electronics();
        Electronics laptop = new Electronics();
        Electronics gamecs = new Electronics();

        tv.weight = 15.0;
        laptop.weight = 7.0;
        gamecs.weight = 5.0;

        tv.shipping = tv.weight * 1.25;
        laptop.shipping = laptop.weight * 1.25;
        gamecs.shipping = gamecs.weight * 1.25;

        //print
        System.out.println("The TV weighs " + tv.weight + " lbs, so the cost of shipping is $" + tv.shipping);
        System.out.println("The laptop weighs " + laptop.weight + " lbs, so the cost of shipping is $" + laptop.shipping);
        System.out.println("The game console weighs " + gamecs.weight + " lbs, so the cost of shipping is $" + gamecs.shipping);
    }
}
