package com.senai.t2floricultura.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.t2floricultura.models.Produto;
import com.senai.t2floricultura.services.ProdutoService;

@RestController
@RequestMapping("/api")
public class ProdutoController {

	@Autowired
	ProdutoService produtoService; 
	
	@GetMapping("/produtos/")
	public List<Produto> listarProdutos(){
		return produtoService.listarProdutos(); 
	}
	@PostMapping("/produtos")
	public ResponseEntity<Produto> cadastrarProduto(@RequestBody Produto produto){
	return ResponseEntity.status(HttpStatus.CREATED).body(produtoService.criarProduto(produto));
	}
	
	@PutMapping("/produtos/{id}")
	public ResponseEntity<Produto>atualizarProduto() {
		
	}
	
	
	
	
	
}
