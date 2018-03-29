/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes;


import Classes.Usuario;
import DAO.UsuarioDAO;
import static Classes.NivelAcesso.ADMINISTRADOR;
import static Classes.NivelAcesso.USUARIO;

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
        
        objDAO.salvar(new Usuario("Joao", "102030", USUARIO));
        
        
        System.out.print("Salvo");
        
        for (Usuario u : objDAO.buscarTodos())
            System.out.println(u.toString());
        
        
        
        
        
    }
    
}
