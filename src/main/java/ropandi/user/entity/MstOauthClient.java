/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ropandi.user.entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author 0397
 */
@Entity
@Table(name = "mstOauthClient")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MstOauthClient.findAll", query = "SELECT m FROM MstOauthClient m")
    , @NamedQuery(name = "MstOauthClient.findById", query = "SELECT m FROM MstOauthClient m WHERE m.id = :id")
    , @NamedQuery(name = "MstOauthClient.findByClientId", query = "SELECT m FROM MstOauthClient m WHERE m.clientId = :clientId")
    , @NamedQuery(name = "MstOauthClient.findByClientSecret", query = "SELECT m FROM MstOauthClient m WHERE m.clientSecret = :clientSecret")
    , @NamedQuery(name = "MstOauthClient.findBySecretRequired", query = "SELECT m FROM MstOauthClient m WHERE m.secretRequired = :secretRequired")
    , @NamedQuery(name = "MstOauthClient.findByScoped", query = "SELECT m FROM MstOauthClient m WHERE m.scoped = :scoped")
    , @NamedQuery(name = "MstOauthClient.findByAccessTokenValidity", query = "SELECT m FROM MstOauthClient m WHERE m.accessTokenValidity = :accessTokenValidity")
    , @NamedQuery(name = "MstOauthClient.findByRefreshTokenValidity", query = "SELECT m FROM MstOauthClient m WHERE m.refreshTokenValidity = :refreshTokenValidity")
    , @NamedQuery(name = "MstOauthClient.findByAutoApprove", query = "SELECT m FROM MstOauthClient m WHERE m.autoApprove = :autoApprove")
    , @NamedQuery(name = "MstOauthClient.findByCreatedAt", query = "SELECT m FROM MstOauthClient m WHERE m.createdAt = :createdAt")
    , @NamedQuery(name = "MstOauthClient.findByCreatedBy", query = "SELECT m FROM MstOauthClient m WHERE m.createdBy = :createdBy")
    , @NamedQuery(name = "MstOauthClient.findByUpdatedAt", query = "SELECT m FROM MstOauthClient m WHERE m.updatedAt = :updatedAt")
    , @NamedQuery(name = "MstOauthClient.findByUpdatedBy", query = "SELECT m FROM MstOauthClient m WHERE m.updatedBy = :updatedBy")})
public class MstOauthClient implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "clientId")
    private String clientId;
    @Basic(optional = false)
    @Column(name = "clientSecret")
    private String clientSecret;
    @Basic(optional = false)
    @Column(name = "secretRequired")
    private short secretRequired;
    @Basic(optional = false)
    @Column(name = "scoped")
    private short scoped;
    @Basic(optional = false)
    @Column(name = "accessTokenValidity")
    private long accessTokenValidity;
    @Basic(optional = false)
    @Column(name = "refreshTokenValidity")
    private long refreshTokenValidity;
    @Basic(optional = false)
    @Column(name = "autoApprove")
    private short autoApprove;
    @Basic(optional = false)
    @Column(name = "createdAt")
    private long createdAt;
    @Basic(optional = false)
    @Column(name = "createdBy")
    private String createdBy;
    @Column(name = "updatedAt")
    private BigInteger updatedAt;
    @Column(name = "updatedBy")
    private String updatedBy;
    @OneToMany(mappedBy = "idClient")
    private List<TrxClientScope> trxClientScopeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idClient")
    private List<TrxClientAuthGrantType> trxClientAuthGrantTypeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idClient")
    private List<TrxClientResource> trxClientResourceList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idClient")
    private List<TrxClientAuthority> trxClientAuthorityList;

    public MstOauthClient() {
    }

    public MstOauthClient(Long id) {
        this.id = id;
    }

    public MstOauthClient(Long id, String clientId, String clientSecret, short secretRequired, short scoped, long accessTokenValidity, long refreshTokenValidity, short autoApprove, long createdAt, String createdBy) {
        this.id = id;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.secretRequired = secretRequired;
        this.scoped = scoped;
        this.accessTokenValidity = accessTokenValidity;
        this.refreshTokenValidity = refreshTokenValidity;
        this.autoApprove = autoApprove;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public short getSecretRequired() {
        return secretRequired;
    }

    public void setSecretRequired(short secretRequired) {
        this.secretRequired = secretRequired;
    }

    public short getScoped() {
        return scoped;
    }

    public void setScoped(short scoped) {
        this.scoped = scoped;
    }

    public long getAccessTokenValidity() {
        return accessTokenValidity;
    }

    public void setAccessTokenValidity(long accessTokenValidity) {
        this.accessTokenValidity = accessTokenValidity;
    }

    public long getRefreshTokenValidity() {
        return refreshTokenValidity;
    }

    public void setRefreshTokenValidity(long refreshTokenValidity) {
        this.refreshTokenValidity = refreshTokenValidity;
    }

    public short getAutoApprove() {
        return autoApprove;
    }

    public void setAutoApprove(short autoApprove) {
        this.autoApprove = autoApprove;
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

    public BigInteger getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(BigInteger updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    @XmlTransient
    public List<TrxClientScope> getTrxClientScopeList() {
        return trxClientScopeList;
    }

    public void setTrxClientScopeList(List<TrxClientScope> trxClientScopeList) {
        this.trxClientScopeList = trxClientScopeList;
    }

    @XmlTransient
    public List<TrxClientAuthGrantType> getTrxClientAuthGrantTypeList() {
        return trxClientAuthGrantTypeList;
    }

    public void setTrxClientAuthGrantTypeList(List<TrxClientAuthGrantType> trxClientAuthGrantTypeList) {
        this.trxClientAuthGrantTypeList = trxClientAuthGrantTypeList;
    }

    @XmlTransient
    public List<TrxClientResource> getTrxClientResourceList() {
        return trxClientResourceList;
    }

    public void setTrxClientResourceList(List<TrxClientResource> trxClientResourceList) {
        this.trxClientResourceList = trxClientResourceList;
    }

    @XmlTransient
    public List<TrxClientAuthority> getTrxClientAuthorityList() {
        return trxClientAuthorityList;
    }

    public void setTrxClientAuthorityList(List<TrxClientAuthority> trxClientAuthorityList) {
        this.trxClientAuthorityList = trxClientAuthorityList;
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
        if (!(object instanceof MstOauthClient)) {
            return false;
        }
        MstOauthClient other = (MstOauthClient) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.MstOauthClient[ id=" + id + " ]";
    }
    
}
