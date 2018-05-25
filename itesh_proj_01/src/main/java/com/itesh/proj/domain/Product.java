package com.itesh.proj.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT")
public class Product {

	@Id
	@Column(name = "PROD_ID")
	int prodId;

	@Column(name = "PARENT_PROD_CODE")
	String parentProdCode;
	
	@Column(name = "PROD_CODE")
	String ProdCode;

	@Column(name = "PROD_NAME")
	String prodName;
	
	@Column(name = "DEL_YN")
	String delYn;

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getParentProdCode() {
		return parentProdCode;
	}

	public void setParentProdCode(String parentProdCode) {
		this.parentProdCode = parentProdCode;
	}

	public String getProdCode() {
		return ProdCode;
	}

	public void setProdCode(String prodCode) {
		ProdCode = prodCode;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getDelYn() {
		return delYn;
	}

	public void setDelYn(String delYn) {
		this.delYn = delYn;
	}

}
