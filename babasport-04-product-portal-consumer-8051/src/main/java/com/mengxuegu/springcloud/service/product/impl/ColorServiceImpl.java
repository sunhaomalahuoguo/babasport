package com.mengxuegu.springcloud.service.product.impl;


import com.mengxuegu.springcloud.dao.product.ColorDao;
import com.mengxuegu.springcloud.entities.product.Color;
import com.mengxuegu.springcloud.entities.product.ColorQuery;
import com.mengxuegu.springcloud.service.product.ColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("colorService")
public class ColorServiceImpl implements ColorService {

	@Autowired
	private ColorDao colorDao;
	
	//查询
	public List<Color> selectColorListByQuery(){
		
		ColorQuery colorQuery = new ColorQuery();
		colorQuery.createCriteria().andParentIdNotEqualTo(0L);
		return colorDao.selectByExample(colorQuery);
	}
}
