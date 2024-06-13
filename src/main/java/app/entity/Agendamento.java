
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
* Classe que representa a tabela AGENDAMENTO
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"AGENDAMENTO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Agendamento")
public class Agendamento implements Serializable {
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
    @Column(name = "titulo", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String titulo;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "start", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date start;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "end", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date end;


    /**
    * @generated
    */
    @Column(name = "startTimeZone", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String startTimeZone;


    /**
    * @generated
    */
    @Column(name = "endTimeZone", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String endTimeZone;


    /**
    * @generated
    */
    @Column(name = "descricao", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String descricao;


    /**
    * @generated
    */
    @Column(name = "reccorenciarepeticao", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String reccorenciarepeticao;


    /**
    * @generated
    */
    @Column(name = "recorrenciaregra", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String recorrenciaregra;


    /**
    * @generated
    */
    @Column(name = "recorrenciaexecao", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String recorrenciaexecao;


    /**
    * @generated
    */
    @Column(name = "isallday", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean isallday;


    /**
    * Construtor
    * @generated
    */
    public Agendamento(){
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
    public Agendamento setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém titulo
    * return titulo
    * @generated
    */
    public java.lang.String getTitulo() {
        return this.titulo;
    }

    /**
    * Define titulo
    * @param titulo titulo
    * @generated
    */
    public Agendamento setTitulo(java.lang.String titulo) {
        this.titulo = titulo;
        return this;
    }
    /**
    * Obtém start
    * return start
    * @generated
    */
    public java.util.Date getStart() {
        return this.start;
    }

    /**
    * Define start
    * @param start start
    * @generated
    */
    public Agendamento setStart(java.util.Date start) {
        this.start = start;
        return this;
    }
    /**
    * Obtém end
    * return end
    * @generated
    */
    public java.util.Date getEnd() {
        return this.end;
    }

    /**
    * Define end
    * @param end end
    * @generated
    */
    public Agendamento setEnd(java.util.Date end) {
        this.end = end;
        return this;
    }
    /**
    * Obtém startTimeZone
    * return startTimeZone
    * @generated
    */
    public java.lang.String getStartTimeZone() {
        return this.startTimeZone;
    }

    /**
    * Define startTimeZone
    * @param startTimeZone startTimeZone
    * @generated
    */
    public Agendamento setStartTimeZone(java.lang.String startTimeZone) {
        this.startTimeZone = startTimeZone;
        return this;
    }
    /**
    * Obtém endTimeZone
    * return endTimeZone
    * @generated
    */
    public java.lang.String getEndTimeZone() {
        return this.endTimeZone;
    }

    /**
    * Define endTimeZone
    * @param endTimeZone endTimeZone
    * @generated
    */
    public Agendamento setEndTimeZone(java.lang.String endTimeZone) {
        this.endTimeZone = endTimeZone;
        return this;
    }
    /**
    * Obtém descricao
    * return descricao
    * @generated
    */
    public java.lang.String getDescricao() {
        return this.descricao;
    }

    /**
    * Define descricao
    * @param descricao descricao
    * @generated
    */
    public Agendamento setDescricao(java.lang.String descricao) {
        this.descricao = descricao;
        return this;
    }
    /**
    * Obtém reccorenciarepeticao
    * return reccorenciarepeticao
    * @generated
    */
    public java.lang.String getReccorenciarepeticao() {
        return this.reccorenciarepeticao;
    }

    /**
    * Define reccorenciarepeticao
    * @param reccorenciarepeticao reccorenciarepeticao
    * @generated
    */
    public Agendamento setReccorenciarepeticao(java.lang.String reccorenciarepeticao) {
        this.reccorenciarepeticao = reccorenciarepeticao;
        return this;
    }
    /**
    * Obtém recorrenciaregra
    * return recorrenciaregra
    * @generated
    */
    public java.lang.String getRecorrenciaregra() {
        return this.recorrenciaregra;
    }

    /**
    * Define recorrenciaregra
    * @param recorrenciaregra recorrenciaregra
    * @generated
    */
    public Agendamento setRecorrenciaregra(java.lang.String recorrenciaregra) {
        this.recorrenciaregra = recorrenciaregra;
        return this;
    }
    /**
    * Obtém recorrenciaexecao
    * return recorrenciaexecao
    * @generated
    */
    public java.lang.String getRecorrenciaexecao() {
        return this.recorrenciaexecao;
    }

    /**
    * Define recorrenciaexecao
    * @param recorrenciaexecao recorrenciaexecao
    * @generated
    */
    public Agendamento setRecorrenciaexecao(java.lang.String recorrenciaexecao) {
        this.recorrenciaexecao = recorrenciaexecao;
        return this;
    }
    /**
    * Obtém isallday
    * return isallday
    * @generated
    */
    public java.lang.Boolean getIsallday() {
        return this.isallday;
    }

    /**
    * Define isallday
    * @param isallday isallday
    * @generated
    */
    public Agendamento setIsallday(java.lang.Boolean isallday) {
        this.isallday = isallday;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Agendamento object = (Agendamento)obj;
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