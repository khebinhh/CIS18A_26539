/*  9. A pizzeria offers discount coupons to its customers 
        when they purchase multiple pizzas at the restaurant:
        •	$2 off for 2 pizzas.
        •	$5 off for 4 pizzas
        •	$10 off for 8 pizzas
        •	$12 off for 10 pizzas
        •	$15 off for 12 pizzas
    Create, compile and run the program that calculates and 
    displays the average discount per pizza at the restaurant. 
    The program should contain two dimensional array, 
    appropriate variables and data type.
 */
class Pizza {
    public static void main(String args[]){
        double pizzas[][] = {{2, 2}, {5, 4}, {10, 8}, {12, 10}, {15, 12}};
        double discount = 0;

        for(int i=0; i<5; i++) {
            System.out.println("When you order " + pizzas[i][1] + " pizzas,");
            System.out.println("You get a discount of $" + pizzas[i][0] + " dollars.");
            for(int j=0; j<1; j++){
                pizzas[i][j] = pizzas[i][0] / pizzas[i][1];
                System.out.println("Each pizza discount is $" + pizzas[i][j] + " dollars.\n");
                discount += pizzas[i][j];
            }
        }
        discount /=5;
        System.out.println("Average pizza discount is $" + discount + " dollars.\n");
    }
}
