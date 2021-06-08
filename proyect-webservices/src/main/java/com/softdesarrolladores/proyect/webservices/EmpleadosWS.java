/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softdesarrolladores.proyect.webservices;

import com.softdesarrolladores.proyect.entitys.Empleado;
import com.softdesarrolladores.proyect.service.EmpleadoService;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author jeffersonfernandocamachomunoz
 */
@Path("empleadosWS")
public class EmpleadosWS {
    
    private EmpleadoService empleadoService = new EmpleadoService();
    
    @GET
    @Path("test")
    public String test() {
        return "Probando webservices con Jersey";
    }
    
    @GET
    @Path("consultarEmpleado")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Empleado consultarEmpleado(){
        return this.empleadoService.consultarEmpleado();
    }
    
    @GET
    @Path("consultarEmpleados")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Empleado> consultarEmpleados(){
        return this.empleadoService.consultarEmpleados();
    }
    
    @GET
    @Path("consultarEmpleadoId/{numEmp}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response consultarEmpleadoId(@PathParam("numEmp") String numeroEmpleado){
        Empleado empleado =  this.empleadoService.consultarEmpleadoId(numeroEmpleado);
        if(empleado == null){
            return Response.noContent().build();
        }
        
        GenericEntity<Empleado> empleadoGeneric = new GenericEntity<Empleado>(empleado, Empleado.class);
        return Response.ok(empleadoGeneric).build();
    }
    
    @POST
    @Path("guardarEmpleado")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response guardarEmpleado(Empleado empleado){
        if(empleado == null){
            return Response.status(400).entity("No se ingreso información del empleado").build();
        }
        
        if(empleado.getNombre() == null || empleado.getNombre().isEmpty()){
            return Response.status(400).entity("El nombre es requerido").build();
        }
        GenericEntity<Empleado> empleadoGeneric = new GenericEntity<Empleado>(empleado, Empleado.class);
        return Response.ok(empleadoGeneric).build();
    }
}
