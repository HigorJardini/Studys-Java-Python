package br.com.unifacef.game.repository;

import br.com.unifacef.game.entidades.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<GameEntity, Long>  {
				

}