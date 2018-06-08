package springboot.serviceImpl;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.ContextLoader;

import springboot.entity.GoodsType;
import springboot.mapper.GoodsTypeMapper;
import springboot.service.GoodsTypeService;

@Service
@Transactional(rollbackFor = { RuntimeException.class, Exception.class })
public class GoodsTypeServiceImpl implements GoodsTypeService {

	// 数据访问
	@Autowired
	private GoodsTypeMapper goodsTypeMapper;

	/**
	 * 
	 * @Title: saveGoodsType
	 * @Description: 添加一个商品类型
	 * @param goodsType
	 * @throws Exception
	 */
	public String saveGoodsType(GoodsType goodsType) throws Exception {
		if (!checkTypeName(goodsType.getTypeName())) {
			goodsTypeMapper.saveGoodsType(goodsType);
			updateServletContext();
			return "添加成功";
		} else {
			return "商品类型名称已存在,添加失败";
		}
	}

	/**
	 * 
	 * @Title: deleteGoodsType
	 * @Description: 删除一个商品类型
	 * @param typeId
	 * @throws Exception
	 */
	public void deleteGoodsType(String typeId) throws Exception {
		// 删除
		goodsTypeMapper.deleteGoodsType(typeId);
		// 更新域对象
		updateServletContext();

	}

	/**
	 * @Title: updateGoodsType
	 * @Description: 修改一个商品类型
	 * @param goodsType
	 * @throws Exception
	 */
	public String updateGoodsType(GoodsType goodsType) throws Exception {
		// 检查商品类型名称是否重复
		if (!checkTypeName(goodsType.getTypeName())) {
			// 修改
			goodsTypeMapper.updateGoodsType(goodsType);
			// 更新域对象
			updateServletContext();
			return "更新成功";
		} else {
			return "商品类型名称已存在,更新失败";
		}
	}

	/**
	 * 
	 * @Title: getGoodsTypeList
	 * @Description: 从域对象中获取所有商品类型列表
	 * @return
	 * @throws Exception
	 */
	public List<GoodsType> getGoodsTypeList() throws Exception {
		// TODO Auto-generated method stub
		return goodsTypeMapper.getList();
	}

	/**
	 * 
	 * @Title: getList
	 * @Description: 从数据库中获取所有商品类型列表
	 * @return
	 * @throws Exception
	 */
	public List<GoodsType> getList() throws Exception {
		List<GoodsType> list = goodsTypeMapper.getList();
		return list;

	}

	@Override
	public GoodsType getByTypeName(String typeName) throws Exception {
		// TODO Auto-generated method stub
		return goodsTypeMapper.getByTypeName(typeName);
	}

	/**
	 * 
	 * @Title: checkTypeName
	 * @Description: 检查商品类型名称是否重复
	 * @param typeName
	 */
	private boolean checkTypeName(String typeName) throws Exception {

		// 依据商品名称查询
		GoodsType goodsType = goodsTypeMapper.getByTypeName(typeName);
		return goodsType == null ? false : true;

	}

	/**
	 * 
	 * @Title: updateServletContext
	 * @Description: 更新域对象里的内容
	 * @throws Exception
	 */
	private void updateServletContext() throws Exception {
		// 通过Spring获取ServletContext域对象
		ServletContext servletContext = ContextLoader.getCurrentWebApplicationContext().getServletContext();

		List<GoodsType> typeList = getList();
		servletContext.setAttribute("GOODS_TYPE_LIST", typeList);

	}

}
