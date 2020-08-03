package com.tic.petshop.petshop.Repository;

import com.tic.petshop.petshop.Entidade.PetEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<PetEntity, Long> {
  
}