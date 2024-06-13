
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
* Classe que representa a tabela REGISTROS
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"REGISTROS\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Registros")
public class Registros implements Serializable {
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
    @Column(name = "avaliacaoPsicologica", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String avaliacaoPsicologica;


    /**
    * @generated
    */
    @Column(name = "registro", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String registro;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_consulta", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Consulta consulta;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumns({
    @JoinColumn(name="fk_psicologo_crp", nullable = true, referencedColumnName = "crp", insertable=true, updatable=true)
                    ,
    @JoinColumn(name="fk_psicologo_fk_user", nullable = true, referencedColumnName = "fk_user", insertable=true, updatable=true)
                    
    })
        
        private Psicologo psicologo;


    /**
    * Construtor
    * @generated
    */
    public Registros(){
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
    public Registros setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém avaliacaoPsicologica
    * return avaliacaoPsicologica
    * @generated
    */
    public java.lang.String getAvaliacaoPsicologica() {
        return this.avaliacaoPsicologica;
    }

    /**
    * Define avaliacaoPsicologica
    * @param avaliacaoPsicologica avaliacaoPsicologica
    * @generated
    */
    public Registros setAvaliacaoPsicologica(java.lang.String avaliacaoPsicologica) {
        this.avaliacaoPsicologica = avaliacaoPsicologica;
        return this;
    }
    /**
    * Obtém registro
    * return registro
    * @generated
    */
    public java.lang.String getRegistro() {
        return this.registro;
    }

    /**
    * Define registro
    * @param registro registro
    * @generated
    */
    public Registros setRegistro(java.lang.String registro) {
        this.registro = registro;
        return this;
    }
    /**
    * Obtém consulta
    * return consulta
    * @generated
    */
    public Consulta getConsulta() {
        return this.consulta;
    }

    /**
    * Define consulta
    * @param consulta consulta
    * @generated
    */
    public Registros setConsulta(Consulta consulta) {
        this.consulta = consulta;
        return this;
    }
    /**
    * Obtém psicologo
    * return psicologo
    * @generated
    */
    public Psicologo getPsicologo() {
        return this.psicologo;
    }

    /**
    * Define psicologo
    * @param psicologo psicologo
    * @generated
    */
    public Registros setPsicologo(Psicologo psicologo) {
        this.psicologo = psicologo;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Registros object = (Registros)obj;
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