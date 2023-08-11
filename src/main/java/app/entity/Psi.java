
package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.swagger.CronappSwagger;


/**
* Classe que representa a tabela PSI
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"PSI\"")
@XmlRootElement
@CronappSecurity(post = "Public", get = "Public", delete = "Public", put = "Public")
@JsonFilter("app.entity.Psi")
public class Psi implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_user", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private User user;


    /**
    * @generated
    */
    @Column(name = "especialidade", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String especialidade;


    /**
    * @generated
    */
    @Column(name = "crp", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String crp;


    /**
    * Construtor
    * @generated
    */
    public Psi(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    public java.lang.String getId() {
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public Psi setId(java.lang.String id) {
        this.id = id;
        return this;
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
    public Psi setUser(User user) {
        this.user = user;
        return this;
    }
    /**
    * Obtém especialidade
    * return especialidade
    * @generated
    */
    public java.lang.String getEspecialidade() {
        return this.especialidade;
    }

    /**
    * Define especialidade
    * @param especialidade especialidade
    * @generated
    */
    public Psi setEspecialidade(java.lang.String especialidade) {
        this.especialidade = especialidade;
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
    public Psi setCrp(java.lang.String crp) {
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
Psi object = (Psi)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}