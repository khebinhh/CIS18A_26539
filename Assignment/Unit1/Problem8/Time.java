/*
 * Create a Java program that calculates the number 
 * of hours in a year, then display the hours as 
 * the program output. A year has 365 days. Each day 
 * has 24 hours. include appropriate variable declaration, 
 * assignment and use of operators. Provide the program code 
 * and screen capture of the program successfully compiled 
 * as answer. 
 * See Lab 1 for instructions on JDK 11 compilation
 */
class Time{
    public static void main(String args[]){
        int hour;
        int day;
        int year;
        
        System.out.println("This program will display how many hours are in a year.");
        
        hour = 24;
        day = hour;
        year = day * 365; // 365 days in a year

        System.out.println("In a day, there are " + hour + " hours.");
        System.out.println("If a year has 365 days, then there are " + year + " hours in a year.");
    }
}