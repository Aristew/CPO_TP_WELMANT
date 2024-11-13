    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_welmant;

/**
 *
 * @author arist
 */
// Classe abstraite Personnage
public abstract class Personnage {
    private String nom;
    private int niveauDeVie;

    // Constructeur de Personnage
    public Personnage(String nom, int niveauDeVie) {
        this.nom = nom;
        this.niveauDeVie = niveauDeVie;
    }

    // Getter pour le niveau de vie
    public int getNiveauDeVie() {
        return niveauDeVie;
    }

    // Getter pour le nom
    public String getNom() {
        return nom;
    }

    // Méthode toString pour afficher les informations du personnage
    @Override
    public String toString() {
        return "Nom : " + nom + ", Niveau de Vie : " + niveauDeVie;
    }
}
