/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacion;

import entity.CalderaEntity;
import services.CalderaServices;

/**
 *
 * @author jeffersonfernandocamachomunoz
 */
public class principal {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        CalderaServices calderaServices = new CalderaServices();
        CalderaEntity calderaEntity = new CalderaEntity();
        calderaEntity.definirParametros(true, 25, 46, 65);
        calderaServices.monitoreo();
    }
    
}
