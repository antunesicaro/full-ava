
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
* Classe que representa a tabela PSIORPACI
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"PSIORPACI\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.PsiOrPaci")
@CronappTable(role=CronappTableRole.CLASS)
public class PsiOrPaci implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @CronappColumn(attributeType="STRING", label="Id", defaultValue = "UUID.randomUUID().toString().toUpperCase()")
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="Escolha")
    @Column(name = "escolha", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer escolha;


    /**
    * @generated
    */
    @CronappColumn(attributeType="BOOLEAN", label="Ativos")
    @Column(name = "ativos", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean ativos;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_user", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private User user;


    /**
    * Construtor
    * @generated
    */
    public PsiOrPaci(){
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
    public PsiOrPaci setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém escolha
    * return escolha
    * @generated
    */
    public java.lang.Integer getEscolha() {
        return this.escolha;
    }

    /**
    * Define escolha
    * @param escolha escolha
    * @generated
    */
    public PsiOrPaci setEscolha(java.lang.Integer escolha) {
        this.escolha = escolha;
        return this;
    }
    /**
    * Obtém ativos
    * return ativos
    * @generated
    */
    public java.lang.Boolean getAtivos() {
        return this.ativos;
    }

    /**
    * Define ativos
    * @param ativos ativos
    * @generated
    */
    public PsiOrPaci setAtivos(java.lang.Boolean ativos) {
        this.ativos = ativos;
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
    public PsiOrPaci setUser(User user) {
        this.user = user;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
PsiOrPaci object = (PsiOrPaci)obj;
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