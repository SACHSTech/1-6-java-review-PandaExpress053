package gr11review.part1;
import java.io.*;
import java.util.*;
import java.lang.Math.*;
import java.text.DecimalFormat;

/**
* A program that creates a cash register program, except instead of prompting for the number items, 
* the user is able to keep entering item prices until the enter 0. Import and use the 
* java.text.DecimalFormat class to output the information in currency format (0.00)
* @author: E. Fung
*
*/
public class Review6{

    /**
     * Main method to execute the program logic
     * 
     * @param args Command-line arguments (not used)
     * @throws IOException input exceptions if error occurs
     */

    public static void main(String[] args) throws IOException{

        // Initialize
        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat df = new DecimalFormat("0.00");
        double dblSubtotal = 0;
        String strInput = "";
        
        // Receiving Inputs and Calculating
        while (!strInput.equals("0")){
            System.out.print("Enter the price for an item: ");
            strInput = key.readLine();
            dblSubtotal += Double.parseDouble(strInput);
        }

        // Outputs
        System.out.println("Subtotal: $" + df.format(dblSubtotal));
        System.out.println("Tax: $" + df.format(dblSubtotal * 0.13));
        System.out.println("Total: $" + df.format(dblSubtotal * 1.13));
    }
}