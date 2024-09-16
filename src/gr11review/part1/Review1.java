package gr11review.part1;
import java.io.*;
import java.util.*;
import java.lang.Math.*;

/**
* A program to compute days and months input to total days in the year
* @author: E. Fung
*
*/
public class Review1{

    /**
     * Main method to execute the program logic
     * 
     * @param args Command-line arguments (not used)
     * @throws IOException input exceptions if error occurs
     */
    
    public static void main(String[] args) throws IOException{

        // Initialize
        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

        int intDay;
        int intMonth;
        int intDayOfYear = 0;
        int[] arrMonthToDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Inputs
        System.out.print("Enter the month number: ");
        intMonth = Integer.parseInt(key.readLine());

        System.out.print("Enter the day number: ");
        intDay = Integer.parseInt(key.readLine());

        // Calculating months to days
        for (int i = 0; i < intMonth - 1; i++){
            intDayOfYear += arrMonthToDays[i];
        }
        // Calculating Days to Days 
        intDayOfYear += intDay;

        // Output
        System.out.println(intDayOfYear);
    }
}