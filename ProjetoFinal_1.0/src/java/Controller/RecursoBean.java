/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.Recurso;
import javax.faces.bean.ManagedBean;
/**
 *
 * @author Cristhofer
 */
@ManagedBean
public class RecursoBean {

    public Recurso recurso = new Recurso();

    public Recurso getRecurso() {
        return recurso;
    }

    public void setRecurso(Recurso recurso) {
        this.recurso = recurso;
    }
    
    
    
}
