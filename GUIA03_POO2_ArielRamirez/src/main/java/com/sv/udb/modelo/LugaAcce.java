/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author REGISTRO
 */
@Entity
@Table(name = "luga_acce", catalog = "rceron_poo", schema = "")
@NamedQueries({
    @NamedQuery(name = "LugaAcce.findAll", query = "SELECT l FROM LugaAcce l where l.esta = 1")})
public class LugaAcce implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codi_luga_acce")
    private Long codiLugaAcce;
    @Size(max = 100)
    @Column(name = "nomb_luga_acce")
    private String nombLugaAcce;
    @Column(name = "fech_alta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechAlta;
    @Column(name = "fech_baja")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechBaja;
    @Column(name = "esta")
    private Integer esta;

    
    /**
     * Constructor de la clase LugaAcce, no necesita parametros      
     */
    public LugaAcce() {
    }
    
    /**
     * Constructor de la clase LugaAcce que recibe solo la primary Key del objeto
     * @param codiLugaAcce Número Long       
     */    
    public LugaAcce(Long codiLugaAcce) {
        this.codiLugaAcce = codiLugaAcce;
    }

    /**
     * Getter de Codigo de la clase LugaAcce
     * @return Un numero Long
  
     */
    public Long getCodiLugaAcce() {
        return codiLugaAcce;
    }

     /**
     * Setter de codigo de la clase LugaAcce
     * @param codiLugaAcce Número Long       
     */ 
    public void setCodiLugaAcce(Long codiLugaAcce) {
        this.codiLugaAcce = codiLugaAcce;
    }

    /**
     * Getter de nombre de la clase LugaAcce
     * @return Una cadena String
  
     */
    public String getNombLugaAcce() {
        return nombLugaAcce;
    }

    /**
     * Setter de nombre de la clase LugaAcce
     * @param nombLugaAcce Cadena String       
     */ 
    public void setNombLugaAcce(String nombLugaAcce) {
        this.nombLugaAcce = nombLugaAcce;
    }

    /**
     * Getter de la fecha de alta de la clase LugaAcce
     * @return Una fecha tipo java.util.Date
  
     */
    public Date getFechAlta() {
        return fechAlta;
    }

    /**
     * Setter de fecha de alta de la clase LugaAcce
     * @param fechAlta fecha Date       
     */ 
    public void setFechAlta(Date fechAlta) {
        this.fechAlta = fechAlta;
    }

    /**
     * Getter de la fecha de baja  de la clase LugaAcce
     * @return Una fecha tipo java.util.Date
  
     */
    public Date getFechBaja() {
        return fechBaja;
    }

     /**
     * Setter de fecha de baja de la clase LugaAcce
     * @param fechBaja fecha Date       
     */
    public void setFechBaja(Date fechBaja) {
        this.fechBaja = fechBaja;
    }

    /**
     * Getter del estado(activo o inactivo) de la  clase LugaAcce
     * @return Un numero Integer
  
     */
    public Integer getEsta() {
        return esta;
    }

    /**
     * Setter del estado(activo o inactivo) la clase LugaAcce
     * @param esta Numero Integer       
     */
    public void setEsta(Integer esta) {
        this.esta = esta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codiLugaAcce != null ? codiLugaAcce.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LugaAcce)) {
            return false;
        }
        LugaAcce other = (LugaAcce) object;
        if ((this.codiLugaAcce == null && other.codiLugaAcce != null) || (this.codiLugaAcce != null && !this.codiLugaAcce.equals(other.codiLugaAcce))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sv.udb.modelo.LugaAcce[ codiLugaAcce=" + codiLugaAcce + " ]";
    }
    
}
