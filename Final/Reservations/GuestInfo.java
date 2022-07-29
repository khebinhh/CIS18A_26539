package Final.Reservations;
//profile for the members making reservation
public class GuestInfo {
    protected String playerName;
    protected int timeslot;

    //setting method
    public GuestInfo(String n, int t) {
        playerName = n;
        timeslot = t;
    }
    //get method
    public double getTime(){
        return timeslot;
    }
    //get method
    public String getName(){
        return playerName;
    }
    //show method
    public void showReservation(){
        System.out.println(playerName + " - Time of reservation: " + timeslot);
    }
    //show method
    public String toString(){
        return playerName + " - Time of reservation: " + timeslot;
    }
}