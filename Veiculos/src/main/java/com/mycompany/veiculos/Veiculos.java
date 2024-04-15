/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.veiculos;

/**
 *
 * @author Diego
 */
public class Veiculos {
        
        private String Marca;
        private String Modelo;
        private String Ano;
        private String Valor;
    
        public String getMarca(){
            return Marca;
        } 
        public String getModelo(){
            return Modelo;
        }
        public String getAno(){
            return Ano;
        }
        public String getValor(){
            return Valor;
        }
        
        public void setMarca(String Marca){
            this.Marca = Marca;
        }
        
        public void setModelo(String Modelo){
            this.Modelo = Modelo;
        }
        
        public void setAno(String Ano){
            this.Ano = Ano;
        }
        
        public void setValor(String Valor){
            this.Valor = Valor;
        }
        
            public static void main(String[] args) {
        Veiculos veiculos = new Veiculos();
        
        veiculos.setMarca("Nissan");
        
        veiculos.setModelo("BMW");
        
        veiculos.setAno("2008");
        
        veiculos.setValor("15.000");
        
                System.out.println("Marca:"+veiculos.getMarca());
                System.out.println("Modelo:"+veiculos.getModelo());
                System.out.println("Ano:"+veiculos.getAno());
                System.out.println("Valor:"+veiculos.getValor());
}
       
}

