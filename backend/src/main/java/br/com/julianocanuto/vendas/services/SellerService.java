package br.com.julianocanuto.vendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.julianocanuto.vendas.dto.SellerDTO;
import br.com.julianocanuto.vendas.entities.Seller;
import br.com.julianocanuto.vendas.repositories.SellerRepository;

@Service
public class SellerService {

	@Autowired
	private SellerRepository repository;
	
	public List<SellerDTO> findAll(){
		List<Seller> listOfSellersFromDB = repository.findAll();
		return listOfSellersFromDB.stream().map(seller -> new SellerDTO(seller)).collect(Collectors.toList());
	}
}
