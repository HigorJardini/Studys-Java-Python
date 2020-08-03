package com.tic.petshop.petshop.Entidade;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="tb_especie")
public class EspecieEntity implements Serializable{

  /**
   *
   */
  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Long id;
  @Column(name="nome")
  private String nome;
  @Column(name="status")
  private Boolean status;

  public EspecieEntity() {
  }

  @JsonCreator
  public EspecieEntity(@JsonProperty("nome") String nome, @JsonProperty("status") Boolean status) {
      this.setNome(nome);
      this.setStatus(status);
  }

  public String getNome() {
      return nome;
  }

  public void setNome(String nome) {
      this.nome = nome;
  }

  public Boolean getStatus() {
      return status;
  }

  public void setStatus(Boolean status) {
      this.status = status;
  }

  @Override
  public String toString() {
      return getNome();
  }
  
  public void addEspecie(EspecieEntity especie){

  }

  public boolean removeEspecie(EspecieEntity especie){
      return true;
  }

  public int getEspecie(EspecieEntity especie){
      return 0;
  }

  public boolean updateEspecie(EspecieEntity actual, EspecieEntity newValue){
      return true;
  }
}