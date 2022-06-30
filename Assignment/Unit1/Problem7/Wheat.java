/*
 * 7.	Create a Java program that converts pounds of wheat 
 * to kilograms and display the conversion, given that 
 * there are 24 pounds (lbs) of wheat in the container. 
 * The program should include appropriate variable declaration, 
 * assignment and use of operators. Provide the program code 
 * and screen capture of the program successfully compiled as answer. 
 * *See Lab 1 for instructions in JDK 11 compilation. 
 */
class Wheat{
    public static void main(String args[]){
        double pounds;      //use double for floating point
        double kilo;

        pounds = 24.0; //given
        kilo = pounds / 2.205;

        System.out.println("This is a program to convert the given pounds of wheat to kilograms.");
        System.out.println("Given pounds: " + pounds + " lbs.");
        System.out.println("Conversion to kilograms: " + kilo + " kg.");

    }
}