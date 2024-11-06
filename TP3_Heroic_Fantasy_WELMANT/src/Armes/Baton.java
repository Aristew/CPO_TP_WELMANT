/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author arist
 */
public class Baton extends Arme {
    int age;

    public Baton(String nom, int Attaque, int age) {
        super(nom, Attaque);
        this.age = Math.max(0,Math.min(age, 100));
    }
    @Override
    public String toString() {
        return super.toString() + ", Âge : " + age;
    }
   
    
    
}
