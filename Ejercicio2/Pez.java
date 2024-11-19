/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller12.Ejercicio2;

/**
 *
 * @author altoc
 */
public class Pez implements Nadador, Respirador {
    
      
    private String especie; 

    public Pez(String especie) {
        this.especie = especie;
    }

    //creacion del metodo
    @Override
    public void nadar() {
        System.out.println("El " + especie + " esta nadando en el agua");
    }

    //creacion del metodo
    @Override
    public void respirar() {
        System.out.println("El " + especie + " esta respirando bajo el agua en el estanque");
    }
    
    
}
