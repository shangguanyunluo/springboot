package springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springboot.entity.GoodsType;
import springboot.service.GoodsTypeService;

/**
 * @Description: 商品类型控制层
 * @author Administrator
 *
 */

@RestController
public class GoodsTypeController {

	@Autowired
	private GoodsTypeService typeService;

	/**
	 * 
	 * @Title: getGoodsTypeList
	 * @Description: 获取商品类型列表
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/getGoodsTypeList")
	public List<GoodsType> getGoodsTypeList() throws Exception {
		// 调用业务逻辑,返回数据
		return typeService.getList();
	}

	@RequestMapping(value = "/getByTypeName")
	public GoodsType getByTypeName(String typeName) throws Exception {
		return typeService.getByTypeName(typeName);
	}

}
