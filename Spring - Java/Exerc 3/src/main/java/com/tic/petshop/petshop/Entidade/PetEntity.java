package com.tic.petshop.petshop.Entidade;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="tb_pet")
public class PetEntity implements Serializable{

  private static final long serialVersionUID = 1L;

  @Id 
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Long id;
  @Column(name="nome")
  private String nome;
  @Column(name="data_nascimento")
  @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss")
  private Date data_de_nascimento;
  @Column(name="sexo")
  private Boolean sexo;
  
  private EspecieEntity especie;

  public PetEntity() {
      
  }
  
  @JsonCreator
  public PetEntity(@JsonProperty("nome") String nome, @JsonProperty("date") Date data_de_nascimento, @JsonProperty("sexo") Boolean sexo, @JsonProperty("especie") EspecieEntity especie) {
      this.setNome(nome);
      this.setData_de_nascimento(data_de_nascimento);
      this.setSexo(sexo);
      this.setEspecie(especie);
  }

  public Long getId(){
      return id;
  }
   
  public String getNome() {
      return nome;
  }

  public void setNome(String nome) {
      this.nome = nome;
  }

  public Date getData_de_nascimento() {
      return data_de_nascimento;
  }

  public void setData_de_nascimento(Date data_de_nascimento) {
      this.data_de_nascimento = data_de_nascimento;
  }

  public Boolean getSexo() {
      return sexo;
  }

  public void setSexo(Boolean sexo) {
      this.sexo = sexo;
  }

  public EspecieEntity getEspecie() {
      return especie;
  }

  public void setEspecie(EspecieEntity especie) {
      this.especie = especie;
  }

  @Override
  public String toString() {
      return "Pet{" + "nome=" + this.getNome() +
              ", data_de_nascimento=" + this.getData_de_nascimento() +
              ", sexo=" + this.getSexo() +
              ", especie=" + this.getEspecie() + '}';
  }
  public void addPet(PetEntity pet){

  }

  public boolean removePet(PetEntity pet){
      return true;
  }

  public int getPet(PetEntity pet){
      return 0;
  }

  public boolean updatepet(PetEntity actual, PetEntity newValue){
      return true;
  }
}