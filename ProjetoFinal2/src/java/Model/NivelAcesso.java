/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Cristhofer
 */
public enum NivelAcesso {
    
   ADMINISTRADOR(1), TECNICO(2), USUARIO(3);
   
   public int descricao;

    private NivelAcesso(int descricao) {
        this.descricao = descricao;
    }
   
   
    public int getDescricao() {
        return descricao;
    }

    public void setDescricao(int descricao) {
        this.descricao = descricao;
    }
   
   
   
   
   
   
}
