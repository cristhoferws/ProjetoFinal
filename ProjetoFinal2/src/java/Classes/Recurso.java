/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Cristhofer
 */
@Entity
public class Recurso implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    
    @Column(name="tipo", columnDefinition = "text", length = 20)
    private String tipo;
    
    @Column(name="especificacoes", columnDefinition = "text", length = 50)
    private String especificacoes;
    
    @Column(name="secretaria",  columnDefinition = "text", length = 20)
    private String secretaria;
    
    @Column(name="setor",  columnDefinition = "text", length = 20)
    private String setor;
    
    @Column(name="patrimonio", length = 20)
    private int patrimonio;
    
    @Column(name="serial_number",  columnDefinition = "text", length = 20)
    private String numSerie;
    
    @Column(name="etiqueta",  columnDefinition = "text", length = 20)
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
