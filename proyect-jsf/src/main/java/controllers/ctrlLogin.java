/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import dto.usuarioDTO;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 *
 * @author jeffersonfernandocamachomunoz
 */
@ManagedBean
public class ctrlLogin {

    private String usuario;
    private String password;
    
    @ManagedProperty("#{ctrlSession}")
    private ctrlSession ctrlSession;

    public void ingresar() {
        System.out.println("Usuario.: " + usuario);
        if (usuario.equals("admin") && password.equals("admin")) {
            try {
                usuarioDTO usuarioDto = new usuarioDTO();
                usuarioDto.setUsuario(this.usuario);
                usuarioDto.setPassword(this.password);
                this.ctrlSession.setUsuarioDTO(usuarioDto);
                this.redireccionar("principal.xhtml");
            } catch (IOException ex) {
                FacesContext.getCurrentInstance().addMessage("formLogin:txtUsuario", 
                    new FacesMessage(FacesMessage.SEVERITY_FATAL, "La página no existe", ""));
            }
            
        } else {
            FacesContext.getCurrentInstance().addMessage("formLogin:txtUsuario", 
                    new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario y/o contraseña incorrectos", ""));
        }
    }
    
    private void redireccionar(String pagia) throws IOException{
        ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
        ec.redirect(pagia);
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ctrlSession getCtrlSession() {
        return ctrlSession;
    }

    public void setCtrlSession(ctrlSession ctrlSession) {
        this.ctrlSession = ctrlSession;
    }
    

}
