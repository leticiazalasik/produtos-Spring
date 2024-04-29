package com.senai.t2floricultura.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.t2floricultura.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto,Long>{

}
