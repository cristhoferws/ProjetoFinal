/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Classes.Usuario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author Cristhofer
 */
public class UsuarioDAO {
    
    private EntityManager em;

    public UsuarioDAO() {}

    public void salvar(Usuario usuario) {
        em = JPAUtil.getEntityManager();
        em.getTransaction().begin();
        em.persist(usuario);
        em.getTransaction().commit();
        em.close();
    }

    public void atualizar(Usuario usuario) {
        em = JPAUtil.getEntityManager();
        em.getTransaction().begin();
        em.merge(usuario);
        em.getTransaction().commit();
        em.close();
    }

    public void remover(long id) {
        em = JPAUtil.getEntityManager();
        em.getTransaction().begin();
        Usuario entity = em.find(Usuario.class, id);
        if (entity != null) {
            em.remove(entity);
        } else {
            throw new DAOException("Não existe o id: " + id);
        }
        em.getTransaction().commit();
        em.close();
    }

    

    public List<Usuario> buscarTodos() {
        em = JPAUtil.getEntityManager();
        TypedQuery<Usuario> query
                = em.createQuery(
                       "SELECT p FROM Usuario p",
                        Usuario.class);
        List<Usuario> usuario = query.getResultList();
        em.close();
        return usuario;
    }
    
    public List<Usuario> buscar(String nome) {
        em = JPAUtil.getEntityManager();
        TypedQuery<Usuario> query = em.createQuery(
                "SELECT p FROM Usuario p "
                + "where lower(p.nome) like '%"
                + nome.toLowerCase() + "%'",
                Usuario.class);
        List<Usuario> usuarios = query.getResultList();
        em.close();
        return usuarios;
    }
    
    
}
