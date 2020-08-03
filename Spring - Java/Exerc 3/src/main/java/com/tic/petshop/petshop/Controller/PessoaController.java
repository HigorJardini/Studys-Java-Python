package com.tic.petshop.petshop.Controller;

import com.tic.petshop.petshop.Entidade.*;

import com.tic.petshop.petshop.Repository.PessoaRepository;

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
public class PessoaController {
  @Autowired
  PessoaRepository injecao;

  @PostMapping(value="/pessoa/post")
  public void addPessoa(@RequestBody PessoaEntity pessoa){
      injecao.save(pessoa);
  }

  @DeleteMapping(value="/pessoa/delete/{id}")
  public void removePessoa(@PathVariable Long id){
    injecao.deleteById(id);
    return;
  }

  @GetMapping(value="/pessoa")
  public List<PessoaEntity> getPessoa(){
      return injecao.findAll();
  }

  @PutMapping(value="/pessoa/edita")
  public PessoaEntity updatePessoa(@RequestBody PessoaEntity pessoa){
    return injecao.save(pessoa);
  }
}