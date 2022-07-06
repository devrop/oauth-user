/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ropandi.user.entity;


import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 0397
 */
@Entity
@Table(name = "trxClientAuthGrantType")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TrxClientAuthGrantType.findAll", query = "SELECT t FROM TrxClientAuthGrantType t")
    , @NamedQuery(name = "TrxClientAuthGrantType.findById", query = "SELECT t FROM TrxClientAuthGrantType t WHERE t.id = :id")
    , @NamedQuery(name = "TrxClientAuthGrantType.findByGrantTypeCode", query = "SELECT t FROM TrxClientAuthGrantType t WHERE t.grantTypeCode = :grantTypeCode")
    , @NamedQuery(name = "TrxClientAuthGrantType.findByGrantTypeValue", query = "SELECT t FROM TrxClientAuthGrantType t WHERE t.grantTypeValue = :grantTypeValue")
    , @NamedQuery(name = "TrxClientAuthGrantType.findByCreatedAt", query = "SELECT t FROM TrxClientAuthGrantType t WHERE t.createdAt = :createdAt")
    , @NamedQuery(name = "TrxClientAuthGrantType.findByCreatedBy", query = "SELECT t FROM TrxClientAuthGrantType t WHERE t.createdBy = :createdBy")})
public class TrxClientAuthGrantType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "grantTypeCode")
    private String grantTypeCode;
    @Basic(optional = false)
    @Column(name = "grantTypeValue")
    private String grantTypeValue;
    @Basic(optional = false)
    @Column(name = "createdAt")
    private long createdAt;
    @Basic(optional = false)
    @Column(name = "createdBy")
    private String createdBy;
    @JoinColumn(name = "idClient", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private MstOauthClient idClient;

    public TrxClientAuthGrantType() {
    }

    public TrxClientAuthGrantType(Long id) {
        this.id = id;
    }

    public TrxClientAuthGrantType(Long id, String grantTypeCode, String grantTypeValue, long createdAt, String createdBy) {
        this.id = id;
        this.grantTypeCode = grantTypeCode;
        this.grantTypeValue = grantTypeValue;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGrantTypeCode() {
        return grantTypeCode;
    }

    public void setGrantTypeCode(String grantTypeCode) {
        this.grantTypeCode = grantTypeCode;
    }

    public String getGrantTypeValue() {
        return grantTypeValue;
    }

    public void setGrantTypeValue(String grantTypeValue) {
        this.grantTypeValue = grantTypeValue;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public MstOauthClient getIdClient() {
        return idClient;
    }

    public void setIdClient(MstOauthClient idClient) {
        this.idClient = idClient;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TrxClientAuthGrantType)) {
            return false;
        }
        TrxClientAuthGrantType other = (TrxClientAuthGrantType) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.TrxClientAuthGrantType[ id=" + id + " ]";
    }
    
}
