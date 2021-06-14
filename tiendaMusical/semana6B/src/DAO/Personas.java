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
public class Personas extends Cuentas{
    private String nombres;
    private String apellidos;
    private String direccion;
    private static int numPersonas;
    
    /**
     * 
     * @param nombres de las personas ingresadas
     * @param apellidos de las personas ingresadas
     * @param direccion de las personas ingresadas
     */

    public Personas(String nombres, String apellidos, String direccion, String numCuenta) {
        super(numCuenta);
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        numPersonas++;
    }

    public Personas(String nombres, String apellidos, String direccion, String numCuenta, String numTarjeta) {
        super(numCuenta, numTarjeta);
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        numPersonas++;
    }
    
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    @Override
    public String toString(){
        return "La persona es " + this.getNombres() + " " 
                + this.getApellidos() + " vieve en "
                + this.getDireccion() + " su número de cuenta es "
                + this.getNumCuenta() + " y su tarjeta es "
                + this.getNumTarjeta();
    }
    
}
