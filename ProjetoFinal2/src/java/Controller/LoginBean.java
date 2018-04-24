/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.UsuarioDAO;
import Model.Usuario;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Cristhofer
 */

@ManagedBean(name="loginBean")
@ViewScoped
public class LoginBean {
    
      public UsuarioDAO usuarioDAO = new UsuarioDAO();
        private Usuario usuario = new Usuario();

  
        
        public String envia() {
              
              usuario = usuarioDAO.getUsuario(usuario.getNome(), usuario.getSenha());
              if (usuario == null) {
                    usuario = new Usuario();
                    FacesContext.getCurrentInstance().addMessage(
                               null,
                               new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuário não encontrado!",
                                           "Erro no Login!"));
                    return null;
              } else {
                    return "/home";
              }
              
              
        }
   
        public Usuario getUsuario() {
              return usuario;
        }
   
        public void setUsuario(Usuario usuario) {
              this.usuario = usuario;
        }
    
}
