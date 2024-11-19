/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller12.Ejercicio1;

/**
 *
 * @author altoc
 */
public class Ave implements Cantante, Volador{
    
  
    private String tipo;

    public Ave(String tipo) {
        this.tipo = tipo;
    }

    // creo el metodo de volar
    @Override
    public void volar() {
        System.out.println("El " + tipo + " esta volando en el cielo");
    }

    // creo el metodo de cantar
    @Override
    public void cantar() {
        System.out.println("El " + tipo + " esta cantando muy bonito");
    }
}
