package com.apicrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apicrud.models.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
