
package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.swagger.CronappSwagger;



import cronapp.framework.core.persistence.*;

/**
* Classe que representa a tabela PSICOLOGO
* @generated
*/
@javax.persistence.Entity
@IdClass(PsicologoPK.class)
@javax.persistence.Table(name = "\"PSICOLOGO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Psicologo")
@CronappTable(role=CronappTableRole.CLASS)
public class Psicologo implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @JoinColumn(name="fk_user", nullable = false, referencedColumnName = "id", insertable=true, updatable=true)
        private User user;

    /**
    * @generated
    */
    @Id
    @CronappColumn(attributeType="STRING", label="Crp", defaultValue = "UUID.randomUUID().toString().toUpperCase()")
    @Column(name = "crp", nullable = false, insertable=true, updatable=true)
        private java.lang.String crp = UUID.randomUUID().toString().toUpperCase();



    /**
    * Construtor
    * @generated
    */
    public Psicologo(){
    }

    /**
    * Obtém user
    * return user
    * @generated
    */
    public User getUser() {
        return this.user;
    }

    /**
    * Define user
    * @param user user
    * @generated
    */
    public Psicologo setUser(User user) {
        this.user = user;
        return this;
    }
    /**
    * Obtém crp
    * return crp
    * @generated
    */
    public java.lang.String getCrp() {
        return this.crp;
    }

    /**
    * Define crp
    * @param crp crp
    * @generated
    */
    public Psicologo setCrp(java.lang.String crp) {
        this.crp = crp;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Psicologo object = (Psicologo)obj;
        if (user != null ? !user.equals(object.user) : object.user != null) return false;
        if (crp != null ? !crp.equals(object.crp) : object.crp != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((user == null) ? 0 : user.hashCode());
        result = 31 * result + ((crp == null) ? 0 : crp.hashCode());
        return result;
    }

}