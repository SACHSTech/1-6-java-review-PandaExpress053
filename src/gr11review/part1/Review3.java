package gr11review.part1;
import java.io.*;
import java.util.*;
import java.lang.Math.*;

/**
* A program that prints prints the odd numbers from 20 to 100 
* and prints the numbers from 29 to 2 in decreasing order.
* @author: E. Fung
*
*/
public class Review3{
    public static void main(String[] args) throws IOException{

        // Outputting odd numbers between 20 and 100
        for (int i = 20; i < 101; i++){
            if (i % 2 == 1){
                System.out.println(i);
            }
        }
        
        System.out.println("");

        // Outputting 29 to 2
        for (int i = 29; i > 1; i--){
            System.out.println(i);
        }
    }
}