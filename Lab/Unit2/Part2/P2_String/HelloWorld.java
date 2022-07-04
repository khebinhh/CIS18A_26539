import java.util.Scanner;

public class HelloWorld {
    public static void main(String args[])
    throws java.io.IOException{
        //Create a scanner object from System.in
        Scanner sc = new Scanner(System.in);
        //Ask the user for their age
        System.out.println("How old r u? ");
        //read a lin eof input & convert it to an Integer
        int age = Integer.parseInt(sc.nextLine());
        //print what the user wrote
        System.out.println("You wrote: " + age);
        //Use the if statement logic
        if(age>=21) System.out.println("You are 21 or over!");
        else System.out.println("You are under 21");
    }
}
