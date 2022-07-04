/*
 * Create a program that uses arithmetic and 
 * relational operators as noted.
 * 
 * a.	myVar1 is 5
 * b.	myVar2 is myVar1 add 1
 * c.	myVar2 is myVar2 multiplies by 10
 * d.	Display value for myVar2
 */
class Arith{
    public static void main(String args[]){
        int myVar1 = 5;
        int myVar2 = myVar1 + 1;
        myVar2 *= 10;   //compound operator
        System.out.println("myVar2 is: " + myVar2);
    }
}