package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;


/**
* @generated
*
**/
public class PacientePK implements Serializable {

  /**
  * @generated
  */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  private java.lang.String cpf = UUID.randomUUID().toString().toUpperCase();

  /**
   * @generated
   */
  private java.lang.String user;

  /**
   * Construtor
   * @generated
   */
  public PacientePK(){
  }

  /**
   * Obtém cpf
   * return cpf
   * @generated
   */
  public java.lang.String getCpf(){
    return this.cpf;
  }

  /**
   * Define cpf
   * @param cpf cpf
   * @generated
   */
  public PacientePK setCpf(java.lang.String cpf){
    this.cpf = cpf;
    return this;
  }
  /**
   * Obtém user
   * return user
   * @generated
   */
  public java.lang.String getUser(){
    return this.user;
  }

  /**
   * Define user
   * @param user user
   * @generated
   */
  public PacientePK setUser(java.lang.String user){
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
PacientePK object = (PacientePK)obj;
    if (cpf != null ? !cpf.equals(object.cpf) : object.cpf != null) return false;
    if (user != null ? !user.equals(object.user) : object.user != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((cpf == null) ? 0 : cpf.hashCode());
    result = 31 * result + ((user == null) ? 0 : user.hashCode());
    return result;
  }

}
