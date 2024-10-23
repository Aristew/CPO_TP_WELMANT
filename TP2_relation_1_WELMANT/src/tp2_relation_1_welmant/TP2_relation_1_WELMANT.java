/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_welmant;

/**
 *
 * @author Ariste Welmant 
 */
public class TP2_relation_1_WELMANT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ;
        Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ;
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");
        System.out.println("liste des voitures disponibles "+ uneClio + "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;
        bob.liste_voitures[0] = uneClio;
        uneClio.proprietaire = bob ;
        bob.nbVoitures += 1;
        System.out.println("la premiere voiture de Bobby est " + bob.liste_voitures[bob.nbVoitures - 1] ) ;
        bob.liste_voitures[1] = une2008 ;
        bob.nbVoitures += 1;
        une2008.proprietaire = bob;
        reno.liste_voitures[0] = uneAutreClio;
        reno.nbVoitures += 1;
        uneAutreClio.proprietaire = reno;
        System.out.println("la premiere voiture de Reno est " + reno.liste_voitures[reno.nbVoitures - 1] ) ;
        reno.liste_voitures[1] = uneMicra;
        reno.nbVoitures += 1;
        uneMicra.proprietaire = reno;
        System.out.println("la deuxième voiture de Bobby est " + bob.liste_voitures[bob.nbVoitures - 1] ) ;
        System.out.println("la deuxième voiture de Reno est " + reno.liste_voitures[reno.nbVoitures - 1] ) ;
    }
  
}
