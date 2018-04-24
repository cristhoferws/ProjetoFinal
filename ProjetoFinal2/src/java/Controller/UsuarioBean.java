/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Usuario;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Cristhofer
 */

@ManagedBean(name="usuarioBean")
@SessionScoped
public class UsuarioBean implements Serializable {
    
    private Usuario usuario = new Usuario();

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
    
    
    private String salvar(){
        
        
        
        usuario.salvar();
        
        return "home.xhtml";
    }
    
    
    
}
