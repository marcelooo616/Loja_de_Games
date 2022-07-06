package com.generation.loja_de_games.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.loja_de_games.model.Estoque;


@Repository
public interface EstoqueRepository extends JpaRepository <Estoque, Long> {
	
	public List<EstoqueRepository> findAllByCodigoContainingIgnoreCase(String codigo);

}
