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
@Table(name="tb_petshop")
public class PetShopEntity implements Serializable{

  private static final long serialVersionUID = 1L;

  @Id 
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Long id;
  @Column(name="nome")
  private String nome;
  @Column(name="telefone")
  private String telefone;
  @Column(name="cnpj")
  private String cnpj;
  @Column(name="endereco")
  private String endereco;
  
  public PetShopEntity() {

  }

  @JsonCreator
  public PetShopEntity(@JsonProperty("nome") String nome, @JsonProperty("telefone") String telefone, String cnpj, String endereco) {
      this.setNome(nome);
      this.setTelefone(telefone);
      this.setCnpj(cnpj);
      this.setEndereco(endereco);
  }

  public String getNome() {
      return nome;
  }

  public void setNome(String nome) {
      this.nome = nome;
  }

  public String getTelefone() {
      return telefone;
  }

  public void setTelefone(String telefone) {
      this.telefone = telefone;
  }

  public String getCnpj() {
      return cnpj;
  }

  public void setCnpj(String cnpj) {
      this.cnpj = cnpj;
  }

  public String getEndereco() {
      return endereco;
  }

  public void setEndereco(String endereco) {
      this.endereco = endereco;
  }

  @Override
  public String toString() {
      return "PetShop{" + 
              "nome=" + this.getNome() +
              ", telefone=" + this.getTelefone() +
              ", cnpj=" + this.getCnpj() +
              ", endereco=" + this.getEndereco() + '}';
  }
  
  public void addPetShop(PetShopEntity petshop){

  }

  public boolean removePetShop(PetShopEntity petshop){
      return true;
  }

  public int getPetShop(PetShopEntity petshop){
      return 0;
  }

  public boolean updatePetShop(PetShopEntity actual, PetShopEntity newValue){
      return true;
  }
}