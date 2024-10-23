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
    private String nom;
    private String prenom;
    private Voiture[] voitures; // Tableau des voitures possédées
    private int nombreVoitures; // Nombre de voitures possédées

    // Constructeur
    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.voitures = new Voiture[3]; // Initialiser le tableau pour 3 voitures
        this.nombreVoitures = 0; // Initialiser le compteur de voitures
        
    }

    // Méthode toString pour représenter l'objet sous forme de chaîne de caractères
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Personne{")
          .append("nom='").append(nom).append('\'')
          .append(", prenom='").append(prenom).append('\'')
          .append(", voitures=[");
        
        for (int i = 0; i < nombreVoitures; i++) {
            sb.append(voitures[i].toString());
            if (i < nombreVoitures - 1) {
                sb.append(", ");
            }
        }
        sb.append("]}");
        return sb.toString();
    }

    // Getters et setters
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

    // Méthode pour ajouter une voiture
    public void ajouterVoiture(Voiture voiture) {
        if (nombreVoitures < 3) { // Vérifier si la personne peut avoir jusqu'à trois voitures
            voitures[nombreVoitures] = voiture; // Ajouter la voiture au tableau
            voiture.setProprietaire(this); // Définir la personne comme propriétaire de la voiture
            nombreVoitures++; // Incrémenter le nombre de voitures
        } else {
            System.out.println("Cette personne ne peut pas avoir plus de trois voitures.");
        }
    }

    // Méthode pour obtenir la liste des voitures
    public Voiture[] getVoitures() {
        return voitures;
    }

    // Méthode pour obtenir le nombre de voitures
    public int getNombreVoitures() {
        return nombreVoitures;
    }
}
