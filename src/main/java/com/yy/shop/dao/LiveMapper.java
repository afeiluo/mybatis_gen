package com.yy.shop.dao;

import com.yy.shop.entity.Live;
import com.yy.shop.entity.LiveCriteria;
import com.yy.shop.entity.LiveKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LiveMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live
     *
     * @mbggenerated
     */
    int countByExample(LiveCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live
     *
     * @mbggenerated
     */
    int deleteByExample(LiveCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(LiveKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live
     *
     * @mbggenerated
     */
    int insert(Live record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live
     *
     * @mbggenerated
     */
    int insertSelective(Live record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live
     *
     * @mbggenerated
     */
    List<Live> selectByExample(LiveCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live
     *
     * @mbggenerated
     */
    Live selectByPrimaryKey(LiveKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Live record, @Param("example") LiveCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Live record, @Param("example") LiveCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Live record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Live record);
}