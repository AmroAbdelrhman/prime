/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package numeric;
import java.util.Scanner;
/**
 *
 * @author amabd7808
 */
public class Numeric {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double num = input.nextDouble();
        System.out.println(Math.abs(num));
    }
    
}
