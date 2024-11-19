/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller12.Ejercicio3;

import Taller12.Ejercicio3.Nadador;

/**
 *
 * @author altoc
 */
public class Persona implements Nadador{
    
    
    //debo implementar el metodo abstracto o si no no me va compilar
    
    @Override
    public void nadar() {
         System.out.println("La persona está nadando.");
    }
}
