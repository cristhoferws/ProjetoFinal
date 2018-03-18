/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Cristhofer
 */
public enum Status {
    
    NOVO(1),PENDENTE(2), EM_ATENDIMENTO(3), EM_MANUTENCAO(4), AGUARDANDO_ENTREGA(5), CANCELADO(6), ENCERRADO(7), ATRIBUIDO(8);
    

public int descricao;

    private Status(int descricao) {
        this.descricao = descricao;
    }

    public int getDescricao() {
        return descricao;
    }

    public void setDescricao(int descricao) {
        this.descricao = descricao;
    }






}
