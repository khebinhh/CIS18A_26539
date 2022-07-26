public class Ovld {
    public int prod(int P, int Q){
        return (P*Q);
    }    
    public double prod(double Q, double R){
        return (Q*R);
    }
    public long prod(long P, long R){
        return (P*R);
    }
    public int prod(int P, int Q, int R){
        return (P*Q*R);
    }

    public static void main(String args[]){
        Ovld ob = new Ovld();

        System.out.println("First overload product: ");
        System.out.println(ob.prod(30, 50));
        System.out.println("Second overload product: ");
        System.out.println(ob.prod(50, 70));
        System.out.println("Third overload product: ");
        System.out.println(ob.prod(30, 70));
        System.out.println("Fourth overload product: ");
        System.out.println(ob.prod(30, 50, 70));
    }
}
