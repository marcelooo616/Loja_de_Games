package com.generation.loja_de_games.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.loja_de_games.model.Produto;
import com.generation.loja_de_games.repository.ProdutoRepository;









@RestController
@RequestMapping("/produto")
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class ProdutoController {
	
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	 @GetMapping 
	 public ResponseEntity<List<Produto>> GetAll(){
		 return ResponseEntity.ok(produtoRepository.findAll());
	 }
	 
	 @PostMapping
	 public ResponseEntity<Produto> inserirProduto(@RequestBody Produto produto){
		 return ResponseEntity.status(HttpStatus.CREATED).body(produtoRepository.save(produto));
	 }
	 
	 @PutMapping
	 public ResponseEntity<Produto> atualizarProduto(@RequestBody Produto produto){
		 return ResponseEntity.ok().body(produtoRepository.save(produto));
	 }
	 
	 @DeleteMapping("/{id}")
	 public void delete(@PathVariable Long id ) {
		 produtoRepository.deleteById(id);
	 }
	
		 
	

	

}
