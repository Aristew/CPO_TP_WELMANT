/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_welmant;

/**
 *
 * @author arist
 */
public class Convertisseur {
    int nbConversions;
    
    public void Convertisseur(){
        nbConversions = 0;
    }
    // Conversion Celsius vers Kelvin
    public double CelciusVersKelvin(double tCelcius) {
        nbConversions++;
        return tCelcius + 273.15;
    }

    // Conversion Kelvin vers Celsius
    public double KelvinVersCelcius(double tKelvin) {
        nbConversions++;
        return tKelvin - 273.15;
    }

    // Conversion Fahrenheit vers Celsius
    public double FarenheitVersCelcius(double tFahrenheit) {
        nbConversions++;
        nbConversions++;
        return (tFahrenheit - 32) * 5 / 9;
    }

    // Conversion Celsius vers Fahrenheit
    public double CelciusVersFarenheit(double tCelsius) {
        nbConversions++;
        return (tCelsius * 9 / 5) + 32;
    }

    // Conversion Kelvin vers Fahrenheit en utilisant Kelvin -> Celsius puis Celsius -> Fahrenheit
    public double KelvinVersFarenheit(double tKelvin) {
        nbConversions++;
        double tCelsius = KelvinVersCelcius(tKelvin);
        return CelciusVersFarenheit(tCelsius);
    }

    // Conversion Fahrenheit vers Kelvin en utilisant Fahrenheit -> Celsius puis Celsius -> Kelvin
    public double FarenheitVersKelvin(double tFahrenheit) {
        nbConversions++;
        double tCelsius = FarenheitVersCelcius(tFahrenheit);
        return CelciusVersKelvin(tCelsius);
    }
    @Override
public String toString () {
return "nb de conversions"+ nbConversions;
}
}
