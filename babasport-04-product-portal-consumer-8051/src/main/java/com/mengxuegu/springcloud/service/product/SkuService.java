package com.mengxuegu.springcloud.service.product;


import com.mengxuegu.springcloud.entities.product.Sku;

import java.util.List;

public interface SkuService {

	// 通过商品ID查询Sku结果集
	public List<Sku> selectSkuListByProductId(Long productId);

	// 修改
	public void updateSkuById(Sku sku);
}
