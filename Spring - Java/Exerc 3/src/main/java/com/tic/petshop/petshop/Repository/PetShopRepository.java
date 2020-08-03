package com.tic.petshop.petshop.Repository;

import com.tic.petshop.petshop.Entidade.PetShopEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetShopRepository extends JpaRepository<PetShopEntity, Long> {
  
}