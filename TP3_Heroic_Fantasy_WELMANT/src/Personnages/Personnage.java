    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author arist
 */
// Classe abstraite Personnage
import Armes.Arme;
import Armes.Baton;
import Armes.Epee;
import java.util.ArrayList;
import tp3_heroic_fantasy_welmant.EtreVivant;

public abstract class Personnage implements EtreVivant{
    private String nom;
    private int niveauVie;
    private ArrayList<Arme> inventaire;  // Liste dynamique d'armes avec limite de 5
    private Arme armeEnMain;  // Arme actuellement équipée (initialisée à null)
    
    
    // Attribut statique pour compter le nombre total de personnages
    private static int nombrePersonnages = 0;

    public Personnage(String nom, int niveauVie) {
        this.nom = nom;
        this.niveauVie = niveauVie;
        this.inventaire = new ArrayList<>();
        this.armeEnMain = null;
        
        // Incrémenter le compteur de personnages lors de la création
        nombrePersonnages++;
    }

    // Méthode statique pour obtenir le nombre de personnages
    public static int getNombrePersonnages() {
        return nombrePersonnages;
    }
    
    public int getNiveauVie() {
        return niveauVie;
    }
    
    public String getNom() {
        return nom;
    }

    // 32. Méthode pour ajouter une arme à l'inventaire (max 5 armes)
    public void ajouterArme(Arme arme) {
        if (inventaire.size() < 5) {
            inventaire.add(arme);
            System.out.println("Arme " + arme.getNom() + " ajoutée à l'inventaire de " + nom);
        } else {
            System.out.println("Inventaire plein ! Impossible d'ajouter l'arme " + arme.getNom());
        }
    }

    // 34. Getter pour obtenir l'arme actuellement équipée
    public Arme getArmeEnMain() {
        return armeEnMain;
    }
    
    // 35. Méthode pour équiper une arme par son nom
    public void equiperArme(String nomArme) {
        for (Arme arme : inventaire) {
            if (arme.getNom().equals(nomArme)) {
                armeEnMain = arme;
                System.out.println(nom + " a équipé l'arme " + nomArme);
                return;
            }
        }
        System.out.println("L'arme " + nomArme + " n'est pas dans l'inventaire de " + nom);
    }
    
    public int compterArmesDePredilection() {
        int compteur = 0;
        for (Arme arme : inventaire) {
            if ((this instanceof Guerrier && arme instanceof Epee) ||
                (this instanceof Magicien && arme instanceof Baton)) {
                compteur++;
            }
        }
        return compteur;
    }

    /**
     *
     * @throws Throwable
     */
    @Override
    protected void finalize() throws Throwable {
        try {
            nombrePersonnages--;  // Décrémentation lors de la destruction de l'objet
        } finally {
            super.finalize();  // Appel à la méthode finalize() de la superclasse
        }
    }
    @Override
    public void seFatiguer() {
        // La fatigue fait perdre 10 points de vie à chaque appel
        niveauVie -= 10;
        System.out.println(nom + " se fatigue, perte de 10 points de vie.");
    }
    
    @Override
    public boolean estVivant() {
        // Un personnage est vivant tant que son niveau de vie est supérieur à 0
        return niveauVie > 0;
    }
     @Override
    public void estAttaque(int points) {
        // Quand un personnage est attaqué, il perd un certain nombre de points de vie
        niveauVie -= points;
        System.out.println(nom + " a ete attaque et a perdu " + points + " points de vie.");
    }
    @Override
    public String toString() {
        String description = "Nom : " + nom + ", Niveau de Vie : " + niveauVie;
        if (armeEnMain != null) {
            description += ", Arme en Main : " + armeEnMain;
        } else {
            description += ", Pas d'arme equipee";
        }
        return description;
    }
}


