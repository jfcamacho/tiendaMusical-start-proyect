/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entitys.empleado;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jeffersonfernandocamachomunoz
 */
public class empleadoService {
    public List<empleado> consultarEmpleados(){
        List<empleado> empleados = new ArrayList<empleado>();
        empleado empleadoIBM = new empleado("Diego", "Cárdenas", "Gutierrez", "Gerente", true);
        empleado empleadoMicrosoft = new empleado("Anabel", "Ramirez", "Contreras", "Cajera", true);
        empleado empleadoApple = new empleado("Cecilia", "Santander", "Jiménez", "Administradora", false);
        
        empleados.add(empleadoIBM);
        empleados.add(empleadoMicrosoft);
        empleados.add(empleadoApple);
        
        return empleados;
    }
}