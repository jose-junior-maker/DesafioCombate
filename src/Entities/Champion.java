/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author usuario
 */
public class Champion {
    
    private String name;
    private int life;
    private int attack;
    private int armor;
    
    public Champion(String name, int life, int attack, int armor) {
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.armor = armor;
    }
    
    public void takeDamage(Champion champion){
        if (champion.getAttack() < armor){
            life = life - 1;
        }else{
            life = life + armor - (champion.getAttack());
        }
        
        
    }
    
    public String status(){
        if(life <= 0){
           return name + ": " + 0 + " de vida (morreu)";
        }else{
           return name + ": " + life + " de vida";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }
    
    
}
