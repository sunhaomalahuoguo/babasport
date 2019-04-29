package com.mengxuegu.springcloud.service.product.impl;

import com.mengxuegu.springcloud.dao.product.ColorDao;
import com.mengxuegu.springcloud.dao.product.SkuDao;
import com.mengxuegu.springcloud.entities.product.Sku;
import com.mengxuegu.springcloud.entities.product.SkuQuery;
import com.mengxuegu.springcloud.service.product.SkuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("skuService")
public class SkuServiceImpl implements SkuService {

	@Autowired
	private SkuDao skuDao;
	@Autowired
	private ColorDao colorDao;
	//通过商品ID查询Sku结果集
	public List<Sku> selectSkuListByProductId(Long productId){
		SkuQuery skuQuery = new SkuQuery();
		skuQuery.createCriteria().andProductIdEqualTo(productId);
		
		List<Sku> skus = skuDao.selectByExample(skuQuery);
		for (Sku sku : skus) {
			sku.setColor(colorDao.selectByPrimaryKey(sku.getColorId()));
		}
		return skus;
	}
	//修改
	public void updateSkuById(Sku sku){
		skuDao.updateByPrimaryKeySelective(sku);
	}
}
