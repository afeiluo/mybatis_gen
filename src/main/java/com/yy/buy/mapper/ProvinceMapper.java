package com.yy.buy.mapper;

import com.yy.buy.domain.Province;
import com.yy.buy.domain.ProvinceCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProvinceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table province
     *
     * @mbggenerated
     */
    int countByExample(ProvinceCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table province
     *
     * @mbggenerated
     */
    int deleteByExample(ProvinceCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table province
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer provinceId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table province
     *
     * @mbggenerated
     */
    int insertSelective(Province record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table province
     *
     * @mbggenerated
     */
    List<Province> selectByExample(ProvinceCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table province
     *
     * @mbggenerated
     */
    Province selectByPrimaryKey(Integer provinceId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table province
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Province record, @Param("example") ProvinceCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table province
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Province record);
}