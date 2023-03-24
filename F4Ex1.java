/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package f4ex1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class F4Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         Cliente c1 = new Cliente();
         Cliente c2 = new Cliente();
         
         
        System.out.println("Introduza o seu numero de conta");
        int conta = in.nextInt();
        System.out.println("Escolhe a operacao que deseja fazer ");
        System.out.println("1.Depositar");
        System.out.println("2.Levantar");
        int opcao=in.nextInt();
        switch (opcao){
            case 1:
                System.out.println("Introduza o valor que deseja depositar");
                double valor = in.nextDouble();
                System.out.println("A conta "+conta+" depositou "+c1.depositar(valor));break;
        
            case 2:
                System.out.println("Introduza o valor que deseja Levantar");
                valor = in.nextDouble();
                System.out.println("A conta "+conta+" depositou "+c1.sacar(valor));break;
        }
    }
    
}
