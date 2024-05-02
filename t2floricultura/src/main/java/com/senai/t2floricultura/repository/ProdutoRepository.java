package com.senai.t2floricultura.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.senai.t2floricultura.models.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto,Long>{
	

}
