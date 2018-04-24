/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Recurso;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author Cristhofer
 */

public class RecursoDAO extends BaseDAO<Recurso>{
    
    /* private EntityManager em;

    public RecursoDAO() {}

    public void salvar(Recurso recurso) {
        em = JPAUtil.getEntityManager();
        em.getTransaction().begin();
        em.persist(recurso);
        em.getTransaction().commit();
        em.close();
    }

    public void atualizar(Recurso recurso) {
        em = JPAUtil.getEntityManager();
        em.getTransaction().begin();
        em.merge(recurso);
        em.getTransaction().commit();
        em.close();
    }

    public void remover(long id) {
        em = JPAUtil.getEntityManager();
        em.getTransaction().begin();
        Recurso entity = em.find(Recurso.class, id);
        if (entity != null) {
            em.remove(entity);
        } else {
            throw new DAOException("Não existe o id: " + id);
        }
        em.getTransaction().commit();
        em.close();
    }

    

    public List<Recurso> buscarTodos() {
        em = JPAUtil.getEntityManager();
        TypedQuery<Recurso> query
                = em.createQuery(
                       "SELECT p FROM Recurso p",
                        Recurso.class);
        List<Recurso> usuario = query.getResultList();
        em.close();
        return usuario;
    }
    
    public Recurso buscar(String nome) {
        em = JPAUtil.getEntityManager();
        TypedQuery<Recurso> query = em.createQuery(
                "SELECT p FROM Recurso p "
                        + "where lower(p.nome) like '%"
                        + nome.toLowerCase() + "%'",
                Recurso.class);
        List<Recurso> usuarios = query.getResultList();
        em.close();
        return usuarios.get(0);
    }
            

*/
    
}
