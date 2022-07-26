package Lab.Unit5.Problem05;
public interface MyIF{
    int getUserId();

    default int getAdminID(){
        return 1;
    }
}

class MyIFImp implements MyIF{
    public int getUserId() {
        return 100;
    }
}

class DefaultMethodDemo{
    public static void main(String args[]){
        MyIFImp obj = new MyIFImp();

        System.out.println("User ID is " + obj.getUserId());

        System.out.println("Admin ID is " + obj.getAdminID());
    }
}