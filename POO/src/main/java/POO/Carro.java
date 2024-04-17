package POO;

import java.util.Random;

/**
 *
 * @author Diego 
 */
public class Carro {
    
    int ano;
    String cor;
    public Carro(){//Gerador de Numeros Aleatorios!
        Random gerador = new Random();
        int chassi = gerador.nextInt(1000);
        
           
        System.out.println("Chassis: " + chassi);
        
    }
    public Carro(int ano,String cor){ // Criação de parametro!
        this.ano = ano;
        this.cor = cor;
    }
    
    void ligar(){//primeiro método
        System.out.println("Engine ON");
    }
    void desligar(){//segundo método
        System.out.println("Engine OF");
    }
    void acelerar(){//terceiro método
        System.out.println("VRUMMM");
    }
    
}
