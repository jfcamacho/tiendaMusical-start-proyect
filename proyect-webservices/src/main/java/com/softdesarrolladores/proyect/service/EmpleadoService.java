/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softdesarrolladores.proyect.service;

import com.softdesarrolladores.proyect.entitys.Empleado;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jeffersonfernandocamachomunoz
 */
public class EmpleadoService {
    public Empleado consultarEmpleadoId(String numeroEmpleado){
        List<Empleado> empleados = this.consultarEmpleados();
        for(Empleado empleado : empleados){
            if(empleado.getNumeroEmpleado().equals(numeroEmpleado)){
                return empleado;
            }
        }
        return null;
    }
    
    public Empleado consultarEmpleado(){
        Empleado empleado = new Empleado();
        empleado.setNumeroEmpleado("12345");
        empleado.setNombre("Diego");
        empleado.setPrimerApellido("Cárdenas");
        empleado.setSegundoApellido("Hurtado");
        empleado.setEdad(23);
        empleado.setFechaCreacion(LocalDateTime.now());
        return empleado;
    }
    
    public List<Empleado> consultarEmpleados(){
        List<Empleado> empleados = new ArrayList();
        Empleado empleado = new Empleado();
        empleado.setNumeroEmpleado("12345");
        empleado.setNombre("Diego");
        empleado.setPrimerApellido("Cárdenas");
        empleado.setSegundoApellido("Hurtado");
        empleado.setEdad(23);
        empleado.setFechaCreacion(LocalDateTime.now());
        
        Empleado empleadoNuevo = new Empleado();
        empleadoNuevo.setNumeroEmpleado("23121");
        empleadoNuevo.setNombre("Jaime");
        empleadoNuevo.setPrimerApellido("Benitez");
        empleadoNuevo.setSegundoApellido("Salinas");
        empleadoNuevo.setEdad(29);
        empleadoNuevo.setFechaCreacion(LocalDateTime.now());
        
        empleados.add(empleado);
        empleados.add(empleadoNuevo);
        
        return empleados;
    }
}
