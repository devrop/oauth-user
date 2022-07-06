/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ropandi.user.entity;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Builder;

/**
 *
 * @author ropandi
 */
@Builder
@AllArgsConstructor
@Entity
@Table(name = "MST_OAUTH_CREDENTIAL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MstOauthCredential.findAll", query = "SELECT m FROM MstOauthCredential m")
    , @NamedQuery(name = "MstOauthCredential.findByUsername", query = "SELECT m FROM MstOauthCredential m WHERE m.username = :username")
    , @NamedQuery(name = "MstOauthCredential.findByName", query = "SELECT m FROM MstOauthCredential m WHERE m.name = :name")
    , @NamedQuery(name = "MstOauthCredential.findByPassword", query = "SELECT m FROM MstOauthCredential m WHERE m.password = :password")
    , @NamedQuery(name = "MstOauthCredential.findByScope", query = "SELECT m FROM MstOauthCredential m WHERE m.scope = :scope")
    , @NamedQuery(name = "MstOauthCredential.findByCreatedAt", query = "SELECT m FROM MstOauthCredential m WHERE m.createdAt = :createdAt")
    , @NamedQuery(name = "MstOauthCredential.findByCreatedBy", query = "SELECT m FROM MstOauthCredential m WHERE m.createdBy = :createdBy")
    , @NamedQuery(name = "MstOauthCredential.findByUpdatedAt", query = "SELECT m FROM MstOauthCredential m WHERE m.updatedAt = :updatedAt")
    , @NamedQuery(name = "MstOauthCredential.findByUpdatedBy", query = "SELECT m FROM MstOauthCredential m WHERE m.updatedBy = :updatedBy")})
public class MstOauthCredential implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "USERNAME")
    private String username;
    @Column(name = "NAME")
    private String name;
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "SCOPE")
    private String scope;
    @Column(name = "CREATED_AT")
    private BigInteger createdAt;
    @Column(name = "CREATED_BY")
    private String createdBy;
    @Column(name = "UPDATED_AT")
    private BigInteger updatedAt;
    @Column(name = "UPDATED_BY")
    private String updatedBy;

    public MstOauthCredential() {
    }

    public MstOauthCredential(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public BigInteger getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(BigInteger createdAt) {
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (username != null ? username.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MstOauthCredential)) {
            return false;
        }
        MstOauthCredential other = (MstOauthCredential) object;
        if ((this.username == null && other.username != null) || (this.username != null && !this.username.equals(other.username))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.MstOauthCredential[ username=" + username + " ]";
    }
    
}
