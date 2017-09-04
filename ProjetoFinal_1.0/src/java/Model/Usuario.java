/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import javax.faces.bean.ManagedBean;
/**
 *
 * @author 0067156
 */
@ManagedBean
public class Usuario {
    
    private String nome;
    private String senha;
    private String nivelAcesso;
   
    public Usuario(){}

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

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }
    
    
    public void login(){}
    
    public void valida(long matricula, String senha){}
    
    public void cadastrar(){}
            
    
    
}
