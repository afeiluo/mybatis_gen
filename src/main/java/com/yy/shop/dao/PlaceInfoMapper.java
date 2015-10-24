package com.yy.shop.dao;

import com.yy.shop.entity.PlaceInfo;
import com.yy.shop.entity.PlaceInfoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlaceInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PlaceInfo
     *
     * @mbggenerated
     */
    int countByExample(PlaceInfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PlaceInfo
     *
     * @mbggenerated
     */
    int deleteByExample(PlaceInfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PlaceInfo
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer placeInfoId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PlaceInfo
     *
     * @mbggenerated
     */
    int insert(PlaceInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PlaceInfo
     *
     * @mbggenerated
     */
    int insertSelective(PlaceInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PlaceInfo
     *
     * @mbggenerated
     */
    List<PlaceInfo> selectByExample(PlaceInfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PlaceInfo
     *
     * @mbggenerated
     */
    PlaceInfo selectByPrimaryKey(Integer placeInfoId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PlaceInfo
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") PlaceInfo record, @Param("example") PlaceInfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PlaceInfo
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") PlaceInfo record, @Param("example") PlaceInfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PlaceInfo
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(PlaceInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PlaceInfo
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(PlaceInfo record);
}