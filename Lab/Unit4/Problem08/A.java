import java.util.*;
import java.lang.*;
class out{ //outer class
    private class inner { //inner class
    public void average(int [] array){
        int sum=0;
        for(int i=0;i<array.length;i++)
            sum=sum+array[i]; 
        System.out.println("Average of ages " +(float)sum/array.length);
    }
    public void max(int []array){
        int max=0;
        for(int i=0;i<array.length;i++){
            if(max<array[i])
                max=array[i];
        }
        System.out.println("Max age is " +max);
    }
    public void min(int []array){
        int min=200;
        for(int i=0;i<array.length;i++){
            if(min>array[i])
                min=array[i];
        }
        System.out.println("min age is " +min);
    }
}
    void display_Inner(int []arr){ 
        inner in =new inner();
        in.average(arr);
        in.max(arr);
        in.min(arr);
    }
}
public class A{
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter total no of friends ");
        int ages=sc.nextInt();
        int arr[]=new int[ages];
        System.out.println("Enter the ages of people");
        for(int i=0;i<ages;i++){
            arr[i]=sc.nextInt(); 
        }
        out obj=new out();
        obj.display_Inner(arr);
    }
}