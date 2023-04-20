package com.generation.farmacia.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.farmacia.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	public List <Produto> findByNomeOrFornecedor(String nome, String fornecedor);

	public List <Produto> findByNomeAndFornecedor(String nome, String fornecedor);

	public List <Produto> findByPrecoBetween(BigDecimal inicio, BigDecimal fim);

}
