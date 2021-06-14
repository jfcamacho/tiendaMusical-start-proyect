/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author jeffersonfernandocamachomunoz
 */
public class CalderaEntity {
    
    //Definir los parámetros necesarios para que el sistema conserve los valores definidos 
    
    public boolean stateCaldera;
    public int monitoreoTime;
    public int temperaturaMaxima;
    public int presionMaxima;

    public void definirParametros(boolean steCaldera, int monTime, int tempMaxima, int preMaxima){
        stateCaldera = steCaldera;
        monitoreoTime = monTime;
        temperaturaMaxima = tempMaxima;
        presionMaxima = preMaxima;
    }

    public boolean isStateCaldera() {
        return stateCaldera;
    }

    public int getMonitoreoTime() {
        return monitoreoTime;
    }

    public int getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    public int getPresionMaxima() {
        return presionMaxima;
    }
    
    
}
