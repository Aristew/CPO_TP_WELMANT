/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author arist
 */
public class Epee extends Arme{
    int finesse;

    public Epee(String nom, int Attaque,int finesse) {
        super(nom, Attaque);
        this.finesse =  Math.max(0, Math.min(finesse, 100));
        
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Finesse : " + finesse;
    }
    
}
