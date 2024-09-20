
package calculette.exo.pkg1;

/**
 * Une calculette
 * @date 17/09/2024
 * @author Welmant Ariste
 */

import java.util.Scanner;

public class Calculette {



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("""
                           
                            Please enter the operator : \n1) add \n2) substract \n3) multiply \n4) divide \n5) modulo""");
        var sc = new Scanner(System.in);
        int operator;
        operator = sc.nextInt();
        if (operator < 1 || operator > 5){
            System.out.println("Error");
            System.exit(0);
        }
        System.out.println("Please enter the first operand:");
        double operand1 = sc.nextDouble();
        System.out.println("Please enter the second operand:");
        double operand2 = sc.nextDouble();
        double result; 
        switch (operator) {
            case 1 -> {
                result = operand1 + operand2;
                System.out.println("The result is "+result);
            }
            case 2 -> {
                result = operand1 - operand2;
                System.out.println("The result is "+result);
            }
            case 3 -> {
                result = operand1 * operand2;
                System.out.println("The result is "+result);
            }
            case 4 -> {
                result = operand1 / operand2;
                System.out.println("The result is "+result);
            }
            case 5 -> {
                result = operand1 % operand2;            
                System.out.println("The result is "+result);
            }
        }
        
    }
}            
    

