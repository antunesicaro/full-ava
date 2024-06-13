
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
* Classe que representa a tabela CONSULTA
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"CONSULTA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Consulta")
@CronappTable(role=CronappTableRole.CLASS)
public class Consulta implements Serializable {
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
    @Temporal(TemporalType.TIMESTAMP)
    @CronappColumn(attributeType="DATETIME", label="Data")
    @Column(name = "data", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date data;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Descricao")
    @Column(name = "descricao", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String descricao;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumns({
    @JoinColumn(name="fk_paciente_cpf", nullable = true, referencedColumnName = "cpf", insertable=true, updatable=true)
                    ,
    @JoinColumn(name="fk_paciente_fk_user", nullable = true, referencedColumnName = "fk_user", insertable=true, updatable=true)
                    
    })
        
        private Paciente paciente;


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
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_sala", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Sala sala;


    /**
    * Construtor
    * @generated
    */
    public Consulta(){
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
    public Consulta setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém data
    * return data
    * @generated
    */
    public java.util.Date getData() {
        return this.data;
    }

    /**
    * Define data
    * @param data data
    * @generated
    */
    public Consulta setData(java.util.Date data) {
        this.data = data;
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
    public Consulta setDescricao(java.lang.String descricao) {
        this.descricao = descricao;
        return this;
    }
    /**
    * Obtém paciente
    * return paciente
    * @generated
    */
    public Paciente getPaciente() {
        return this.paciente;
    }

    /**
    * Define paciente
    * @param paciente paciente
    * @generated
    */
    public Consulta setPaciente(Paciente paciente) {
        this.paciente = paciente;
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
    public Consulta setPsicologo(Psicologo psicologo) {
        this.psicologo = psicologo;
        return this;
    }
    /**
    * Obtém sala
    * return sala
    * @generated
    */
    public Sala getSala() {
        return this.sala;
    }

    /**
    * Define sala
    * @param sala sala
    * @generated
    */
    public Consulta setSala(Sala sala) {
        this.sala = sala;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Consulta object = (Consulta)obj;
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