/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_welmant;

/**
 *
 * @author arist
 */
public class Personne {
    // Attributs
     String nom;
     String prenom;

    // Constructeur
    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    // Méthode toString pour représenter l'objet sous forme de chaîne de caractères
    @Override
    public String toString() {
        return "Personne{" +"nom='" + nom + '\'' +", prenom='" + prenom + '\'' +'}';
    }

    // Getters et setters (si nécessaire)
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
