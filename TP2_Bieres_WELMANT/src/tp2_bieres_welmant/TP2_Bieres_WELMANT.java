/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_welmant;

/**
 * @date 11/10/2024
 * @author Welmant Ariste
 */
public class TP2_Bieres_WELMANT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", (float) 7.0,"Dubuisson") ;
        uneBiere.lireEtiquette();
        BouteilleBiere uneBiere2 = new BouteilleBiere("Leffe", (float) 6.6,"Abbaye de Leffe") ;
        uneBiere2.lireEtiquette();
        BouteilleBiere uneBiere3 = new BouteilleBiere("Duvel", (float) 8.5, "Duvel Moortgat");
        uneBiere3.lireEtiquette();
        BouteilleBiere uneBiere4 = new BouteilleBiere("Chimay Bleue", (float) 9.0, "Abbaye de Scourmont");
        uneBiere4.lireEtiquette();
        BouteilleBiere uneBiere5 = new BouteilleBiere("Karmeliet Triple", (float) 8.4, "Bosteels");
        uneBiere5.lireEtiquette();

    }
    
}
