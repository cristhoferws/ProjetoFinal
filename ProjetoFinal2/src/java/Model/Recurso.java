/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import DAO.IncidenteDAO;
import DAO.RecursoDAO;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 *
 * @author Cristhofer
 */
@Entity
public class Recurso implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name="id_rec")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    
    
   
    private String tipo;
    
    
    private String especificacoes;
    
   
    private String secretaria;
    
  
    private String setor;
    
 
    private int patrimonio;
    
    
    private String numSerie;
    

    private String etiqueta;

    
   
    
    public Recurso(){}
    
    public Recurso(String tipo, String especificacoes, String secretaria, String setor, int patrimonio, String numSerie, String etiqueta) {
        this.tipo = tipo;
        this.especificacoes = especificacoes;
        this.secretaria = secretaria;
        this.setor = setor;
        this.patrimonio = patrimonio;
        this.numSerie = numSerie;
        this.etiqueta = etiqueta;
    }
    
    
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEspecificacoes() {
        return especificacoes;
    }

    public void setEspecificacoes(String especificacoes) {
        this.especificacoes = especificacoes;
    }

    public String getSecretaria() {
        return secretaria;
    }

    public void setSecretaria(String secretaria) {
        this.secretaria = secretaria;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public int getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(int patrimonio) {
        this.patrimonio = patrimonio;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }
    
    RecursoDAO rec = new RecursoDAO();
    
    public void salvar(){
        
      rec.salvar(this);
       
    }
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Recurso)) {
            return false;
        }
        Recurso other = (Recurso) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Classes.Recurso[ id=" + id + " ]";
    }
    
}
