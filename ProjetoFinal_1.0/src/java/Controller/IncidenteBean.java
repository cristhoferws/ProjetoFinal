/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.Incidente;
import javax.faces.bean.ManagedBean;
/**
 *
 * @author Cristhofer
 */
@ManagedBean
public class IncidenteBean {
    
    public Incidente incidente = new Incidente();

    public Incidente getIncidente() {
        return incidente;
    }

    public void setIncidente(Incidente incidente) {
        this.incidente = incidente;
    }
    
    
    
}
