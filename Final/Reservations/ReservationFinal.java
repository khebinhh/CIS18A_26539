
/*
 * This program will try its best to make reservations for members and non-members. 
 * The criteria is that non-members can only make the reservation the day of instead
 * of making reservation ahead of time. 
 */
package Final.Reservations;
import Final.Reservations.*;
import java.io.IOException;
import java.util.Scanner;
import java.time.Clock;
//main function
public class ReservationFinal {
    public static void main(String args[]) throws java.io.IOException {
        Clock c = Clock.systemUTC();
        System.out.println(c.instant());

        GuestInfo first = new GuestInfo[5];
        first[0] = new GuestInfo("Jared Fong", 6);
    }
}

