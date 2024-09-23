/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_welmant;

import java.util.Scanner;

/**
 *
 * @author ariste welmant
 */
public class TP1_convertisseur_WELMANT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Demander à l'utilisateur de saisir une valeur réelle en degré Celsius
        try (java.util.Scanner scanner = new Scanner(System.in)) {
            // Demander à l'utilisateur de saisir une valeur réelle en degré Celsius
            System.out.print("Entrez une température en degré Celsius : ");
            double celsius = scanner.nextDouble();
            // Appel de la méthode CelciusVersKelvin et affichage du résultat
            double kelvin = CelciusVersKelvin(celsius);
            System.out.println("Température en Kelvin : " + kelvin);
            // Test des autres conversions
            System.out.println("Température en Farenheit : " + CelciusVersFarenheit(celsius));
            System.out.println("Température Kelvin vers Celsius : " + KelvinVersCelcius(kelvin));
            System.out.println("Température Farenheit vers Celsius : " + FarenheitVersCelcius(CelciusVersFarenheit(celsius)));
            System.out.println("Température Kelvin vers Farenheit : " + KelvinVersFarenheit(kelvin));
            System.out.println("Température Farenheit vers Kelvin : " + FarenheitVersKelvin(CelciusVersFarenheit(celsius)));
            // Fermeture du scanner
        }
    }

    // Conversion Celsius vers Kelvin
    public static double CelciusVersKelvin(double tCelcius) {
        return tCelcius + 273.15;
    }

    // Conversion Kelvin vers Celsius
    public static double KelvinVersCelcius(double tKelvin) {
        return tKelvin - 273.15;
    }

    // Conversion Fahrenheit vers Celsius
    public static double FarenheitVersCelcius(double tFahrenheit) {
        return (tFahrenheit - 32) * 5 / 9;
    }

    // Conversion Celsius vers Fahrenheit
    public static double CelciusVersFarenheit(double tCelsius) {
        return (tCelsius * 9 / 5) + 32;
    }

    // Conversion Kelvin vers Fahrenheit en utilisant Kelvin -> Celsius puis Celsius -> Fahrenheit
    public static double KelvinVersFarenheit(double tKelvin) {
        double tCelsius = KelvinVersCelcius(tKelvin);
        return CelciusVersFarenheit(tCelsius);
    }

    // Conversion Fahrenheit vers Kelvin en utilisant Fahrenheit -> Celsius puis Celsius -> Kelvin
    public static double FarenheitVersKelvin(double tFahrenheit) {
        double tCelsius = FarenheitVersCelcius(tFahrenheit);
        return CelciusVersKelvin(tCelsius);
    }
}