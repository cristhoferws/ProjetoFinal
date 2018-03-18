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
    
    private String username;
    
    private String password;
        
    private UsuarioDAO userDao;
    
    private Usuario autenticado;

    
    
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
    
    
    public String autenticar(){
        
      
        autenticado = (Usuario) userDao.buscar(username);
        
        
        
        if(autenticado!=null){ 
            if(autenticado.getSenha().equals(password))
                return "layout.xhtml?faces-redirect=true";
        }
        
        return null;
        
    }
    
    
    
}
