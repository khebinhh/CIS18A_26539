/*
 * Option 1: Business Program
 * This is a restaurant program designed to order from
 * the lunch menu or dinner menu.
 */
package Final.Restaurant.restaurantpack;
import Final.Restaurant.restaurantpack.*;
import java.io.IOException;
import java.util.Scanner;

class Restaurant{
    public static void main(String args[]) throws java.io.IOException {
        //create an array for the lunch menu
        Lunch lunchArray[] = new Lunch[9];
    
        lunchArray[0] = new Lunch(1, "Spinach Artichoke Dip", 5.95);
        lunchArray[1] = new Lunch(2, "Tomato Bruschetta", 4.95);
        lunchArray[2] = new Lunch(3, "Mozzarella Sticks", 5.95);
        lunchArray[3] = new Lunch(4, "Chicken Caesar Salad", 7.95);
        lunchArray[4] = new Lunch(5, "Greek Salad", 7.95);
        lunchArray[5] = new Lunch(6, "Southwest Turkey Club", 9.95);
        lunchArray[6] = new Lunch(7, "Tuna Melt", 7.95);
        lunchArray[7] = new Lunch(8, "Applewood Smoked Cheddar Burger", 12.95);
        lunchArray[8] = new Lunch(9, "Pulled Pork Sandwhich", 11.95);
    
        //creating array for the dinner menu
        Dinner dinnerArray[] = new Dinner[10];
    
        dinnerArray[0] = new Dinner(1, "French Onion Soup", 5.95);
        dinnerArray[1] = new Dinner(2, "Spinach Salad", 6.95);
        dinnerArray[2] = new Dinner(3, "Lobster Bisque", 7.95);
        dinnerArray[3] = new Dinner(4, "6 oz Filet Mignon", 19.95);
        dinnerArray[4] = new Dinner(5, "Surf and Turf", 15.95);
        dinnerArray[5] = new Dinner(6, "Chicken Scampi", 17.95);
        dinnerArray[6] = new Dinner(7, "Bacon Bourbon Tenderloin Tips", 17.95);
        dinnerArray[7] = new Dinner(8, "Beer-Battered Seafood Platter", 22.95);
        dinnerArray[8] = new Dinner(9, "Shrimp Scampi", 17.95);
        dinnerArray[9] = new Dinner(0, "Chicken Parmesan", 13.95, 10.95);
    
        //create scanner array
        Scanner myObj = new Scanner(System.in); 
            String str;   //start
            boolean done = false;     //initialized scanner
            boolean finish = false;
            char choice = ' ';
            char choiceArray[] = new char[40];
            int index = 0;
            char exitChoice = ' ';
            double taxRate = .08;
            double total = 0.0;
            double billTotal = 0.0;
        
            System.out.println("Hello and welcome to the establishment.");
        
            while (!done) {
                System.out.println("Are you dining after 4:00 pm? (Y/N)");		
                str = myObj.nextLine();
                choice = str.charAt(0);
                //this will then create determine the menu for either dinner or lunch

                switch(choice) {
                    case 'Y':   //upper case and lower case in case they didn't capitalize it
                    case 'y':
                        System.out.println("Here is the dinner menu.");		//printing dinner menu
                        System.out.println("Appetizers 1-3, Entree's 4-10:");
                        System.out.println();
                        for (int i = 0; i < dinnerArray.length; i++) {
                            if (dinnerArray[i].getNewPrice() == 0.0) {
                                dinnerArray[i].showDish();
                            }
                            else {
                                dinnerArray[i].showSpecial();
                            }
                        }
                        System.out.println();
                        break;
                    case 'N':
                    case 'n':
                        System.out.println("Here is the lunch menu.");		//printing lunch menu
                        System.out.println("Appetizers 1-3, Entree's 4-9:");
                        System.out.println();
                        for (int i = 0; i < lunchArray.length; i++) {
                        lunchArray[i].showDish();
                        }
                        System.out.println();
                        break;
                    default:
                        System.out.println("Please enter a valid choice");
                }
                done = true;
            }
        System.out.println();
        while(!finish) {
            System.out.println("Please select the item number you would like to order. (1-9)");	//selecting items from menu
            str = myObj.nextLine();
            choiceArray[index] = str.charAt(0);
            //System.out.println("choice:\"" + choiceArray[index] + "\"");
        
            switch(choiceArray[index]) {
                case '1':
                    System.out.println("You chose menu item #1");
                    break;
                case '2':
                    System.out.println("You chose menu item #2");
                    break;
                case '3':
                    System.out.println("You chose menu item #3");
                    break;
                case '4':
                    System.out.println("You chose menu item #4");
                    break;
                case '5':
                    System.out.println("You chose menu item #5");
                    break;
                case '6':
                    System.out.println("You chose menu item #6");
                    break;
                case '7':
                    System.out.println("You chose menu item #7");
                    break;
                case '8':
                    System.out.println("You chose menu item #8");
                    break;
                case '9':
                    System.out.println("You chose menu item #9");
                    break;
                case '0':
                    System.out.println("You chose menu item #0");
                    break;
                default:
                    System.out.println("Please enter a valid selection");
            }
            index++;
            System.out.println("Would you like to choose another menu item? (Y/N)");
            str = myObj.nextLine();
            exitChoice = str.charAt(0);
            if (exitChoice == 'Y' || exitChoice == 'y') {
                finish = false;
            }
            else {
                finish = true;
            }
        }
        //bill calculation
        System.out.println();
        System.out.println("Your order has been taken and your server will be there to confirm your order." +
                            " If you have any questions, please ask your server.");
        if (choice == 'Y' || choice == 'y') {
            for (int i = 0; (i < index) && (i < choiceArray.length); i++) {						//dinner bill calc
                System.out.println("Menu Item chosen: " + choiceArray[i]);
                for (int j = 0; j < dinnerArray.length; j++) {
                    if (Integer.valueOf(String.valueOf(choiceArray[i])) == dinnerArray[j].getItemNum()) {
                    System.out.println(dinnerArray[j].toString());
                    if (dinnerArray[i].getNewPrice() == 0.0) {
                        total = total + dinnerArray[j].getPrice();
                    }
                    else {
                        total = total + dinnerArray[j].getNewPrice();
                    }
                    break;
                    }
                }
            }
        }   else {
                for (int i = 0; (i < index) && (i < choiceArray.length); i++) {						//lunch bill calc
                    System.out.println("Menu Item chosen: " + choiceArray[i]);
                    for (int j = 0; j < lunchArray.length; j++) {
                        if (Integer.valueOf(String.valueOf(choiceArray[i])) == lunchArray[j].getItemNum()) {
                        System.out.println(lunchArray[j].toString());
                        total = total + lunchArray[j].getPrice();
                        break;
                        }
                    }
                }
            }
        System.out.println();
        System.out.printf("SubTotal:             $%.2f\n", total);							//print bill
        System.out.printf("Tax (%.2f):           $%.2f\n", (taxRate * 100), (total * taxRate));
        billTotal = total + (total * taxRate);
        System.out.printf("Total:                $%.2f\n", billTotal);
        System.out.println();
        System.out.println("Thank you for dining with us, have a great rest of your day!");				//thank you message
      }
}