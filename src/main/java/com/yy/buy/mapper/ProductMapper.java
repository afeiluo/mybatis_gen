package com.yy.buy.mapper;

import com.yy.buy.domain.Product;
import com.yy.buy.domain.ProductCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbggenerated
     */
    int countByExample(ProductCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbggenerated
     */
    int deleteByExample(ProductCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer productId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbggenerated
     */
    int insertSelective(Product record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbggenerated
     */
    List<Product> selectByExample(ProductCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbggenerated
     */
    Product selectByPrimaryKey(Integer productId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Product record, @Param("example") ProductCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Product record);
}