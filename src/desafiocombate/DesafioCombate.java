/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafiocombate;

import Entities.Champion;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class DesafioCombate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int turnos;
        
        String name1, name2;
        int life1 , life2, attack1, attack2, armor1, armor2;
        
        System.out.println("Digite os dados do primeiro campeão: ");
        System.out.print("Nome: ");
        name1 = sc.nextLine();
        System.out.print("Vida inicial: ");
        life1 = sc.nextInt();
        System.out.print("Ataque: ");
        attack1 = sc.nextInt();
        System.out.print("Armadura: ");
        armor1 = sc.nextInt();
        System.out.println("");
        
        System.out.println("Digite os dados do segundo campeão: ");
        System.out.print("Nome: ");
        name2 = sc.next();
        System.out.print("Vida inicial: ");
        life2 = sc.nextInt();
        System.out.print("Ataque: ");
        attack2 = sc.nextInt();
        System.out.print("Armadura: ");
        armor2 = sc.nextInt();
        System.out.println("");
        
        System.out.print("Quantos turnos você deseja executar? ");
        turnos = sc.nextInt();
        
        Champion champion1 = new Champion(name1, life1, attack1, armor1);
        Champion champion2 = new Champion(name2, life2, attack2, armor2);
        
        for (int i = 0; i < turnos; i++){
            champion1.takeDamage(champion2);
            System.out.println(champion1.status());
            champion2.takeDamage(champion1);
            System.out.println(champion2.status());
            System.out.println("");
            
            if (champion1.getLife() <=  0 || champion2.getLife() <= 0){
                System.out.println("FIM DO COMBATE");
                break;
            }
        }
        
        
    }
    
}
