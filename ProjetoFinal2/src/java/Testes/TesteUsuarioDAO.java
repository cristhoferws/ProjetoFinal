/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes;


import Classes.Incidente;
import Classes.Usuario;
import DAO.UsuarioDAO;

import static Classes.NivelAcesso.*;
import static Classes.Status.*;
import DAO.IncidenteDAO;
import java.util.Date;

/**
 *
 * @author Cristhofer
 */
public class TesteUsuarioDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        UsuarioDAO objDAO = new UsuarioDAO();
        
        objDAO.salvar(new Usuario("Carlos Alberto", "102030", USUARIO));
        
        
        
        
        
        System.out.print("Salvo");
        
        for (Usuario u : objDAO.buscarTodos())
            System.out.println(u.toString());
        
        
        Date data = new Date();
        
        IncidenteDAO incDAO = new IncidenteDAO();
        
        incDAO.salvar(new Incidente("Impressora não imprime", "Impressora exibe mensagem de erro ao imprimir", "João de Deus","Fazenda","Administrativo",36007148,850990,data,NOVO ));
       
        
        
        
        
        
        
    }
    
}
