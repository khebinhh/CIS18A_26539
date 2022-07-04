/*
 * Create a program that uses relational and arithmetic
 * operators as noted in below steps.
 * a.	myVar1 is greater and equal to 12
 * b.	myVar2 is equal to 14
 * c.	If myVar1 is less than myVar2, display “myVar1 < myVar2”
 * d.	myVar1 is myVar1 multiplies by 2
 * e.	If myVar1 is greater and equal to myVar2, display “myVar1 ≥ myVar2”
 * f.	If myVar1 is not equal to myVar2 , display “myVar1 != myVar2”
 */
class Op{
    public static void main(String argv[]){
        int myVar2 = 14;
        int myVar1 = 15; //set up greater and equal to 12.

        System.out.println("myVar1 is " + myVar1);
        System.out.println("myVar2 is " + myVar2);

        if(myVar1 < myVar2){
            System.out.println("myVar1 < myVar2");
        }
        myVar1 *= 2;
        if(myVar1 >= myVar2){
            System.out.println("myVar1 >= myVar2");
        }
        if(myVar1 != myVar2){
            System.out.println("myVar1 != myVar2");
        }
    }
}