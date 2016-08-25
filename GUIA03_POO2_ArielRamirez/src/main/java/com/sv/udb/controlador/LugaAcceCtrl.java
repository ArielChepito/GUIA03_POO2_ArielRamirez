/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.controlador;

import com.sv.udb.modelo.CardIden;
import com.sv.udb.modelo.LugaAcce;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author REGISTRO
 */
public class LugaAcceCtrl {
    
    public boolean guar(LugaAcce obje)
    {
        boolean resp = false;
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("POOPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        try
        {
            em.persist(obje);
            tx.commit();
            resp = true;
        }
        catch(Exception ex)
        {
            tx.rollback();
        }
        em.close();
        emf.close();
        return resp;
    }
    
     public List<LugaAcce>  ConsTodo()
    {
        List<LugaAcce> resp = new ArrayList<>();
          EntityManagerFactory emf = Persistence.createEntityManagerFactory("POOPU");
           EntityManager em = emf.createEntityManager();
        try
        {
          TypedQuery<LugaAcce> query =em.createNamedQuery("LugaAcce.findAll", LugaAcce.class);
           resp = query.getResultList();
        }
        catch(Exception ex)
        {
            
        }
        return resp;
       
    }
        public boolean modi(LugaAcce obje)
    {
        boolean resp = false;
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("POOPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
         LugaAcce lugar = null;
        tx.begin();
        try
        {
            
            lugar = em.find(LugaAcce.class, obje.getCodiLugaAcce());
            lugar.setNombLugaAcce(obje.getNombLugaAcce());
            tx.commit();
            resp = true;
        }
        catch(Exception ex)
        {
            tx.rollback();
        }
        em.close();
        emf.close();
        return resp;
    }
    
   
    public boolean elim(Long empId)
    {
        boolean resp = false;
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("POOPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();       
        tx.begin();
        LugaAcce respo = null;
        try{
            respo = em.find(LugaAcce.class, empId);
            if(respo != null)
            {
                em.remove(respo);
                tx.commit();
                resp = true; 
            }
        }catch(Exception e){
            tx.rollback();
        }
        em.close();
        emf.close();
        return resp;
    }


     
     
    public LugaAcce get(Long empId){
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("POOPU");
        EntityManager em = emf.createEntityManager();
        LugaAcce resp = null;
        
        try{
            resp = em.find(LugaAcce.class, empId);
            
        }catch(Exception e){
            e.printStackTrace();
        }                
        return resp;
    }
}
