package gr11review.part1;
import java.io.*;
import java.util.*;
import java.lang.Math.*;
import java.text.DecimalFormat;

/**
* A program that asks the user how many items he/she would like to purchase. 
* The program then gets the prices for the items one by one. At the end of entering 
* items, print out the total, the tax (13%) and the grand total. Import and use the 
* java.text.DecimalFormat class to output the information in currency format (0.00)
* @author: E. Fung
*
*/
public class Review4{
    public static void main(String[] args) throws IOException{

        // Initialize
        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat df =  new DecimalFormat("0.00");

        int intNumItems;
        double dblSubTotal = 0;

        // Inputs 
        System.out.print("How many items do you want to buy? ");
        intNumItems = Integer.parseInt(key.readLine());

        for (int i = 0; i < intNumItems; i++){
            System.out.print("Enter the price for item " + (i+1) + ": ");
            // Calculates subtotal
            dblSubTotal += Double.parseDouble(key.readLine());
        }

        // Outputs necessary information based on subtotal
        System.out.println("Subtotal: $" + df.format(dblSubTotal));
        System.out.println("Tax: $" + df.format(dblSubTotal * 0.13));
        System.out.println("Total: $" + df.format(dblSubTotal * 1.13));
    }
}