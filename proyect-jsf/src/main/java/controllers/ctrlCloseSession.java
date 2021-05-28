/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 *
 * @author jeffersonfernandocamachomunoz
 */
@ManagedBean
public class ctrlCloseSession {
    
    @PostConstruct
    public void init(){
        System.out.println("Cerrar Sesión");
    }
    
    public void cerrarSession() throws IOException{
        ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
        ec.invalidateSession();
        this.redireccionar("login.xhtml");
    }
    private void redireccionar(String pagia) throws IOException{
        ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
        ec.redirect(pagia);
    }
    
}
