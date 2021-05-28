/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import dto.usuarioDTO;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author jeffersonfernandocamachomunoz
 */
@ManagedBean
@SessionScoped
public class ctrlSession {

    private usuarioDTO usuarioDTO;
    
    @PostConstruct
    public void init(){
        System.out.println("Cargando información del usuario en la sesión");
    }
    
    public usuarioDTO getUsuarioDTO() {
        return usuarioDTO;
    }

    public void setUsuarioDTO(usuarioDTO usuarioDTO) {
        this.usuarioDTO = usuarioDTO;
    }
}
