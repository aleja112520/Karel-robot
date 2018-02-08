package unal.poo.practica;

import becker.robots.*;
import static unal.poo.practica.RobotBase.estudiante;

/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class RobotBase
{    
       //Declaracion de Variables -- Forma temporal - No es buena practica tener
       //variables estaticas
        public static City objetos;
        public static Robot estudiante;
        
	public static void main (String[] args){
            //Declarar la creacion de la ciudad
            objetos = new City("Field.txt");
            //cambiar field.txt por el nombre de la ciudad
	    objetos.showThingCounts(true);
            
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            estudiante = new Robot(objetos,0, 2, Direction.WEST,0);//o, 2 direccion, y 10 el numero de bolitas que tiene
            
            rotacion(2);
	    creacionFuncion(1);
            rotacion(3);
            creacionFuncion(3);
            rotacion(3);
            creacionFuncion(3);
            rotacion(3);
            creacionFuncion(3);
            rotacion(3);
            creacionFuncion(2);
            rotacion(2);
            
            /*//Mover una interseccion en el sentido al cual este apuntando el objeto.
            estudiante.move ();
            estudiante.move ();*/
                       
            /*//Tomando decisiones, Si puedo tomar un Thing
            boolean puedeTomar = estudiante.canPickThing();
            
            //Tomar un Thing
            if(puedeTomar == true)
               estudiante.pickThing();
            
            //Especifica el numero de Thing que tiene en robot en el bolso
            int numeroThings = estudiante.countThingsInBackpack();
            
            //Poner Thing, se debe validar que tenga things en el bolso
            estudiante.putThing();
                    
                       
            //Si el frente esta libre de Wall
            estudiante.frontIsClear();*/
                      
            /*
            //Toman un Thing
            estudiante.pickThing();*/
                       
	}
        
        public static void creacionFuncion(int parametroEntrada){
            for (int i = 0; i < parametroEntrada; i++) 
                estudiante.move();
        }


        public static void rotacion(int Entrada){
            for (int i=0; i < Entrada; i++)
                estudiante.turnLeft();
        }
}