/*
 * The below program creates two objects, minivan, sportscar. 
 * This program also includes methods. The methods of a class 
 * typically manipulate and provide access to the data of the class. 
 * The range of a vehicle is dependent upon the capacity of the fuel 
 * tank and the rate of fuel consumption, and both of these 
 * quantities are encapsulated by Vehicle. By adding a method to 
 * Vehicle that computes the range, we enhance the  
 * object-oriented structure.
 */
class Vehicle{
    int passengers;
    int fuelcap;
    int mpg;

    // Display the range.
    void range(){
        System.out.println("Range is " + fuelcap * mpg);
    }
}

class AddMeth {
    public static void main(String args[]) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();
        /*
        int range1, range2;     //why include range1 and range2????
        */
        //assign values to fields in minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        //assign values to field in sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;


        System.out.print("Minivan can carry " + minivan.passengers + ". ");
        minivan.range();    //display range of minivan

        System.out.print("Sportscar can carry " + sportscar.passengers + ". ");
        sportscar.range(); //display range of sportscar
    }
}
