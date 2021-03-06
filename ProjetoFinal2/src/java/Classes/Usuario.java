/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Cristhofer
 */
@Entity
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name="nome", columnDefinition = "text", length = 20)
    private String nome;
    
    @Column(name="password", columnDefinition = "text", length = 20)
    private String senha;
    
    @Enumerated(EnumType.ORDINAL)
    private NivelAcesso nivel;

    
    
    
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
