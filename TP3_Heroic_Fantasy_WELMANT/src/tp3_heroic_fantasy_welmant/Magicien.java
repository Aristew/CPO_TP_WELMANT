/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_welmant;

/**
 *
 * @author arist
 */
// Classe Magicien héritant de Personnage
public class Magicien extends Personnage {
    private boolean confirme;

    // Constructeur de Magicien
    public Magicien(String nom, int niveauDeVie, boolean confirme) {
        super(nom, niveauDeVie);
        this.confirme = confirme;
    }

    // Setter pour confirme
    public void setConfirme(boolean confirme) {
        this.confirme = confirme;
    }

    // Getter pour confirme
    public boolean isConfirme() {
        return confirme;
    }

    @Override
    public String toString() {
        return super.toString() + ", Confirmé : " + (confirme ? "Oui" : "Non");
    }
}

