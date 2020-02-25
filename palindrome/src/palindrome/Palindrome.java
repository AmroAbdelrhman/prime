/*
 * Amro Abdelrhamn 
 * 24/02/2020
 * palindrome
 */
package palindrome;

import javax.swing.*; 

/**
 *
 * @author User
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        String input;               // the variablke you input
        String reversed;            // the reverse of input
        reversed = "";
        input = JOptionPane.showInputDialog("Enter the word "); // =asking the user for an input
        for ( int i = input.length() - 1; i >=0; i--)   // reversing the user's input using a for loop
        {
            reversed += input.charAt(i); 
        }
        if (input.equalsIgnoreCase(reversed))  // seeing is it a palindrome or not 
        {
            JOptionPane.showMessageDialog(null, input + " reversed is " + reversed  );
            JOptionPane.showMessageDialog(null, " Therefore it is a palindrome ");
        }
        else
        {
            JOptionPane.showMessageDialog(null, input + " reversed is " + reversed ); 
            JOptionPane.showMessageDialog(null," it is not a palindrome" ); 
        }
        
    }
    
}