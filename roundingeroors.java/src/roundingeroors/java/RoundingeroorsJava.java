/*
 * Amro Abdelrhman
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package roundingeroors.java;
import java.util.Scanner;
import javax.swing.*;
/**
 *
 * @author amabd7808
 */
public class RoundingeroorsJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter a number");
        String num2 = input;
        Double bumbers = Double.parseDouble(num2);
        Double number = Double.parseDouble(input);
        double ghalat;
        number = Math.sqrt(number);
        number = Math.pow(number, 2);
        System.out.println("the square of the square of the number "+number+"");
        Double error = number - bumbers;
        ghalat = error/number ;
        System.out.println("the percent of error is "+ ghalat+"%");
    }
    
}
