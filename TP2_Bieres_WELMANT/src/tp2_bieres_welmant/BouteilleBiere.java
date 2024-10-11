package tp2_bieres_welmant;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Welmant Ariste
 */
public class BouteilleBiere {
    String nom;
    float degreAlcool;
    String brasserie;
    boolean Ouverte;
    public void lireEtiquette() {
        System.out.println("Bouteille de " + nom +" (" + degreAlcool + " degres) \nBrasserie : " + brasserie ) ;
}
    public void Décapsuler(){
        if (Ouverte == false) {
        Ouverte = true;
        }
    }
    public BouteilleBiere(String unNom, float unDegre, String
    uneBrasserie) {
    nom = unNom;
    degreAlcool = unDegre;
    brasserie = uneBrasserie;
    Ouverte = false;
    }
}
