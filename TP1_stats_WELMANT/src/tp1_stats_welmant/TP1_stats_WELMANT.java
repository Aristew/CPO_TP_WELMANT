/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_welmant;

/**
 * Statistiques
 * @date 17/09/2024
 * @author Welmant Ariste
 */
import java.util.Scanner;
import java.util.Random;
public class TP1_stats_WELMANT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double tab [] = new double[6];
        for (int i = 0; i < 6; i++){
          tab[i] = 0;
        }
        System.out.println("Saisir un entier ");
        var sc = new Scanner(System.in);
        double m = sc.nextInt();
        Random generateurAleat = new Random();
        for (int j = 0; j < m ;j++){
            int n = generateurAleat.nextInt(6);
            tab [n] +=1;
        }
        for (int z = 0; z < 6; z++) {
            double pourcentage = (tab[z] / m) * 100; // Calcul du pourcentage
            System.out.printf("Face %d : %.2f%%\n", z, pourcentage); // Affiche le pourcentage avec 2 chiffres après la virgule
        }
    }
}
    
   
