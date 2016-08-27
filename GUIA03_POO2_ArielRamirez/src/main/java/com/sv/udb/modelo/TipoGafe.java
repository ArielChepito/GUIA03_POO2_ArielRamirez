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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Laboratorio
 */
@Entity
@Table(name = "tipo_gafe", catalog = "rceron_poo", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoGafe.findAll", query = "SELECT t FROM TipoGafe t"),
    @NamedQuery(name = "TipoGafe.findByCodiTipoGafe", query = "SELECT t FROM TipoGafe t WHERE t.codiTipoGafe = :codiTipoGafe"),
    @NamedQuery(name = "TipoGafe.findByNombTipoGafe", query = "SELECT t FROM TipoGafe t WHERE t.nombTipoGafe = :nombTipoGafe"),
    @NamedQuery(name = "TipoGafe.findByFechAlta", query = "SELECT t FROM TipoGafe t WHERE t.fechAlta = :fechAlta"),
    @NamedQuery(name = "TipoGafe.findByFechBaja", query = "SELECT t FROM TipoGafe t WHERE t.fechBaja = :fechBaja"),
    @NamedQuery(name = "TipoGafe.findByEsta", query = "SELECT t FROM TipoGafe t WHERE t.esta = :esta")})
public class TipoGafe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codi_tipo_gafe")
    private Long codiTipoGafe;
    @Size(max = 200)
    @Column(name = "nomb_tipo_gafe")
    private String nombTipoGafe;
    @Column(name = "fech_alta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechAlta;
    @Column(name = "fech_baja")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechBaja;
    @Column(name = "esta")
    private Integer esta;

    /**
     * Constructor de la clase TipoGafe, no necesita parametros      
     */
    public TipoGafe() {
    }

    /**
     * Constructor de la clase TipoGafe que recibe solo la primary Key del objeto
     * @param codiTipoGafe Número Long       
     */ 
    public TipoGafe(Long codiTipoGafe) {
        this.codiTipoGafe = codiTipoGafe;
    }
    
    /**
     * Getter de Codigo de la clase TipoGafe
     * @return Un numero Long
  
     */

    public Long getCodiTipoGafe() {
        return codiTipoGafe;
    }

    /**
     * Setter de codigo de la clase TipoGafe
     * @param codiTipoGafe Número Long       
     */ 
    public void setCodiTipoGafe(Long codiTipoGafe) {
        this.codiTipoGafe = codiTipoGafe;
    }

    /**
     * Getter de nombre de la clase TipoGafe
     * @return Una cadena String
  
     */
    public String getNombTipoGafe() {
        return nombTipoGafe;
    }

     /**
     * Setter de nombre de la clase TipoGafe
     * @param nombTipoGafe Cadena String       
     */ 
    public void setNombTipoGafe(String nombTipoGafe) {
        this.nombTipoGafe = nombTipoGafe;
    }

    /**
     * Getter de la fecha de alta de la clase TipoGafe
     * @return Una fecha tipo java.util.Date
  
     */
    public Date getFechAlta() {
        return fechAlta;
    }

     /**
     * Setter de fecha de alta de la clase TipoGafe
     * @param fechAlta fecha Date       
     */ 
    public void setFechAlta(Date fechAlta) {
        this.fechAlta = fechAlta;
    }

    /**
     * Getter de la fecha de baja  de la clase TipoGafe
     * @return Una fecha tipo java.util.Date
  
     */
    public Date getFechBaja() {
        return fechBaja;
    }

    /**
     * Setter de fecha de baja de la clase TipoGafe
     * @param fechBaja fecha Date       
     */
    public void setFechBaja(Date fechBaja) {
        this.fechBaja = fechBaja;
    }

     /**
     * Getter del estado(activo o inactivo) de la  clase TipoGafe
     * @return Un numero Integer
  
     */
    public Integer getEsta() {
        return esta;
    }

     /**
     * Setter del estado(activo o inactivo) la clase TipoGafe
     * @param esta Numero Integer       
     */
    public void setEsta(Integer esta) {
        this.esta = esta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codiTipoGafe != null ? codiTipoGafe.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoGafe)) {
            return false;
        }
        TipoGafe other = (TipoGafe) object;
        if ((this.codiTipoGafe == null && other.codiTipoGafe != null) || (this.codiTipoGafe != null && !this.codiTipoGafe.equals(other.codiTipoGafe))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sv.udb.modelo.TipoGafe[ codiTipoGafe=" + codiTipoGafe + " ]";
    }
    
}
