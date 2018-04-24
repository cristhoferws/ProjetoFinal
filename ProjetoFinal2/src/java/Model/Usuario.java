/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import DAO.UsuarioDAO;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.*;


/**
 *
 * @author Cristhofer
 */
@Entity
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_user") 
    private Long id;
    
    
    private String nome;
    
    
    private String senha;
    
    @Enumerated(EnumType.ORDINAL)
    private NivelAcesso nivel;

    
    @OneToMany (mappedBy = "usuario", cascade ={CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    @JoinColumn (name="id_inc")
    private List<Incidente> incidentes = new LinkedList<>();
    
    
    public Usuario(){}
    
    
    public Usuario(String nome, String senha, NivelAcesso nivel) {
        this.nome = nome;
        this.senha = senha;
        this.nivel = nivel;
    }
     

    
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public NivelAcesso getNivel() {
        return nivel;
    }

    public void setNivel(NivelAcesso nivel) {
        this.nivel = nivel;
    }
        
    UsuarioDAO user = new UsuarioDAO();
        
    public void salvar(){
        
        user.salvar(this);
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
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Classes.Usuario[ id=" + id + " nome= " + nome + " Nivel de Acesso= " + nivel + "senha" + senha + " ]";
    }
    
}
