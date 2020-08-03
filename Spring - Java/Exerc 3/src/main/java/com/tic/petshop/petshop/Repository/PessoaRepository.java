package com.tic.petshop.petshop.Repository;

import com.tic.petshop.petshop.Entidade.PessoaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<PessoaEntity, Long>{

}