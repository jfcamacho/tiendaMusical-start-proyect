package client;

import DTO.EmpleadoDTO;
import java.time.LocalDateTime;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class EmpleadoWSC {
    /**
     * @param args
     */
    public static void main(String[] args){
        
        // ::::::::::::::: GET ::::::::::::::::::::::
//        Client client = ClientBuilder.newClient();
//        WebTarget webTarget = client.target("http://localhost:8080/proyect-webservices-1.0-SNAPSHOT/softdesarrolladores/empleadosWS").path("consultarEmpleadoId").path("12345");
//        
//        Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON);
//        Response response = invocationBuilder.get();
//        
//        if(response.getStatus() == 304){
//            System.out.println("No se encontró el empleado con el número de cliente");
//        }else if(response.getStatus() == 200){
//            
//            EmpleadoDTO empleado = response.readEntity(EmpleadoDTO.class);
//
//            System.out.println("Nombre de empleado " + empleado.getNombre());
//            System.out.println("Fecha creación " + empleado.getFechaCreacion());
//            System.out.println("Apellido " + empleado.getPrimerApellido());
//        }

        // ::::::::::::::: POST ::::::::::::::::::::::
        Client client = ClientBuilder.newClient();
        WebTarget webTarget = client.target("http://localhost:8080/proyect-webservices-1.0-SNAPSHOT/softdesarrolladores/empleadosWS").path("guardarEmpleado");
        
        EmpleadoDTO empleado = new EmpleadoDTO();
        empleado.setNombre("Jefferson");
        empleado.setPrimerApellido("Camacho");
        empleado.setSegundoApellido("Muñoz");
        empleado.setEdad(31);
        empleado.setFechaCreacion(LocalDateTime.now());
        
        Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON);
        Response response = invocationBuilder.post(Entity.entity(empleado, MediaType.APPLICATION_JSON));
        
        System.out.println(response.getStatus());
        System.out.println(response.readEntity(String.class));
    }
}
