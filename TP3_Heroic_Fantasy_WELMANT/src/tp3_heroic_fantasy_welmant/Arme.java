/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_welmant;

/**
 *
 * @author Welmant Ariste
 * @date 06/11/2024
 */
abstract class Arme {
    String Nom;
    int Attaque;

    public Arme(String nom, int niveauAttaque) {
        this.Nom = nom;
        this.Attaque = Math.min(niveauAttaque, 100);
    }
    
    public int getAttaque() {
        return Attaque;
    }
    
    public String getNom(){
        return Nom;
    }
    @Override
    public String toString() {
    return "Arme : " + Nom + "Niveau d'attaque :" + Attaque;
    }
    
}
