package gr11review.part1;
import java.io.*;
import java.util.*;
import java.lang.Math.*;

/**
* A program that provides the user options to choose a type of joke
* The program then prints a joke based on user input
* @author: E. Fung
*
*/
public class Review2{
    public static void main(String[] args) throws IOException{

        // Initialize
        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
        int intMenuOption;

        // Inputs
        System.out.println("0 - print a joke about your hair");
        System.out.println("1 - print a joke about your feet");
        System.out.println("2 - print a joke about your clothes");
        System.out.println("3 - print a joke about your teacher");
        System.out.print("Choose a menu option: ");
                         
        intMenuOption = Integer.parseInt(key.readLine());

        // Logic Gates Based on User Input
        switch(intMenuOption){
            // Outputs
            case 0:
                System.out.println("What happened when the famous wig robber was seen in the area?");
                System.out.println("The police started combing the area!");
                break;
            case 1:
                System.out.println("What sort of snack do feet like?");
                System.out.println("Toe-ritos!");
                break;
            case 2:
                System.out.println("What metal can you use to make leggings?");
                System.out.println("Tightanium");
                break;
            case 3:
                System.out.println("Why were the teacher's eyes crossed?");
                System.out.println("She couldn't control her pupils!");
                break;
            default:
                System.out.print("Invalid menu option");
                break;
        }
    }
}