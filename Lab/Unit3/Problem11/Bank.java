import java.util.Scanner;

/*
 * Create, compile and run a Java program that shows 
 * if an applicant is qualified for a loan, if the applicant 
 * has been employed for 2 years and earns $50,000 per year. 
 * Qualification criteria: 2 years of employment, 
 * income of $60,000 per year. The program should contain 
 * ? operator, appropriate class, variable and data type. 
 */
import java.util.*;
class Loan{
    int employment; //validity of how many years
    int years, salary; //input of amount of years and salary
}
class Bank {
    public static void main(String args[]) throws java.io.IOException {
        Loan user1 = new Loan();    //constructing first profile
        int num_years, num_salary;

        //input
        Scanner sc = new Scanner(System.in);    // record user input
        System.out.print("Enter the number of years for your employment: ");
        if(sc.hasNextInt()){
            user_loan.years_employment = sc.nextInt();
            sc.nextLine();  //clear input buffer
        }
        else{
            System.out.println("invalid input. try again.");
            System.exit(0);
        }
        System.out.println("Enter your yearly income: $");

        if(sc.hasNextInt()){
            user_loan.yearly_income = sc.nextInt();
            sc.nextLine();  //clear input buffer
        }
        else{
            System.out.println("invalid input. try again.");
            System.exit(0);
        }
        // 
    }
}
