package com.tic.petshop.petshop.Controller;

import com.tic.petshop.petshop.Entidade.*;
import com.tic.petshop.petshop.Repository.PetShopRepository;

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
public class PetShopController {
  @Autowired
  PetShopRepository injecao;

  @PostMapping(value="/petshop/post")
  public void addPetshop(@RequestBody PetShopEntity petshop){
      injecao.save(petshop);
  }

  @DeleteMapping(value="/petshop/delete/{id}")
  public void removePetshop(@PathVariable Long id){
    injecao.deleteById(id);
    return;
  }

  @GetMapping(value="/petshop")
  public List<PetShopEntity> getPetShops(){
      return injecao.findAll();
  }

  @PutMapping(value="/petshop/edita")
  public PetShopEntity updatePetshop(@RequestBody PetShopEntity petshop){
    return injecao.save(petshop);
  }
}