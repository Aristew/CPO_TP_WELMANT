/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_welmant;
import Armes.Arme;
import Armes.Baton;
import Armes.Epee;
import java.util.ArrayList;

/**
 *
 * @author ariste Welmant
 * @date 06/11/2024
 */
public class TP3_Heroic_Fantasy_WELMANT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Epee Excalibur = new Epee("Excalibur", 7,5);
        Epee Durandal = new Epee("Durandal", 4,7);
        Baton Chene = new Baton("Chêne",4,5);
        Baton Charme = new Baton("Charme", 5, 6);
        
        ArrayList<Arme> armes = new ArrayList<>();

        // Ajout des armes à la liste
        armes.add(Excalibur);
        armes.add(Durandal);
        armes.add(Chene);
        armes.add(Charme);

        // Affichage des armes
        for (int i = 0; i < armes.size(); i++) {
            System.out.println(armes.get(i));
    }
}
}
