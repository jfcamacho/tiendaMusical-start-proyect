/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author jeffersonfernandocamachomunoz
 */
public interface controladores {
    /**
     * 
     * @param temperatura recibe el valor de la temperatura actual
     * @return devuelve el valor necesario para regular la temperatura
     */
    public long controlarTemperatura(long temperatura);
    
    /**
     * 
     * @param presion recibe el valor de la presión actual
     * @return devuelve el valor necesario para regular la presión
     */
    public long controlarPresion(long presion);
}
