package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;


/**
* @generated
*
**/
public class PsicologoPK implements Serializable {

  /**
  * @generated
  */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  private java.lang.String crp = UUID.randomUUID().toString().toUpperCase();

  /**
   * @generated
   */
  private java.lang.String user;

  /**
   * Construtor
   * @generated
   */
  public PsicologoPK(){
  }

  /**
   * Obtém crp
   * return crp
   * @generated
   */
  public java.lang.String getCrp(){
    return this.crp;
  }

  /**
   * Define crp
   * @param crp crp
   * @generated
   */
  public PsicologoPK setCrp(java.lang.String crp){
    this.crp = crp;
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
  public PsicologoPK setUser(java.lang.String user){
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
PsicologoPK object = (PsicologoPK)obj;
    if (crp != null ? !crp.equals(object.crp) : object.crp != null) return false;
    if (user != null ? !user.equals(object.user) : object.user != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((crp == null) ? 0 : crp.hashCode());
    result = 31 * result + ((user == null) ? 0 : user.hashCode());
    return result;
  }

}
