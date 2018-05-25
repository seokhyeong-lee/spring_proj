package com.itesh.proj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itesh.proj.domain.Product;
import com.itesh.proj.repository.ProductRepository;

@Controller
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductRepository productDao;
	
	@RequestMapping("/list")
	@ResponseBody
	public List<Product> list() {
		List<Product> productList = productDao.findAll();
		return productList;
	}
	
}
