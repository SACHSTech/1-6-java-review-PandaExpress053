package gr11review.part1;
import java.io.*;
import java.util.*;
import java.lang.Math.*;

/**
* A program that returns the number of characters, spaces and letter "a"'s in an input string
* It will also output a number of dashes based on the number of odd numbers in the input string
* @author: E. Fung
*
*/
public class Review7{
    public static void main(String[] args) throws IOException{

        // Initialize
        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

        String strInput;
        int intSpaces = 0;
        int intALetters = 0;

        // Inputs
        strInput = key.readLine();

        // Parsing through input to find objectives
        for (int i = 0; i < strInput.length() - 1; i++){
            if (strInput.charAt(i) == 'a'){
                intALetters++;
            }
            if (strInput.charAt(i) == ' '){
                intSpaces++; 
            }
        }

        // Outputs
        System.out.println("There are " + strInput.length() + " characters in the sentence.");
        System.out.println("There are " + intSpaces + " spaces in the sentence.");
        System.out.println("There are " + intALetters + " letter a in the sentence.");
        for (int i = 0; i < Math.round(strInput.length() / 2.0); i++){
            System.out.print("-");
        }
    }
}