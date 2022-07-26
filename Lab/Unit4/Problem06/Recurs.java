class Recs{
    int myMeth(int n){
        int result;
        if (n == 0){
            return 4;
        }
        result = 2 * myMeth(n - 1) + 1;
        return result;
    }
}

class Recurs {
    public static void main(String args[]){
        Recs r = new Recs();
        System.out.println("Sequence using recursive method:");

        System.out.println("a0 is " + r.myMeth(0));
        System.out.println("a1 is " + r.myMeth(1));
        System.out.println("a2 is " + r.myMeth(2));
        System.out.println("a3 is " + r.myMeth(3));
        System.out.println("a4 is " + r.myMeth(4));
        System.out.println();
    }
}
