package com.mengxuegu.springcloud.service.product;


import com.mengxuegu.springcloud.entities.product.Product;
import javafx.scene.control.Pagination;

public interface ProductService {
	
	public Pagination selectPaginationByQuery(Integer pageNo, String name, Long brandId, Boolean isShow);

	
	//保存商品//保存商品    库存
	public void insertProduct(Product product);
	
	//上架 批量
	public void isShow(Long[] ids);

	public Product getProductById(Long id);
}
