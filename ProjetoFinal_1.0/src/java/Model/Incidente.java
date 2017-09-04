/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import Model.Status;
import javax.faces.bean.ManagedBean;
import java.util.Date;
/**
 *
 * @author 0067156
 */
@ManagedBean
public class Incidente {
    
    private String problema;
    private String descricao;
    private String contato;
    private String secretaria;
    private String unidade;
    private Date dataAbertura;
    private int telefone;
    private int patrimonio;
    
    public Incidente(){}

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

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
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
    
    public void aceitar(){}
    
    public void cadastrar(){}
    
    public String acompanhaStatus(){return status}
    
     public void gerarRelatorioLocais(){}
    
    public void gerarRelatorioEquipamentos(){}
    
    public void gerarRelatorioTecnico(){}
    
    public void gerarRelatorioUsuario(){}
     
    public void gerarRelatorioProblema(){}
     
    
    
    
    
    
    
}
