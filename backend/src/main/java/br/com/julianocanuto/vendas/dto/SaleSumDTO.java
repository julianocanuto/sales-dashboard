package br.com.julianocanuto.vendas.dto;

import java.io.Serializable;

import br.com.julianocanuto.vendas.entities.Seller;

public class SaleSumDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String sellerName;
	private Double sumOfSales;

	public SaleSumDTO() {

	}

	public SaleSumDTO(Seller seller, Double sumOfSales) {
		this.sellerName = seller.getName();
		this.sumOfSales = sumOfSales;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Double getSumOfSales() {
		return sumOfSales;
	}

	public void setSumOfSales(Double sumOfSales) {
		this.sumOfSales = sumOfSales;
	}

}
