package org.web3j.examples.domain.jpa;

import javax.persistence.*;

@Entity
@Table(name = "EXAMPLE_COMPANY")
@NamedQueries({ @NamedQuery(name = "findByRealm", query = "from Company where realmId = :realmId") })
public class Company {

    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "REALM_ID", nullable = false)
    private String realmId;

    public String getId() {
        return id;
    }

    public String getRealmId() {
        return realmId;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRealmId(String realmId) {
        this.realmId = realmId;
    }
}