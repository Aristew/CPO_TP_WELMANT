/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_welmant;

/**
 *
 * @author arist
 */
// Classe Guerrier héritant de Personnage
public class Guerrier extends Personnage {
    private boolean aCheval;

    // Constructeur de Guerrier
    public Guerrier(String nom, int niveauDeVie, boolean aCheval) {
        super(nom, niveauDeVie);
        this.aCheval = aCheval;
    }

    // Setter pour aCheval
    public void setACheval(boolean aCheval) {
        this.aCheval = aCheval;
    }

    // Getter pour aCheval
    public boolean isACheval() {
        return aCheval;
    }

    @Override
    public String toString() {
        return super.toString() + ", À cheval : " + (aCheval ? "Oui" : "Non");
    }
}
