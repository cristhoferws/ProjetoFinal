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
public class Status {
    
    public enum status {NOVO,AGUARDANDO_ATENDIMENTO,EM_ATENDIMENTO,EM_MANUTENCAO,AGUARDANDO_ENTREGA,CANCELADO,ENCERRADO,ENCAMINHADO_PARA_OPERADOR;}
    
}
