/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entity.CalderaEntity;

/**
 *
 * @author jeffersonfernandocamachomunoz
 * Implementar las interfaces de controladores y sensores
 * Implementar en esta clase todas las opciones del menu
 */
public class CalderaServices {
    
    public void monitoreo() throws InterruptedException{
        int contador = 0;
        CalderaEntity calderaEntity = new CalderaEntity();
        CalderaFileServices calderaFileServices = new CalderaFileServices();
        //Definir los parámetros necesarios para que el sistema funcione por el tiempo establecido por el susuario
        // System.out.println("El tiempo de monitoreo es.: " + calderaEntity.getMonitoreoTime());
        while(contador < 10){
            Thread.sleep(1000l);
            contador++;
            //Almacenar los datos resultantes de la lectura de los sensores
            //------- calderaFileServices.guardarDatos();
        }
        //Almacenar los datos resultantes de la lectura de los sensores
        //------- calderaFileServices.guardarDatos();
    }
}
