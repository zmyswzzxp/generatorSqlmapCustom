package com.iot.demo.dao;

import com.iot.demo.bean.ProductInfo;
import com.iot.demo.bean.ProductInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductInfoMapper {
    int countByExample(ProductInfoExample example);

    int deleteByExample(ProductInfoExample example);

    int deleteByPrimaryKey(Integer productId);

    int insert(ProductInfo record);

    int insertSelective(ProductInfo record);

    List<ProductInfo> selectByExample(ProductInfoExample example);

    ProductInfo selectByPrimaryKey(Integer productId);

    int updateByExampleSelective(@Param("record") ProductInfo record, @Param("example") ProductInfoExample example);

    int updateByExample(@Param("record") ProductInfo record, @Param("example") ProductInfoExample example);

    int updateByPrimaryKeySelective(ProductInfo record);

    int updateByPrimaryKey(ProductInfo record);
}