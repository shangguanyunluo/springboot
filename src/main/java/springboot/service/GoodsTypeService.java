package springboot.service;

import java.util.List;

import springboot.entity.GoodsType;

public interface GoodsTypeService {

    /**
     * 
     * @Title: saveGoodsType
     * @Description: 添加一个商品类型
     * @param goodsType
     * @throws Exception
     */
    String saveGoodsType(GoodsType goodsType) throws Exception;

    /**
     * 
     * @Title: deleteGoodsType
     * @Description: 删除一个商品类型
     * @param typeId
     * @throws Exception
     */
    void deleteGoodsType(String typeId) throws Exception;

    /**
     * 
     * @Title: updateGoodsType
     * @Description: 修改一个商品类型
     * @param goodsType
     * @throws Exception
     */
    String updateGoodsType(GoodsType goodsType) throws Exception;

    /**
     * 
     * @Title: getList
     * @Description: 从域对象中获取所有商品类型列表
     * @return
     * @throws Exception
     */
    List<GoodsType> getGoodsTypeList() throws Exception;

    /**
     * 
     * @Title: getList
     * @Description: 从数据库中获取所有商品类型列表
     * @return
     * @throws Exception
     */
    List<GoodsType> getList() throws Exception;

    /**
     * 
     * @Title: getByTypeName
     * @Description: 依据商品名称查询
     * @param typeName
     * @return
     * @throws Exception
     */
    GoodsType getByTypeName(String typeName) throws Exception;
}