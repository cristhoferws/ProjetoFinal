/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import javax.faces.bean.ManagedBean;
import java.util.Date;

/**
 *
 * @author 0067156
 */
@ManagedBean
public class Gerencia {
    
    private String urgencia;
    private String impacto;
    private String atribOperador;
    private Date dataVencimento;
    private String sla;

    public Gerencia() {
    }

    public String getUrgencia() {
        return urgencia;
    }

    public void setUrgencia(String urgencia) {
        this.urgencia = urgencia;
    }

    public String getImpacto() {
        return impacto;
    }

    public void setImpacto(String impacto) {
        this.impacto = impacto;
    }

    public String getAtribOperador() {
        return atribOperador;
    }

    public void setAtribOperador(String atribOperador) {
        this.atribOperador = atribOperador;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getSla() {
        return sla;
    }

    public void setSla(String sla) {
        this.sla = sla;
    }
    
    
    
    
    
}
