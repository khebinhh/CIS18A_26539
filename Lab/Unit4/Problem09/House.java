class Area{
    double width;
    double length;

    double getWidth() { return width; }
    double getLength() { return length; }
    void setWidth(double w) { width = w;}
    void setLength(double l) { length = l;}
    void showDim(){
        System.out.println("Room dimesion: " + length + " feet and " + width + " feet");
    }
}

class Home extends Area{
    String room;
    Home(double w, double l, String r){
        setWidth(w);
        setLength(l);

        room = r;
    }
    double area(){
        return width * length;
    }
    void showRoom(){
        System.out.println(room);
    }
}

class House {
    public static void main(String args[]){
        Home r1 = new Home(18, 20, "Living room");
        Home r2 = new Home(13, 18, "Master room");
        Home r3 = new Home(12.0, 14.0, "Kitchen");
        Home r4 = new Home(14.0, 16.0, "Dining Room");
        /*
        r1.width = 18;
        r1.length = 20;
        r1.room = "Living room";

        r2.width = 13;
        r2.length = 18;
        r2.room = "Master Bedroom";

        r3.width = 12.0;
        r3.length = 14.0;
        r3.room = "Kitchen";

        r4.width = 14.0;
        r4.length = 16.0;
        r4.room = "Dinning Room";
        */
        r1.showRoom();
        r1.showDim();
        System.out.println("Area is " + r1.area());
        System.out.println();

        r2.showRoom();
        r2.showDim();
        System.out.println("Area is " + r2.area());
        System.out.println(r2.area());
        System.out.println();

        r3.showRoom();
        r3.showDim();
        System.out.println("Area is " + r3.area());
        System.out.println();

        r4.showRoom();
        r4.showDim();
        System.out.println("Area is " + r4.area());
        System.out.println();
    }
}
