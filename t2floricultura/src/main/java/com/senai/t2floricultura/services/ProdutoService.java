package com.senai.t2floricultura.services;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

import com.senai.t2floricultura.models.Produto;
import com.senai.t2floricultura.repository.ProdutoRepository;

@Service
public class ProdutoService {

@Autowired
private ProdutoRepository produtoRepository; 

public Produto criarProduto(Produto produto) { 

	return produtoRepository.save(produto); 
}

public List<Produto> listarProdutos() {
	return produtoRepository.findAll(); 
}

public Produto atualizarProduto(Long id, Produto produto) { 
produto.setIdProduto(id);
return produtoRepository.save(produto); 
}

public void excluirProduto(Long id) { 
produtoRepository.deleteById(id);

}



}
