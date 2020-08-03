package com.tic.petshop.petshop.Repository;

import com.tic.petshop.petshop.Entidade.EspecieEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EspecieRepository extends JpaRepository<EspecieEntity, Long> {
  
}