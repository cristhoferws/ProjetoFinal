/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.LoginDao;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.jboss.weld.context.RequestContext;

/**
 *
 * @author Cristhofer
 */
@ManagedBean(name = "login")
@SessionScoped
public class LoginController implements Serializable{
    
    private String username;
    private String password;
    private final LoginDao query = new LoginDao();
    
    public String loginController(){
        if (query.loginControl(username,password)){
            return "home.xhtml?faces-redirect=true";
        }
        /*
        RequestContext.getCurrentInstance().update("growl");
        FacesContext context = FacesContext.getCurrrentInstance();
        context.addMessage(null,new FacesMessage(FacesMessage.SEVERITY_ERROR,"Error","Username or password invalid!"));
        */
        return "";
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
    
    
    
    
}
