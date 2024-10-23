/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_welmant;

/**
 *
 * @author Ariste Welmant 
 * @date 23/10/2024
 */
public class TP2_Manip_WELMANT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tartiflette assiette1 = new Tartiflette(500) ;
        Tartiflette assiette2 = new Tartiflette(600) ;
        Tartiflette assiette3 = assiette2 ;
        /* on a crée 2 tartiflettes, assiette 2 et assiette 3 réferençent la même tartiflette. */ 
        System.out.println("nb de calories de Assiette 1 : " + assiette1.nbCalories) ;
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ;
        assiette3.nbCalories += 200; 
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;
        /*L'hypothêse est vérifiée*/
        assiette2 = assiette1;
        assiette1 = assiette3;
        System.out.println("nb de calories de Assiette 1 : " + assiette1.nbCalories) ;
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ;
        /* les deux lignes sont fausses, Non un objet ne peut pas référencer un autre type d'objet sans rapport */
        Moussaka[] tableauMoussaka = new Moussaka[10];
        for (int i = 0; i < tableauMoussaka.length ; i++) {
            tableauMoussaka[i] = new Moussaka(300 + i * 100);  // Par exemple, on varie les calories
        }

        // Affichage des calories de chaque Moussaka
        for (int i = 0; i < tableauMoussaka.length ; i++) {
            System.out.println("Moussaka " + i + " : " + tableauMoussaka[i].nbCalories + " calories");
        }
    }
    
}
