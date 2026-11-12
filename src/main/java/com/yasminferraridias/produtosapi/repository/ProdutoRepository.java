package com.yasminferraridias.produtosapi.repository;

import com.yasminferraridias.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {

}
