package com.tic.petshop.petshop.Controller;

import com.tic.petshop.petshop.Entidade.*;
import com.tic.petshop.petshop.Repository.EspecieRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class EspecieController {
  @Autowired
  EspecieRepository injecao;

  @PostMapping(value="/especie/post")
  public void addEspecie(@RequestBody EspecieEntity especie){
      injecao.save(especie);
  }

  @DeleteMapping(value="/especie/delete/{id}")
  public void removeEspecie(@PathVariable Long id){
    injecao.deleteById(id);
    return;
  }

  @GetMapping(value="/especie")
  public List<EspecieEntity> getEspecie(){
      return injecao.findAll();
  }

  @PutMapping(value="/especie/edita")
  public EspecieEntity updateEspecie(@RequestBody EspecieEntity especie){
    return injecao.save(especie);
  }
}