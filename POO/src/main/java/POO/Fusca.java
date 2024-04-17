/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

/**
 *
 * @author dieba
 */
public class Fusca {
      public static void main(String[] args) {
        Carro Fusca = new Carro();
        Fusca.ano = 1980;
        Fusca.cor = "Verde";
        System.out.println("Carro: Fuscão");
        System.out.println("Ano:" + Fusca.ano);
        System.out.println("Cor:" + Fusca.cor);
        Fusca.ligar();
        Fusca.desligar();
        Fusca.acelerar();
                
                
    }
    
}
