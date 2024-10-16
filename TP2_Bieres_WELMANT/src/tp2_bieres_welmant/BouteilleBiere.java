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
    public boolean Décapsuler(){
        if (Ouverte == false) {
        Ouverte = true;
        return true;
        }else {
                System.out.println("erreur : bière déjà ouverte");
                return false;
                }

        }
    public BouteilleBiere(String unNom, float unDegre, String
    uneBrasserie) {
    nom = unNom;
    degreAlcool = unDegre;
    brasserie = uneBrasserie;
    Ouverte = false;
    }
    @Override
    public String toString() {
        String chaine_a_retourner;
    chaine_a_retourner = nom + " (" + degreAlcool + " degrés)Ouverte ? ";
    if (Ouverte == true ) chaine_a_retourner += "oui" ;
    else chaine_a_retourner += "non" ;
    return chaine_a_retourner ;
}
}
