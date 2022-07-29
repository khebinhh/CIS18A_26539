package Final.Reservations;

public class MemberInfo extends GuestInfo {
    private int day;
    private String month;

    public MemberInfo(String n, int t) {
        super(n, t);
    }
    public MemberInfo(String n, int d, String m, int t){
        super(n, t);
        day = d;
        month = m;
    }
    //show method
    public void showDisplay(){
        System.out.println("On " + month + " " + day + ", " + 
                            super.playerName + " has a reservation for the " 
                                + super.timeslot + " slot.");
    }
    public int getDay(){
        return day;
    }
    public String getMonth(){
        return month;
    }
}
