
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
* Classe que representa a tabela AGENDADOIS
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"AGENDADOIS\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.AgendaDois")
@CronappTable(role=CronappTableRole.CLASS)
public class AgendaDois implements Serializable {
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
    @CronappColumn(attributeType="STRING", label="Titulo")
    @Column(name = "titulo", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String titulo;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @CronappColumn(attributeType="TIMESTAMP", label="Start")
    @Column(name = "start", nullable = true, unique = false, insertable=true, updatable=true, columnDefinition = "TIMESTAMP")
        
        private java.util.Date start;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @CronappColumn(attributeType="TIMESTAMP", label="End")
    @Column(name = "end", nullable = true, unique = false, insertable=true, updatable=true, columnDefinition = "TIMESTAMP")
        
        private java.util.Date end;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Start Time Zone")
    @Column(name = "startTimeZone", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String startTimeZone;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="End Time Zone")
    @Column(name = "endTimeZone", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String endTimeZone;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Descricao")
    @Column(name = "descricao", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String descricao;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Reccorenciarepeticao")
    @Column(name = "reccorenciarepeticao", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String reccorenciarepeticao;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Recorrenciaregra")
    @Column(name = "recorrenciaregra", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String recorrenciaregra;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Recorrenciaexecao")
    @Column(name = "recorrenciaexecao", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String recorrenciaexecao;


    /**
    * @generated
    */
    @CronappColumn(attributeType="BOOLEAN", label="Isallday")
    @Column(name = "isallday", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean isallday;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Usuario")
    @Column(name = "usuario", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String usuario;


    /**
    * Construtor
    * @generated
    */
    public AgendaDois(){
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
    public AgendaDois setId(java.lang.String id) {
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
    public AgendaDois setTitulo(java.lang.String titulo) {
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
    public AgendaDois setStart(java.util.Date start) {
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
    public AgendaDois setEnd(java.util.Date end) {
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
    public AgendaDois setStartTimeZone(java.lang.String startTimeZone) {
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
    public AgendaDois setEndTimeZone(java.lang.String endTimeZone) {
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
    public AgendaDois setDescricao(java.lang.String descricao) {
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
    public AgendaDois setReccorenciarepeticao(java.lang.String reccorenciarepeticao) {
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
    public AgendaDois setRecorrenciaregra(java.lang.String recorrenciaregra) {
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
    public AgendaDois setRecorrenciaexecao(java.lang.String recorrenciaexecao) {
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
    public AgendaDois setIsallday(java.lang.Boolean isallday) {
        this.isallday = isallday;
        return this;
    }
    /**
    * Obtém usuario
    * return usuario
    * @generated
    */
    public java.lang.String getUsuario() {
        return this.usuario;
    }

    /**
    * Define usuario
    * @param usuario usuario
    * @generated
    */
    public AgendaDois setUsuario(java.lang.String usuario) {
        this.usuario = usuario;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
AgendaDois object = (AgendaDois)obj;
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