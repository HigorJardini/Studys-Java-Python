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
@Table(name="tb_pessoa")
public class PessoaEntity implements Serializable{

  /**
   *
   */
  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy=GenerationType.SEQUENCE)
  private Long id;
  @Column(name="nome")
  protected String nome;
  @Column(name="cpf")
  protected String cpf;
  @Column(name="email")
  protected String email;
  @Column(name="sexo")
  protected Boolean sexo;

  public PessoaEntity() {
  }

  @JsonCreator
  public PessoaEntity(@JsonProperty("nome") String nome, @JsonProperty("cpf") String cpf, @JsonProperty("email") String email, @JsonProperty("sexo") Boolean sexo) {
      this.setNome(nome);
      this.setCpf(cpf);
      this.setEmail(email);
      this.setSexo(sexo);
  }


  public String getNome() {
      return nome;
  }

  public void setNome(String nome) {
      this.nome = nome;
  }

  public String getCpf() {
      return cpf;
  }

  public void setCpf(String cpf) {
      this.cpf = cpf;
  }

  public String getEmail() {
      return email;
  }

  public void setEmail(String email) {
      this.email = email;
  }

  public Boolean getSexo() {
      return sexo;
  }

  public void setSexo(Boolean sexo) {
      this.sexo = sexo;
  }

  @Override
  public String toString() {
      return "Pessoa{" +
              "  nome='" + this.getNome() + '\'' +
              ", cpf='" + this.getCpf() + '\'' +
              ", email='" + this.getEmail() + '\'' +
              ", sexo='" + this.getSexo() + '\'' +
              '}';
  }

  public void addPessoa(PessoaEntity pessoa){

  }

  public boolean removePessoa(PessoaEntity pessoa){
      return true;
  }

  public int getPessoa(PessoaEntity pessoa){
      return 0;
  }

  public boolean updatePessoa(PessoaEntity actual, PessoaEntity newValue){
      return true;
  }
}