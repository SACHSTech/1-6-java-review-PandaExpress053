package gr11review.part1;
import java.io.*;
import java.util.*;
import java.lang.Math.*;

/**
* A program that prompts for a yearly_amount, annual compound_interest_rate, 
* and outputs the number of years . For compound interest, the interest rate 
* is applied to the existing amount after each year.
* @author: E. Fung
*
*/
public class Review5{

    /**
     * Main method to execute the program logic
     * 
     * @param args Command-line arguments (not used)
     * @throws IOException input exceptions if error occurs
     */

    public static void main(String[] args) throws IOException{

        // Initialize
        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
        int intYearlyAmount;
        double dblCompoundInterestRate;
        int intTargetAmount;
        int intRequiredYears = 0;
        double dblCurrentAmount = 0;

        // Inputs
        System.out.print("Enter the yearly invested amount: ");
        intYearlyAmount = Integer.parseInt(key.readLine());
        System.out.print("Enter the compound interest rate: ");
        dblCompoundInterestRate = Double.parseDouble(key.readLine());
        System.out.print("Enter the target amount: ");
        intTargetAmount = Integer.parseInt(key.readLine());

        // Calculations
        while (dblCurrentAmount < intTargetAmount){
            dblCurrentAmount += intYearlyAmount;
            dblCurrentAmount *= 1.0 + (dblCompoundInterestRate / 100.0);
            intRequiredYears++;
        }

        // Output
        System.out.println("The target amount will be earned in " + intRequiredYears + " years.");
    }
}