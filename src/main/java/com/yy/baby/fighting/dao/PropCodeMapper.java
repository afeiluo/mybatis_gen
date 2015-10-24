package com.yy.baby.fighting.dao;

import com.yy.baby.fighting.entity.PropCode;
import com.yy.baby.fighting.entity.PropCodeCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PropCodeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prop_code
     *
     * @mbggenerated
     */
    int countByExample(PropCodeCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prop_code
     *
     * @mbggenerated
     */
    int deleteByExample(PropCodeCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prop_code
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prop_code
     *
     * @mbggenerated
     */
    int insert(PropCode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prop_code
     *
     * @mbggenerated
     */
    int insertSelective(PropCode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prop_code
     *
     * @mbggenerated
     */
    List<PropCode> selectByExample(PropCodeCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prop_code
     *
     * @mbggenerated
     */
    PropCode selectByPrimaryKey(String code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prop_code
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") PropCode record, @Param("example") PropCodeCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prop_code
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") PropCode record, @Param("example") PropCodeCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prop_code
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(PropCode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prop_code
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(PropCode record);
}