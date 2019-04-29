package com.mengxuegu.springcloud.service.product;


import com.mengxuegu.springcloud.entities.product.Color;

import java.util.List;

public interface ColorService {
	
	//查询
	public List<Color> selectColorListByQuery();

}
