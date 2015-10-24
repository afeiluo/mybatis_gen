package com.yy.buy.mapper;

import com.yy.buy.domain.Area;
import com.yy.buy.domain.AreaCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AreaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area
     *
     * @mbggenerated
     */
    int countByExample(AreaCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area
     *
     * @mbggenerated
     */
    int deleteByExample(AreaCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer areaId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area
     *
     * @mbggenerated
     */
    int insertSelective(Area record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area
     *
     * @mbggenerated
     */
    List<Area> selectByExample(AreaCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area
     *
     * @mbggenerated
     */
    Area selectByPrimaryKey(Integer areaId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Area record, @Param("example") AreaCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Area record);
}