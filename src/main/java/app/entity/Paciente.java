
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
* Classe que representa a tabela PACIENTE
* @generated
*/
@javax.persistence.Entity
@IdClass(PacientePK.class)
@javax.persistence.Table(name = "\"PACIENTE\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Paciente")
public class Paciente implements Serializable {
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
    @Column(name = "cpf", nullable = false, insertable=true, updatable=true)
        private java.lang.String cpf = UUID.randomUUID().toString().toUpperCase();



    /**
    * @generated
    */
    @Column(name = "numeroDeConsultas", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer numeroDeConsultas;


    /**
    * @generated
    */
    @Column(name = "ipDoPaciente", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.String ipDoPaciente;


    /**
    * Construtor
    * @generated
    */
    public Paciente(){
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
    public Paciente setUser(User user) {
        this.user = user;
        return this;
    }
    /**
    * Obtém cpf
    * return cpf
    * @generated
    */
    public java.lang.String getCpf() {
        return this.cpf;
    }

    /**
    * Define cpf
    * @param cpf cpf
    * @generated
    */
    public Paciente setCpf(java.lang.String cpf) {
        this.cpf = cpf;
        return this;
    }
    /**
    * Obtém numeroDeConsultas
    * return numeroDeConsultas
    * @generated
    */
    public java.lang.Integer getNumeroDeConsultas() {
        return this.numeroDeConsultas;
    }

    /**
    * Define numeroDeConsultas
    * @param numeroDeConsultas numeroDeConsultas
    * @generated
    */
    public Paciente setNumeroDeConsultas(java.lang.Integer numeroDeConsultas) {
        this.numeroDeConsultas = numeroDeConsultas;
        return this;
    }
    /**
    * Obtém ipDoPaciente
    * return ipDoPaciente
    * @generated
    */
    public java.lang.String getIpDoPaciente() {
        return this.ipDoPaciente;
    }

    /**
    * Define ipDoPaciente
    * @param ipDoPaciente ipDoPaciente
    * @generated
    */
    public Paciente setIpDoPaciente(java.lang.String ipDoPaciente) {
        this.ipDoPaciente = ipDoPaciente;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Paciente object = (Paciente)obj;
        if (user != null ? !user.equals(object.user) : object.user != null) return false;
        if (cpf != null ? !cpf.equals(object.cpf) : object.cpf != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((user == null) ? 0 : user.hashCode());
        result = 31 * result + ((cpf == null) ? 0 : cpf.hashCode());
        return result;
    }

}