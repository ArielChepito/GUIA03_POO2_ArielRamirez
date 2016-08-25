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
import javax.persistence.Lob;
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
@Table(name = "card_iden", catalog = "rceron_poo", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CardIden.findAll", query = "SELECT c FROM CardIden c"),
    @NamedQuery(name = "CardIden.findByCodiCard", query = "SELECT c FROM CardIden c WHERE c.codiCard = :codiCard"),
    @NamedQuery(name = "CardIden.findByNombCard", query = "SELECT c FROM CardIden c WHERE c.nombCard = :nombCard"),
    @NamedQuery(name = "CardIden.findByFechAlta", query = "SELECT c FROM CardIden c WHERE c.fechAlta = :fechAlta"),
    @NamedQuery(name = "CardIden.findByFechBaja", query = "SELECT c FROM CardIden c WHERE c.fechBaja = :fechBaja"),
    @NamedQuery(name = "CardIden.findByEsta", query = "SELECT c FROM CardIden c WHERE c.esta = :esta")})
public class CardIden implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codi_card")
    private Long codiCard;
    @Size(max = 255)
    @Column(name = "nomb_card")
    private String nombCard;
    @Lob
    @Column(name = "foto_card")
    private byte[] fotoCard;
    @Column(name = "fech_alta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechAlta;
    @Column(name = "fech_baja")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechBaja;
    @Column(name = "esta")
    private Integer esta;

    public CardIden() {
    }

    public CardIden(Long codiCard) {
        this.codiCard = codiCard;
    }

    public Long getCodiCard() {
        return codiCard;
    }

    public void setCodiCard(Long codiCard) {
        this.codiCard = codiCard;
    }

    public String getNombCard() {
        return nombCard;
    }

    public void setNombCard(String nombCard) {
        this.nombCard = nombCard;
    }

    public byte[] getFotoCard() {
        return fotoCard;
    }

    public void setFotoCard(byte[] fotoCard) {
        this.fotoCard = fotoCard;
    }

    public Date getFechAlta() {
        return fechAlta;
    }

    public void setFechAlta(Date fechAlta) {
        this.fechAlta = fechAlta;
    }

    public Date getFechBaja() {
        return fechBaja;
    }

    public void setFechBaja(Date fechBaja) {
        this.fechBaja = fechBaja;
    }

    public Integer getEsta() {
        return esta;
    }

    public void setEsta(Integer esta) {
        this.esta = esta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codiCard != null ? codiCard.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CardIden)) {
            return false;
        }
        CardIden other = (CardIden) object;
        if ((this.codiCard == null && other.codiCard != null) || (this.codiCard != null && !this.codiCard.equals(other.codiCard))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sv.udb.modelo.CardIden[ codiCard=" + codiCard + " ]";
    }
    
}
