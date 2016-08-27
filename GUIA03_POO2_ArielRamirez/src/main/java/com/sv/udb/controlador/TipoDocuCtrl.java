/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.controlador;

import com.sv.udb.modelo.LugaAcce;
import com.sv.udb.modelo.TipoDocu;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author Laboratorio
 */
public class TipoDocuCtrl {
    
     /**
     * Método para guardar un tipo de documento en la base de datos
     * @param obje TipoDocu objeto de tipo tipo de documento
     * @return resp boolean true si ha sido guardado exitosamente
     */
   public boolean guar(TipoDocu obje)
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
    
   /**
     * Método para consultar todos los tipos de documentos en la base de datos
     * @return resp List lista de objetos de tipo TipoDocu
     */
     public List<TipoDocu>  ConsTodo()
    {
        List<TipoDocu> resp = new ArrayList<>();
          EntityManagerFactory emf = Persistence.createEntityManagerFactory("POOPU");
           EntityManager em = emf.createEntityManager();
        try
        {
          TypedQuery<TipoDocu> query =em.createNamedQuery("TipoDocu.findAll", TipoDocu.class);
           resp = query.getResultList();
        }
        catch(Exception ex)
        {
            
        }
        return resp;
       
    }
     
      /**
      * Método para modificar registros en la base de datos
      * @param obje TipoDocu objeto de tipo tipo de documento
      * @return resp boolean true si ha sido modificado exitosamente
      */
        public boolean modi(TipoDocu obje)
    {
        boolean resp = false;
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("POOPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
         TipoDocu lugar = null;
        tx.begin();
        try
        {
            //No olvidar la funcion merge, esa es una exelente funcion si el form tiene todos los datos
            // por que por ejemplo, aquí solo voy a modificar el nombre y por lo anto solo ese campo esta
            //en el form, pero los demas como estado y fecha no, así que como recibe nada, hace update con nada
            //por eso, en este caso, es masconveniente setear uno por uno
            lugar = em.find(TipoDocu.class, obje.getCodiTipoDocu());
            lugar.setNombTipoDocu(obje.getNombTipoDocu());
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
    
    /**
      * Método para dar de baja registros actualizando su estado
      * @param empId Long llave primaria del registro a modificar
      * @return resp boolean true si ha sido eliminado exitosamente
      */
     public boolean elim(Long empId)
    {
        boolean resp = false;
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("POOPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        LugaAcce lugar = null;
        tx.begin();
        try
        {
            
            lugar = em.find(LugaAcce.class, empId);
            lugar.setEsta(0);
            lugar.setFechBaja(new Date());
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
     
       /**
     * Método para obtener un solo registro de la base de datos
     * @param empId Long llave primaria del registro que se desea obtener
     * @return resp TipoDocu objeto de tipo tipo de documento con todos los datos del registro
     */
      public TipoDocu get(Long empId){
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("POOPU");
        EntityManager em = emf.createEntityManager();
        TipoDocu resp = null;
        
        try{
            resp = em.find(TipoDocu.class, empId);
            
        }catch(Exception e){
            e.printStackTrace();
        }                
        return resp;
    }
}
