/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entitys.empleado;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import services.empleadoService;

/**
 *
 * @author jeffersonfernandocamachomunoz
 */
@ManagedBean
@ViewScoped
public class ctrlPrincipal {
    private List<empleado> empleados;
    
    private empleadoService empleadoService = new empleadoService();
    
    @PostConstruct
    public void init(){
        this.consultarEmpleados();
    }
    
    public void consultarEmpleados(){
        this.empleados = this.empleadoService.consultarEmpleados();
    }

    public List<empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<empleado> empleados) {
        this.empleados = empleados;
    }
}
