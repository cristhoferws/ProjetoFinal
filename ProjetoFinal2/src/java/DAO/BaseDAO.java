/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;

public abstract class BaseDAO<T> implements
        Serializable {

    private static final long serialVersionUID = 1L;
    private EntityManager em;
  
    public T pesquisarPorId(Class<T> entidade, long id) {
        em = JPAUtil.getEntityManager();
        return (T) em.find(entidade, id);
    }

    public Integer remover(Class<T> entidade, long id) {
        Integer situacao;
        em = JPAUtil.getEntityManager();
        em.getTransaction().begin();
        try {
            Object ref = em.getReference(entidade, id);
            em.remove(ref);
            em.getTransaction().commit();
            situacao = 1;
        } catch (EntityNotFoundException e) {
            System.out.println("Não existe o id: " + id);
            situacao = 0;
        } finally {
            em.close();
        }
        return situacao;
    }

    public T atualizar(T t) {
        em = JPAUtil.getEntityManager();
        em.getTransaction().begin();
        System.out.println("antes do merge");
        em.merge(t);
        em.getTransaction().commit();
        em.close();
        return t;
    }

    public void salvar(T t) {
        em = JPAUtil.getEntityManager();
        em.getTransaction().begin();
        em.persist(t);
        em.getTransaction().commit();
        em.close();
    }

    public List<T> buscarTodos(Class<T> entidade) {
        em = JPAUtil.getEntityManager();
        return em.createQuery("Select entity FROM " + entidade.getName() + " entity").getResultList();
    }
}
