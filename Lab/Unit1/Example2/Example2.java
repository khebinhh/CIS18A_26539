package CIS18A_Lab.Unit1.Example2;
/*
 * This demonstates a variable
 * 
 * Call this fine Example2.java
 */
class Example2 {
    public static void main(String args[]){
        int myVar1; //this declares a variable
        int myVar2; //this declares another variable

        myVar1 =1024; //this assigns 1024 to myVar1
        System.out.println("myVar1 contains " + myVar1);

        myVar2 = myVar1 / 2;

        System.out.println("myVar2 contains myVar1 / 2: ");
        System.out.println(myVar2);
    }
}
