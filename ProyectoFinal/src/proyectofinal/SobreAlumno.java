/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

/**
 *
 * @author Marco
 */
public class SobreAlumno extends SobreMaestro{
    public String presentarse(){
        String saludo="Hola, yo soy ";
        return saludo+ "el alumno ";
    }
    public int hacerTarea(int b){
        return 4*b;
    }
    public int hacerTarea(int a, int b){
        return a*b;
    }
    public int hacerTarea(int b, int h, int c){
        return b*h*c;
    } 
}
