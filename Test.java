/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Jitty
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        class Character {
            int health;
            String name;
            
            Character() {
                health = 100;
                name = "Default";
            }
            Character(int HP) {
                health = HP;
                name = "Default";
            }
            Character(String charName) {
                health = 100;
                name = charName;
            }
            Character(String charName, int HP) {
                health = HP;
                name = charName;
            }
            
            int defense = 0;
            boolean alive = true;
            
            private void minusHealth(int damage) {
                health -= damage;
            }
            
            private void plusHealth(int heal) {
                health += heal;
            }
            
            private void setStatusAlive() {
                if (health <= 0) {
                    alive = false;
                    System.out.println(name + " has fallen! The battle is over!");
                }
                else {
                    System.out.println(name + " remains alive with " + health + "HP!");
                }
            }
            
            boolean checkStatusAlive() {
                if (alive == true) {
                    return true;
                }
                else {
                    return false;
                }
            }
            
            void attack(Character target, int damage) {
                if (target.checkStatusAlive() == true) {
                    target.minusHealth(damage);
                    target.setStatusAlive();
                }
                else {
                    System.out.println("That is an invalid target.");
                }
            }
        }
        
        Character Player1 = new Character("Juan", 150);
        Character Player2 = new Character("Ricardo", 125);
        
        Player1.attack(Player2, 50);
        Player2.attack(Player1, 75);
        Player1.attack(Player2, 200);
        Player1.attack(Player2, 15);
    }
    
}
