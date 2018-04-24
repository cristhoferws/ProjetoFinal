/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.IncidenteDAO;
import Model.Incidente;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import java.io.Serializable;

/**
 *
 * @author Cristhofer
 */
@ManagedBean(name="incidenteBean")
@SessionScoped
public class IncidenteBean implements Serializable {
    
    private Incidente incidente = new Incidente();
        
    
    private List<Incidente> incidentes;
    
    private boolean editando;
    private Incidente incidenteSelecionado;

    public Incidente getIncidente() {
        return incidente;
    }

    public void setIncidente(Incidente incidente) {
        this.incidente = incidente;
    }

    public List<Incidente> getIncidentes() {
        this.incidentes = incidente.buscarTodos();
        
        return incidentes;
    }

    public void setIncidentes(List<Incidente> incidentes) {
        this.incidentes = incidentes;
    }

    public boolean isEditando() {
        return editando;
    }

    public void setEditando(boolean editando) {
        this.editando = editando;
    }

    public Incidente getIncidenteSelecionado() {
        return incidenteSelecionado;
    }

    public void setIncidenteSelecionado(Incidente incidenteSelecionado) {
        this.incidenteSelecionado = incidenteSelecionado;
    }
    
    
     public String salvar(){
       
     incidente.salvar();
              
     this.incidente = new Incidente();
        
       return "/home";   
    }
     
     
    public String excluir(Incidente p){
        Integer situacao = p.remover();
        if(situacao==1){
           incidente.remover();
           return "home.xhtml";
        }
        else 
            return "Erro";
    }
    public String editar(Incidente p){
        this.incidente = p;
        System.out.println("Entrou no editar");
        System.out.println("conteudo = "+incidente.toString());
       // Pessoa pAux = p.atualizar();
        setEditando(true);
       // if(pAux!=null)
       System.out.println("indo página editar");
       return "home.xhtml";
      //  return "Erro";
    }
   
    public String atualizar(){
       // this.pessoa = p;
       System.out.println("Entrou no atualizar");
        System.out.println("Nova pessoa = "+incidente.toString());
        Incidente pAux = incidente.atualizar();
        System.out.println("editou");
        setEditando(false);
        if(pAux!=null){
            System.out.println("indo pg listar");
           return "home.xhtml";
        }
        return "Erro";
    }  
    public void limpar() {
       this.incidente= new Incidente();
       setEditando(false);
    } 
     
     
    
}
