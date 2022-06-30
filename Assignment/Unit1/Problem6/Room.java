/*
 * Create a Java program that calculates 
 * and display area of a room. (Area = length x width), 
 * given that the length of the room is 18 feet, 
 * and width is 12 feet. The program should include 
 * appropriate variable declaration, assignment and 
 * use of operators. Provide the program code and 
 * screen capture of the program successfully compiled as answer. 
 * *See Lab 1 for instructions on JDK 11 compilation. 
 */
class Room{
    public static void main(String args[]){
        int length;
        int width;
        
        length = 18;
        width = 12;

        System.out.println("Length of room: " + length);
        System.out.println("Width of room: " + width);
        System.out.println();

        int area;
        area = length * width;

        System.out.println("Area of room: " + area);
    }
}