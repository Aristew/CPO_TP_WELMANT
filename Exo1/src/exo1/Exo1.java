
package exo1;

import java.util.Scanner;

/**
 * TP0 exercice 1
 * @date 17/09/2024
 * @author ariste welmant
 */
public class Exo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Bonjour");
        System.out.println("Aurevoir");
        String prenom;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Bonjour, quel est votre prenom ?");
        prenom = sc.nextLine();
        System.out.println("Votre prenom est "+prenom+"");
    }
    
}