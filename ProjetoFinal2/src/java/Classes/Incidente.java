/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import DAO.IncidenteDAO;
import java.io.Serializable;
import java.util.Date;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristhofer
 */
@Entity
@ManagedBean( name="incidente")
@SessionScoped
public class Incidente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name="problema", columnDefinition = "text", length = 50)
    private String problema;
    
    @Column(name="descricao", columnDefinition = "text", length = 200)
    private String descricao;
    
    @Column(name="contato", columnDefinition = "text", length = 50)
    private String contato;
     
    @Column(name="secretaria", columnDefinition = "text", length = 50)
    private String secretaria;
    
    @Column(name="setor", columnDefinition = "text", length = 50)
    private String setor;
    
    @Column
    private int telefone;
     
    @Column
    private int patrimonio;
    
    @Temporal(TemporalType.DATE)
    private Date dataAbertura;
    
    @Enumerated(EnumType.ORDINAL)
    private Status situacao;

   
    
            
    public Incidente(){}
    
    public Incidente(String problema){
        this.problema = problema;
    }
    
    public Incidente(String problema, String descricao, String contato, String secretaria, String setor, int telefone, int patrimonio, Date dataAbertura, Status situacao) {
        this.problema = problema;
        this.descricao = descricao;
        this.contato = contato;
        this.secretaria = secretaria;
        this.setor = setor;
        this.telefone = telefone;
        this.patrimonio = patrimonio;
        this.dataAbertura = dataAbertura;
        this.situacao = situacao;
    }
    
    
    
    
  
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
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

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(int patrimonio) {
        this.patrimonio = patrimonio;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public Status getSituacao() {
        return situacao;
    }

    public void setSituacao(Status situacao) {
        this.situacao = situacao;
    }
   
    /*
   IncidenteDAO incDAO = new IncidenteDAO();
   
    
    public void gravar(){
        
        incDAO.salvar(new Incidente(problema));
    }
    
    */

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Incidente)) {
            return false;
        }
        Incidente other = (Incidente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Classes.Incidente[ id=" + id + " ]";
    }
    
}
