/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.Usuario;
import javax.faces.bean.ManagedBean;
/**
 *
 * @author Cristhofer
 */
@ManagedBean
public class UsuarioBean {
  
    public Usuario usuario = new Usuario();

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
    
}
