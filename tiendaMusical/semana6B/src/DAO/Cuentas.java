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
public class Cuentas extends Tarjetas{
    private String numCuenta;
    
    public Cuentas(String numCuenta, String numTarjeta){
        super(numTarjeta);
        this.numCuenta = numCuenta;
    }
    
    public Cuentas(String numCuenta){
        super();
        this.numCuenta = numCuenta;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }
}
