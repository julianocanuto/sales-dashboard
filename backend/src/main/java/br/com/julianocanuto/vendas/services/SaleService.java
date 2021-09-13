package br.com.julianocanuto.vendas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.julianocanuto.vendas.dto.SaleDTO;
import br.com.julianocanuto.vendas.dto.SaleSumDTO;
import br.com.julianocanuto.vendas.entities.Sale;
import br.com.julianocanuto.vendas.repositories.SaleRepository;
import br.com.julianocanuto.vendas.repositories.SellerRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable){
		sellerRepository.findAll();
		Page<Sale> listOfSalesFromDB = repository.findAll(pageable);
		return listOfSalesFromDB.map(sale -> new SaleDTO(sale));
	}
	
	@Transactional(readOnly = true)
	public List<SaleSumDTO> amountOfSalesGroupedBySeller(){
	
		return repository.amountOfSalesGroupedBySeller();
	}
}
