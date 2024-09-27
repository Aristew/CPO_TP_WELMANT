/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_welmant;

import java.util.Random;
import java.util.Scanner;

/**
 * @date 23/09/2024
 * @author arist
 */
public class TP1_guessMyNumber_WELMANT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random generateurAleat = new Random();
        int n;
        int i = 0;
        int compteur = 0;
        var sc = new Scanner(System.in);
        n = generateurAleat.nextInt(100);
        System.out.println("Choissisez la difficulté : \n 1) Facile \n 2) Normal \n 3) Difficile ");
        int z = sc.nextInt();
        switch (z){
            case -> 1 {
                while (i<1){
                    compteur += 1;
                    System.out.println("Saisir un nombre entier entre 0 et 100");
                    int a = sc.nextInt();
                    if (a == n ){
                        System.out.println("gagne");
                        i += 1;
                    }
                    else if (a < n){
                    System.out.println("trop petit");
                    }
                    else if (a>n){
                    System.out.println("Trop grand");
                    }
                    }
                    System.out.print("Nombre de tentatives = "+ compteur);
            
}
    
}

}
    

