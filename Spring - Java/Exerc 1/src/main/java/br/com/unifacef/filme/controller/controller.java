package br.com.unifacef.filme.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

import br.com.unifacef.filme.entities.*;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
// @RequestMapping("teste/filme") // Requição feita pela URL
public class controller {
  ArrayList<Filme> filmes = new ArrayList<Filme>();

    @GetMapping(value="/")
    public ArrayList<Filme> getFilme(){
          return this.filmes;
    }

    @PostMapping(value="/manda")
    public Filme postFilme(@RequestBody Filme filme) {
      filmes.add(filme);
      return filme;
    }

    @DeleteMapping(value = "/deleta/{id}")
    public Filme deleteFilme(@PathVariable String id) {
      Filme teste = null;
      for (final Filme filme : this.filmes) {
        if (filme.getId().equals(id)) {
          teste = filme;
        }
      }
      if (teste != null) {
        filmes.remove(teste);
        return teste;
      } else
        return null;
    }

    @PutMapping(value = "/put")
    public Filme updateFilme(@RequestBody Filme newFilme) {
      for (Filme filme : this.filmes) {
        if (filme.getId().equals(newFilme.getId())) {
            int pos = this.filmes.indexOf(filme);
            this.filmes.set(pos, newFilme);
            return newFilme;
          }
        }
        return null;
    }
}