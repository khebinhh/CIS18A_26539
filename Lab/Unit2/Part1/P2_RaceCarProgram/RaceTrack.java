class RaceTrack {
    public static void main(String argv[]){
        double radius, dist, circle, loop;
        radius = 1.3;
        loop = 5;
        circle = Math.PI * 2 * radius;
        dist = circle * loop;
        System.out.println("The total distance is " + dist + " miles.");
    }
}
