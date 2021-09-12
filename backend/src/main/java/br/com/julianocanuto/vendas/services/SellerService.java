package br.com.julianocanuto.vendas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.julianocanuto.vendas.entities.Seller;
import br.com.julianocanuto.vendas.repositories.SellerRepository;

@Service
public class SellerService {

	@Autowired
	private SellerRepository repository;
	
	public List<Seller> findAll(){
		return repository.findAll();
	}
}
