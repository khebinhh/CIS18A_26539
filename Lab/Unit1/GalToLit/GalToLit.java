/*
 * try this 1-1
 * 
 * this program converts gallons to liters.
 * 
 * call this program GalToLit.java
 */
class GalToLit{
    public static void main(String args[]){
        double gallons; //holds the number of gallons
        double liters;  //holds conversionto liters

        gallons = 10;   //start with 10 gallons

        liters = gallons * 3.7853;  //convert to liters
        System.out.println(gallons + " gallons is " + liters + " liters.");

    }
}