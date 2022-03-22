package com.apicrud.controlleres;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apicrud.models.Produto;
import com.apicrud.repository.ProdutoRepository;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
	
	private ProdutoRepository  produtoRepository;
	
	@GetMapping
	public List<Produto> exibir() {
		return produtoRepository.findAll();
		
	}
	
	@PostMapping
	public Produto salvar(Produto produto) {
		return produtoRepository.save(produto);
	}
	
	@DeleteMapping
	public Produto deletar(long produtoId) {
		Produto pr = produtoRepository.getById(produtoId);
		produtoRepository.delete(pr);
		return pr;
	}
	
	@PutMapping
	public Produto update(Produto produto) {
		return produtoRepository.save(produto);
	}
	
}
