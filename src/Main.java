import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        //Total Bill
        System.out.print("What is your total bill?: ");
        double totalBill = s.nextDouble();

        //Tip Percentage
        System.out.print("What is your tip percentage?: ");
        double tipPercentage = s.nextDouble();

        //Number of People
        System.out.print("How many people are there?: ");
        int numberOfPeople = s.nextInt();

        //Calculations
        double tippedAmt = totalBill*(tipPercentage/100);
        tippedAmt *= 100;
        tippedAmt = (int)tippedAmt;
        tippedAmt /= 100.0; //Tips
        double billPlusTips = tippedAmt + totalBill; //Bill+Tips
        double payPerPerson = ((int)((billPlusTips/numberOfPeople)*100))/100.0; //Pay per person on Tips + Bill
        double tipPerPerson = ((int)((tippedAmt/numberOfPeople)*100))/100.0; //Tips per person

        //Print outs
        System.out.println("Your Tip Amount is: " + tippedAmt);
        System.out.println("Your Total Bill Including Tips is: " + billPlusTips);
        System.out.println("Your Tips Per Person is: " + tipPerPerson);
        System.out.println("Your Total Pay Per Person is: " + payPerPerson);

    }
}