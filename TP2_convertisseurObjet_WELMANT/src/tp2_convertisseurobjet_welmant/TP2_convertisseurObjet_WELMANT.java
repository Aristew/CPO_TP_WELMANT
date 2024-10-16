/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_welmant;

/**
 * @date 11/10/2024
 * @author Welmant Ariste
 */

import java.util.Scanner;

public class TP2_convertisseurObjet_WELMANT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instancier un objet Convertisseur
        Convertisseur convertisseur = new Convertisseur();
        
        try (Scanner scanner = new Scanner(System.in)) {
            
            // Afficher les options de conversion à l'utilisateur
            System.out.println("""
                               Saisissez la conversion que vous souhaitez effectuer : 
                               1) De Celsius vers Kelvin 
                               2) De Kelvin vers Celsius 
                               3) De Celsius vers Fahrenheit 
                               4) De Fahrenheit vers Celsius 
                               5) De Kelvin vers Fahrenheit 
                               6) De Fahrenheit vers Kelvin""");
            
            // Lire le choix de l'utilisateur
            int choix = scanner.nextInt();
            
            switch (choix) {
                case 1 -> {
                    System.out.print("Entrez une temperature en degre Celsius : ");
                    double celcius = scanner.nextDouble();
                    double kelvin = convertisseur.CelciusVersKelvin(celcius);
                    System.out.println("Temperature en Kelvin : " + kelvin);
                }
                case 2 -> {
                    System.out.print("Entrez une temperature en Kelvin : ");
                    double kelvin = scanner.nextDouble();
                    double celsiusResult = convertisseur.KelvinVersCelcius(kelvin);
                    System.out.println("Temperature en Celsius : " + celsiusResult);
                }
                case 3 -> {
                    System.out.print("Entrez une temperature en degre Celsius : ");
                    double celcius = scanner.nextDouble();
                    double fahrenheit = convertisseur.CelciusVersFarenheit(celcius);
                    System.out.println("Temperature en Fahrenheit : " + fahrenheit);
                }
                case 4 -> {
                    System.out.print("Entrez une temperature en Fahrenheit : ");
                    double fahrenheit = scanner.nextDouble();
                    double celsiusResult = convertisseur.FarenheitVersCelcius(fahrenheit);
                    System.out.println("Temperature en Celsius : " + celsiusResult);
                }
                case 5 -> {
                    System.out.print("Entrez une temperature en Kelvin : ");
                    double kelvin = scanner.nextDouble();
                    double fahrenheit = convertisseur.KelvinVersFarenheit(kelvin);
                    System.out.println("Temperature en Fahrenheit : " + fahrenheit);
                }
                case 6 -> {
                    System.out.print("Entrez une temperature en Fahrenheit : ");
                    double fahrenheit = scanner.nextDouble();
                    double kelvin = convertisseur.FarenheitVersKelvin(fahrenheit);
                    System.out.println("Temperature en Kelvin : " + kelvin);
                }
                default -> System.out.println("Choix invalide.");
            }
            
            // Afficher le nombre total de conversions effectuées
            System.out.println(convertisseur.toString());
        }
    }
}

