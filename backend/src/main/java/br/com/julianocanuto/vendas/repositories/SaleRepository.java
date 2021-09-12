package br.com.julianocanuto.vendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.julianocanuto.vendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
