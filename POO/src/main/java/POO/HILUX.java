/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

/**
 *
 * @author dieba
 */
public class HILUX {
    public static void main(String[] args) {
        var HILUX = new Carro(2024,"Preto");
        
        System.out.println("Carro: Hilux");
        System.out.println("Ano:" + HILUX.ano);
        System.out.println("Cor:" + HILUX.cor);
        HILUX.ligar();
        HILUX.desligar();
        HILUX.acelerar();
                
                
    }
    
}
