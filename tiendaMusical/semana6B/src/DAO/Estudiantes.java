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
public class Estudiantes{
    private String carrera;
    private int ciclo;
    
    public Estudiantes(String nombre, String apellido, String direccion, String carrera, int ciclo){
        this.carrera = carrera;
        this.ciclo = ciclo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getCiclo() {
        return ciclo;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }
    
}
