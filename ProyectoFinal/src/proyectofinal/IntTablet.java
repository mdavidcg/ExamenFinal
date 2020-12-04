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
public class IntTablet implements IntDispositivos{

    public String encender() {
        String onT = "Tablet Encendida";
        return onT;
    }

    public String buscarApp() {
        String bAppT= "buscando ";
        return bAppT;
        
    }

    public String encontrado() {
        String enT = "Tablet encontró ";
        return enT;
        
    }
    
}
