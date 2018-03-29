/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import DAO.UsuarioDAO;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
/**
 *
 * @author Cristhofer
 */


@ManagedBean(name ="login")
@SessionScoped
public class Login implements Serializable{
    
    
    private static final long serialVersionUID = 1L;
    
    private String username;
    
    private String password;
    
    private Usuario autenticado;

    public Login() {
    }
    
    public Usuario getAutenticado() {
        return autenticado;
    }

    public void setAutenticado(Usuario autenticado) {
        this.autenticado = autenticado;
    }
    

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    UsuarioDAO user = new UsuarioDAO();
    
    public String autenticar(){
        
      
      autenticado = user.buscar(username);
        
        
        
        if(autenticado !=null){ 
            if(autenticado.getSenha().equals(password))
                return "home";
        }
        
        return "invalido";
        
    }
    
    
    
}
