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
        // Générateur de nombre aléatoire
        Random generateurAleat = new Random();
        int n; // Le nombre à deviner
        int compteur = 0; // Compteur de tentatives
        var sc = new Scanner(System.in); // Scanner pour lire les entrées utilisateur

        n = generateurAleat.nextInt(101);// Génère un nombre aléatoire entre 0 et 99
        System.out.println("Choisissez la difficulté : \n 1) Facile \n 2) Normal \n 3) Difficile ");
        int z = sc.nextInt(); // Lire le choix de la difficulté

        switch (z) {
            case 1 -> { // Mode Facile
                System.out.println("Mode Facile : Vous avez un nombre illimité de tentatives.");
                boolean trouve = false;
                while (!trouve) {
                    compteur++;
                    System.out.println("Saisir un nombre entier entre 0 et 100");
                    int a = sc.nextInt();

                    if (a == n) {
                        System.out.println("Bravo, vous avez gagné !");
                        trouve = true;
                    } else if (a < n) {
                        if (n - a > 20) {
                            System.out.println("Vraiment trop petit");
                        } else {
                            System.out.println("Trop petit");
                        }
                    } else {
                        if (a - n > 20) {
                            System.out.println("Vraiment trop grand");
                        } else {
                            System.out.println("Trop grand");
                        }
                    }
                }
                System.out.print("Nombre de tentatives = " + compteur);
            }
            case 2 -> { // Mode Normal
                System.out.println("Mode Normal : Vous avez 10 tentatives pour deviner le nombre.");
                boolean trouve = false;
                while (!trouve && compteur < 10) {
                    compteur++;
                    System.out.println("Saisir un nombre entier entre 0 et 100");
                    int a = sc.nextInt();

                    if (a == n) {
                        System.out.println("Bravo, vous avez gagné !");
                        trouve = true;
                    } else if (a < n) {
                        System.out.println("Trop petit");
                    } else {
                        System.out.println("Trop grand");
                    }
                }
                if (!trouve) {
                    System.out.println("Vous avez épuisé vos 10 tentatives. Le nombre était : " + n);
                } else {
                    System.out.println("Nombre de tentatives = " + compteur);
                }
            }
            case 3 -> { // Mode Difficile
                System.out.println("Mode Difficile : Vous avez seulement 5 tentatives pour deviner le nombre.");
                boolean trouve = false;
                while (!trouve && compteur < 5) {
                    compteur++;
                    System.out.println("Saisir un nombre entier entre 0 et 100");
                    int a = sc.nextInt();

                    if (a == n) {
                        System.out.println("Bravo, vous avez gagné !");
                        trouve = true;
                    } else if (a < n) {
                        System.out.println("Trop Petit");
                    } else {
                        System.out.println("Trop Grand");
                    }
                }
                if (!trouve) {
                    System.out.println("Vous avez épuisé vos 5 tentatives. Le nombre était : " + n);
                } else {
                    System.out.println("Nombre de tentatives = " + compteur);
                }
            }
            default -> {
                System.out.println("Choix de difficulté invalide. Veuillez relancer le programme.");
            }
        }
          
    }
}
