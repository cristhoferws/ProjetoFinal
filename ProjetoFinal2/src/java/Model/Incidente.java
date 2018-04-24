/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import DAO.IncidenteDAO;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;


/**
 *
 * @author Cristhofer
 */
@Entity
public class Incidente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_inc")
    private Long id;
    

    private String problema;
    
    
    private String descricao;
    

    private String contato;
     
    
    private String secretaria;
    
    private String setor;
    
  
    private int telefone;
     
   
    private int patrimonio;
    
    @Temporal(TemporalType.DATE)
    private Date dataAbertura;
    
    @Enumerated(EnumType.ORDINAL)
    private Status situacao;

   
    @ManyToOne
    @JoinColumn(name="id_user")
    private Usuario usuario;
            
    public Incidente(){}
    
    
    
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
   
    
    
    public void salvar(){
        new IncidenteDAO().salvar(this);
    }
    
    public List<Incidente> buscarTodos(){
       
       return new IncidenteDAO().buscarTodos(Incidente.class);
    }
    
    
      public Integer remover() {
        return new IncidenteDAO().remover(Incidente.class,this.getId());
    }
    
    public Incidente atualizar() {
        return new IncidenteDAO().atualizar(this);
    }
    /*
   IncidenteDAO incD+AO = new IncidenteDAO();
   
    
    
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
