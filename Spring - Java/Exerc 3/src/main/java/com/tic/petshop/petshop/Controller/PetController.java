package com.tic.petshop.petshop.Controller;

import com.tic.petshop.petshop.Entidade.*;
import com.tic.petshop.petshop.Repository.PetRepository;

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
public class PetController {
  @Autowired
  PetRepository injecao;

  @PostMapping(value="/pet/post")
  public void addPet(@RequestBody PetEntity pet){
      injecao.save(pet);
  }

  @DeleteMapping(value="/pet/delete/{id}")
  public void removePet(@PathVariable Long id){
    injecao.deleteById(id);
    return;
  }

  @GetMapping(value="/pet")
  public List<PetEntity> getPets(){
      return injecao.findAll();
  }

  @PutMapping(value="/pet/edita")
  public PetEntity updatePet(@RequestBody PetEntity pet){
    return injecao.save(pet);
  }
}