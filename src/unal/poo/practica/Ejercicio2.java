/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.practica;
import becker.robots.*;
import static unal.poo.practica.RobotBase.estudiante;
import static unal.poo.practica.RobotBase.objetos;
/**
 *
 * @author Estudiante
 */
public class Ejercicio2 {
    public static City objetos;
    public static Robot estudiante;
    
        public static void main (String[] args){
            objetos = new City("ciudad1");
            objetos.showThingCounts(true);
            
            estudiante = new Robot(objetos,1, 2, Direction.SOUTH,0);
                
            rotacion(3);
            estudiante.move();
            rotacion(1);
            estudiante.move();
            rotacion(1);
            estudiante.move();
            estudiante.pickThing();
            rotacion(2);
            estudiante.move();
            rotacion(3);
            estudiante.move();
            rotacion(3);
            estudiante.move();
            rotacion(3);
        }
        
        public static void rotacion(int Entrada){
            for(int i=0;i<Entrada;i++)
                estudiante.turnLeft();
        }
        
}
