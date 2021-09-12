package br.com.julianocanuto.vendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.julianocanuto.vendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long>{

}
