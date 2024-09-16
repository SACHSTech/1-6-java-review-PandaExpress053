package gr11review.part1;
import java.io.*;
import java.util.*;
import java.lang.Math.*;


/**
* A program that simulates 1000 pulls of a slot machine, such that 3 random numbers 
* (between 0 and 8) are generated for each pull. Output the result of each pull on a 
* single line (a space separating the 3 numbers) and the total count of the number 
* times a triple (all 3 numbers equal) was pulled.
* @author: E. Fung
*
*/
public class Review8{

    /**
     * Main method to execute the program logic
     * 
     * @param args Command-line arguments (not used)
     * @throws IOException input exceptions if error occurs
     */

    public static void main(String[] args) throws IOException{

        // Initialize
        int intSlot1, intSlot2, intSlot3;
        int intJackpots = 0;
        
        for (int i = 0; i < 1000; i++){
            // Randomizes slots
            intSlot1 = (int)(Math.random() * 8.0);
            intSlot2 = (int)(Math.random() * 8.0);
            intSlot3 = (int)(Math.random() * 8.0);

            // Outputs slots
            System.out.println(intSlot1 + " " + intSlot2 + " " + intSlot3);

            // Calculates if jackpot win
            if (intSlot1 == intSlot2 && intSlot2 == intSlot3 && intSlot1 == intSlot3){
                intJackpots++;
            }
        }
        // Outputs jackpot wins
        System.out.println(intJackpots);
    }
}