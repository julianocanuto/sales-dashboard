package br.com.julianocanuto.vendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.julianocanuto.vendas.dto.SaleDTO;
import br.com.julianocanuto.vendas.dto.SaleSuccessDTO;
import br.com.julianocanuto.vendas.dto.SaleSumDTO;
import br.com.julianocanuto.vendas.services.SaleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/sales")
@Api(value = "API REST Sales")
@CrossOrigin(origins = "*")
public class SaleController {

	@Autowired
	private SaleService service;
	
	@GetMapping
	@ApiOperation(value = "Return a pageable list of sales")
	public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable){
		Page<SaleDTO> list = service.findAll(pageable);
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/amount-by-seller")
	@ApiOperation(value = "Return amount sold by seller")
	public ResponseEntity<List<SaleSumDTO>> amountOfSalesGroupedBySeller(){
		List<SaleSumDTO> list = service.amountOfSalesGroupedBySeller();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/success-by-seller")
	@ApiOperation(value = "Return success rate (deals/visited_clients) by seller")
	public ResponseEntity<List<SaleSuccessDTO>> successGroupedBySeller(){
		List<SaleSuccessDTO> list = service.successGroupedBySeller();
		return ResponseEntity.ok(list);
	}
}
