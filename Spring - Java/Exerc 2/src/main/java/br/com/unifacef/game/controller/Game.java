package br.com.unifacef.game.controller;

import br.com.unifacef.game.repository.GameRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.unifacef.game.entidades.*;

// Configura quem pode consumir a API
@CrossOrigin(origins = "*")
@RestController // Responsavel por controlar as requsições REST
public class Game {
  @Autowired
  GameRepository injecao;

  @PostMapping(value="/post")
  public void addGame(@RequestBody GameEntity game){
      injecao.save(game);
  }

  @DeleteMapping(value="/delete/{id}")
  public void removeGame(@PathVariable Long id){
    injecao.deleteById(id);
    return;
  }

  @GetMapping(value="/")
  public List<GameEntity> getGames(){
      return injecao.findAll();
  }

  @PutMapping(value="/edita")
  public GameEntity updateGame(@RequestBody GameEntity game){
    return injecao.save(game);
  }
  
}