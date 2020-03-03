/*
 * Amro Abdelrhman
 * 26/02/2020
 * prime numbers
 */

package eratosthenes;
import java.util.ArrayList;
import java.util.Scanner;       //importing the scanner
/**
 *
 * @author amabd7808
 */
public class Eratosthenes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    ArrayList<String> list=new ArrayList<String>(); //Creating arraylist    
        System.out.println(" Please enter a number ");
        int variable;       // introducing the number needed
        variable = input.nextInt();
        int number;
        for ( int i=2 ; i <= variable ; i++) // Using a for loop to introduce i
        { 
             number = 0;                  //setting number to 0
            for (int j = 2; j <= i / 2; j++)  // checking if it is prime
            {
                if (i % j ==0 ) 
                {
                    number++;
                    break;
                }
            }
            if (number == 0 && i != 1) // the prime number are getting outputted
            {
                System.out.println(i + "");
            }
        }
    }
}