
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
* Classe que representa a tabela SALAATENDIMENTO
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"SALAATENDIMENTO\"")
@XmlRootElement
@CronappSecurity(post = "Public", get = "Public", delete = "Public", put = "Public")
@JsonFilter("app.entity.SalaAtendimento")
public class SalaAtendimento implements Serializable {
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
    @JoinColumn(name="fk_psi", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Psi psi;


    /**
    * @generated
    */
    @Column(name = "registros", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String registros;


    /**
    * @generated
    */
    @Column(name = "objetivos", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String objetivos;


    /**
    * @generated
    */
    @Column(name = "linkVideoChamada", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String linkVideoChamada;


    /**
    * Construtor
    * @generated
    */
    public SalaAtendimento(){
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
    public SalaAtendimento setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém psi
    * return psi
    * @generated
    */
    public Psi getPsi() {
        return this.psi;
    }

    /**
    * Define psi
    * @param psi psi
    * @generated
    */
    public SalaAtendimento setPsi(Psi psi) {
        this.psi = psi;
        return this;
    }
    /**
    * Obtém registros
    * return registros
    * @generated
    */
    public java.lang.String getRegistros() {
        return this.registros;
    }

    /**
    * Define registros
    * @param registros registros
    * @generated
    */
    public SalaAtendimento setRegistros(java.lang.String registros) {
        this.registros = registros;
        return this;
    }
    /**
    * Obtém objetivos
    * return objetivos
    * @generated
    */
    public java.lang.String getObjetivos() {
        return this.objetivos;
    }

    /**
    * Define objetivos
    * @param objetivos objetivos
    * @generated
    */
    public SalaAtendimento setObjetivos(java.lang.String objetivos) {
        this.objetivos = objetivos;
        return this;
    }
    /**
    * Obtém linkVideoChamada
    * return linkVideoChamada
    * @generated
    */
    public java.lang.String getLinkVideoChamada() {
        return this.linkVideoChamada;
    }

    /**
    * Define linkVideoChamada
    * @param linkVideoChamada linkVideoChamada
    * @generated
    */
    public SalaAtendimento setLinkVideoChamada(java.lang.String linkVideoChamada) {
        this.linkVideoChamada = linkVideoChamada;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
SalaAtendimento object = (SalaAtendimento)obj;
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