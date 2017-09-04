/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;
import Model.Gerencia;
import javax.faces.bean.ManagedBean;
/**
 *
 * @author Cristhofer
 */
@ManagedBean
public class GerenciaBean {
    
    private Gerencia gerencia = new Gerencia();

    public Gerencia getGerencia() {
        return gerencia;
    }

    public void setGerencia(Gerencia gerencia) {
        this.gerencia = gerencia;
    }
    
    
    
    
}
