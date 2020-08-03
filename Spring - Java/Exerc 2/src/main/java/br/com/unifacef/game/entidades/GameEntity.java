package br.com.unifacef.game.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

// import javassist.SerialVersionUID;

@Entity // Define a Entidade
@Table(name="game") // Definite o nome da table
public class GameEntity implements Serializable{
    
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    
    @Id // Chave única
    @GeneratedValue(strategy=GenerationType.AUTO) // Serial
    private Long id;
    @Column(name="nome")
    private String nome;
    @Column(name="classificacao")
    private int classificacao;
    @Column(name="genero")
    private String genero;

    public GameEntity(){
        
    }
    @JsonCreator
    public GameEntity(@JsonProperty("nome") String nome, @JsonProperty("classificacao") int classificacao, @JsonProperty("genero") String genero){
        this.setNome(nome);
        this.setClassificacao(classificacao);
        this.setGenero(genero);
    }

    public String getNome() {
        return nome;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public String getGenero() {
        return genero;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public void setClassificacao(final int classificacao) {
        this.classificacao = classificacao;
    }

    public void setGenero(final String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return getNome();
    }
}