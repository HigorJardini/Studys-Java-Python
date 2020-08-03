package br.com.unifacef.filme.entities;

public class Filme {
      private String id;
      private String nome;
      private String diretor;
      private String genero;

      public Filme() {

      }

      public Filme(String id, String nome, String diretor, String genero){
            this.setId(id);
            this.setNome(nome);
            this.setDiretor(diretor);
            this.setGenero(genero);
      }

      public String getId(){
            return this.id;
      }
      public String getNome(){
            return this.nome;
      }
      public String getDiretor(){
            return this.diretor;
      }
      public String getGenero(){
            return this.genero;
      }

      public String setId(String id){
            return this.id = id;
      }

      public String setNome(String nome){
            return this.nome = nome;
      }

      public String setDiretor(String diretor){
            return this.diretor = diretor;
      }

      public String setGenero(String genero){
            return this.genero = genero;
      }
}