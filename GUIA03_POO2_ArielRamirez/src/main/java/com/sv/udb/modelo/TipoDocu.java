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
 * @author Ariel
 */
@Entity
@Table(name = "tipo_docu", catalog = "rceron_poo", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoDocu.findAll", query = "SELECT t FROM TipoDocu t"),
    @NamedQuery(name = "TipoDocu.findByCodiTipoDocu", query = "SELECT t FROM TipoDocu t WHERE t.codiTipoDocu = :codiTipoDocu"),
    @NamedQuery(name = "TipoDocu.findByNombTipoDocu", query = "SELECT t FROM TipoDocu t WHERE t.nombTipoDocu = :nombTipoDocu"),
    @NamedQuery(name = "TipoDocu.findByFechAlta", query = "SELECT t FROM TipoDocu t WHERE t.fechAlta = :fechAlta"),
    @NamedQuery(name = "TipoDocu.findByFechBaja", query = "SELECT t FROM TipoDocu t WHERE t.fechBaja = :fechBaja"),
    @NamedQuery(name = "TipoDocu.findByEsta", query = "SELECT t FROM TipoDocu t WHERE t.esta = :esta")})
public class TipoDocu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codi_tipo_docu")
    private Long codiTipoDocu;
    @Size(max = 50)
    @Column(name = "nomb_tipo_docu")
    private String nombTipoDocu;
    @Column(name = "fech_alta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechAlta;
    @Column(name = "fech_baja")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechBaja;
    @Column(name = "esta")
    private Integer esta;

     /**
     * Constructor de la clase TipoDocu, no necesita parametros      
     */
    public TipoDocu() {
    }

    /**
     * Constructor de la clase TipoDocu que recibe solo la primary Key del objeto
     * @param codiTipoDocu Número Long       
     */   
    public TipoDocu(Long codiTipoDocu) {
        this.codiTipoDocu = codiTipoDocu;
    }

     /**
     * Getter de Codigo de la clase TipoDocu
     * @return Un numero Long
  
     */
    public Long getCodiTipoDocu() {
        return codiTipoDocu;
    }

    /**
     * Setter de codigo de la clase TipoDocu
     * @param codiTipoDocu Número Long       
     */ 
    public void setCodiTipoDocu(Long codiTipoDocu) {
        this.codiTipoDocu = codiTipoDocu;
    }

    /**
     * Getter de nombre de la clase TipoDocu
     * @return Una cadena String
  
     */
    public String getNombTipoDocu() {
        return nombTipoDocu;
    }

    /**
     * Setter de nombre de la clase TipoDocu
     * @param nombTipoDocu Cadena String       
     */ 
    public void setNombTipoDocu(String nombTipoDocu) {
        this.nombTipoDocu = nombTipoDocu;
    }

    /**
     * Getter de la fecha de alta de la clase TipoDocu
     * @return Una fecha tipo java.util.Date
  
     */
    public Date getFechAlta() {
        return fechAlta;
    }

    /**
     * Setter de fecha de alta de la clase TipoDocu
     * @param fechAlta fecha Date       
     */ 
    public void setFechAlta(Date fechAlta) {
        this.fechAlta = fechAlta;
    }

    /**
     * Getter de la fecha de baja  de la clase TipoDocu
     * @return Una fecha tipo java.util.Date
  
     */
    public Date getFechBaja() {
        return fechBaja;
    }

    /**
     * Setter de fecha de baja de la clase TipoDocu
     * @param fechBaja fecha Date       
     */
    public void setFechBaja(Date fechBaja) {
        this.fechBaja = fechBaja;
    }

     /**
     * Getter del estado(activo o inactivo) de la  clase TipoDocu
     * @return Un numero Integer
  
     */
    public Integer getEsta() {
        return esta;
    }

     /**
     * Setter del estado(activo o inactivo) la clase TipoDocu
     * @param esta Numero Integer       
     */
    public void setEsta(Integer esta) {
        this.esta = esta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codiTipoDocu != null ? codiTipoDocu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoDocu)) {
            return false;
        }
        TipoDocu other = (TipoDocu) object;
        if ((this.codiTipoDocu == null && other.codiTipoDocu != null) || (this.codiTipoDocu != null && !this.codiTipoDocu.equals(other.codiTipoDocu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sv.udb.modelo.TipoDocu[ codiTipoDocu=" + codiTipoDocu + " ]";
    }
    
}
