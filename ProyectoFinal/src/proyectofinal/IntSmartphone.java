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
public class IntSmartphone implements IntDispositivos{

    public String encender() {
        String onS = "Smartphone encendido";
        return onS;
    }
    
    public String buscarApp() {
        String bAppS = "buscando ";
        return bAppS;
    }
    
    public String encontrado() {
        String enS = "Smartphone encontró ";
        return enS;
    }
    
}
