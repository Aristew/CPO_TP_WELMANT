/*;
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_welmant;

import java.util.Scanner;

/**
 * @date 23/09/2024
 * @author ariste welmant
 * 
 */
public class TP1_manipNombresInt_WELMANT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Saisir 2 entiers");
        var sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int difference = a - b;
        int produit = a*b;
        System.out.println("Voici la somme: "+ a+b); 
        System.out.println("Voici la difference: "+ difference);
        System.out.println("Voici le produit: "+ produit);
        // TODO code application logic here
    }
    
}
