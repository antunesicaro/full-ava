
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
* Classe que representa a tabela ANOTACAOGERAL
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"ANOTACAOGERAL\"")
@XmlRootElement
@CronappSecurity
@CronappSwagger
@JsonFilter("app.entity.AnotacaoGeral")
@CronappTable(role=CronappTableRole.CLASS)
public class AnotacaoGeral implements Serializable {
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
    @CronappColumn(attributeType="INTEGER", label="Quantidade Sessao")
    @Column(name = "quantidadeSessao", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer quantidadeSessao;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_user", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private User user;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Anotacao Usuario")
    @Column(name = "anotacaoUsuario", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String anotacaoUsuario;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Linkdachamada")
    @Column(name = "linkdachamada", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String linkdachamada;


    /**
    * Construtor
    * @generated
    */
    public AnotacaoGeral(){
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
    public AnotacaoGeral setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém quantidadeSessao
    * return quantidadeSessao
    * @generated
    */
    public java.lang.Integer getQuantidadeSessao() {
        return this.quantidadeSessao;
    }

    /**
    * Define quantidadeSessao
    * @param quantidadeSessao quantidadeSessao
    * @generated
    */
    public AnotacaoGeral setQuantidadeSessao(java.lang.Integer quantidadeSessao) {
        this.quantidadeSessao = quantidadeSessao;
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
    public AnotacaoGeral setUser(User user) {
        this.user = user;
        return this;
    }
    /**
    * Obtém anotacaoUsuario
    * return anotacaoUsuario
    * @generated
    */
    public java.lang.String getAnotacaoUsuario() {
        return this.anotacaoUsuario;
    }

    /**
    * Define anotacaoUsuario
    * @param anotacaoUsuario anotacaoUsuario
    * @generated
    */
    public AnotacaoGeral setAnotacaoUsuario(java.lang.String anotacaoUsuario) {
        this.anotacaoUsuario = anotacaoUsuario;
        return this;
    }
    /**
    * Obtém linkdachamada
    * return linkdachamada
    * @generated
    */
    public java.lang.String getLinkdachamada() {
        return this.linkdachamada;
    }

    /**
    * Define linkdachamada
    * @param linkdachamada linkdachamada
    * @generated
    */
    public AnotacaoGeral setLinkdachamada(java.lang.String linkdachamada) {
        this.linkdachamada = linkdachamada;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
AnotacaoGeral object = (AnotacaoGeral)obj;
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