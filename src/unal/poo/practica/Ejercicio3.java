/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.practica;
import becker.robots.*;
import static unal.poo.practica.Ejercicio3.estudiante;
import static unal.poo.practica.Ejercicio3.objetos;

/**
 *
 * @author Estudiante
 */
public class Ejercicio3 {
    public static City objetos;
    public static Robot estudiante;
    
        public static void main (String[] args){
            objetos = new City("ciudad2");
            objetos.showThingCounts(true);
            
            estudiante = new Robot(objetos,1, 0, Direction.EAST,0);
            
            
        }
}
