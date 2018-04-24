/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Incidente;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author Cristhofer
 */
public class IncidenteDAO extends BaseDAO <Incidente> {
    
    /*
    private EntityManager em;
    
    public IncidenteDAO(){}
    
    
    
    public void salvar(Incidente incidente){
           
        em = JPAUtil.getEntityManager();
        em.getTransaction().begin();
        em.persist(incidente);
        em.getTransaction().commit();
        em.close();
    }
 
    
     public void atualizar(Incidente incidente) {
        em = JPAUtil.getEntityManager();
        em.getTransaction().begin();
        em.merge(incidente);
        em.getTransaction().commit();
        em.close();
    }

    public void remover(long id) {
        em = JPAUtil.getEntityManager();
        em.getTransaction().begin();
        Incidente entity = em.find(Incidente.class, id);
        if (entity != null) {
            em.remove(entity);
        } else {
            throw new DAOException("Não existe o id: " + id);
        }
        em.getTransaction().commit();
        em.close();
    }

    

    public List<Incidente> buscarTodos() {
        em = JPAUtil.getEntityManager();
        TypedQuery<Incidente> query
                = em.createQuery(
                       "SELECT p FROM Incidente p",
                        Incidente.class);
        List<Incidente> incidente = query.getResultList();
        em.close();
        return incidente;
    }
    
    public Incidente buscar(String nome) {
        em = JPAUtil.getEntityManager();
        TypedQuery<Incidente> query = em.createQuery(
                "SELECT p FROM Incidente p "
                        + "where lower(p.nome) like '%"
                        + nome.toLowerCase() + "%'",
                Incidente.class);
        List<Incidente> incidentes = query.getResultList();
        em.close();
        return incidentes.get(0);
    }

 */
    
}
