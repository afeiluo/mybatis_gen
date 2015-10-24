package com.yy.gameshop.dao;

import com.yy.gameshop.entity.SpecGame;
import com.yy.gameshop.entity.SpecGameCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpecGameMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SpecGame
     *
     * @mbggenerated
     */
    int countByExample(SpecGameCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SpecGame
     *
     * @mbggenerated
     */
    int deleteByExample(SpecGameCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SpecGame
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SpecGame
     *
     * @mbggenerated
     */
    int insert(SpecGame record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SpecGame
     *
     * @mbggenerated
     */
    int insertSelective(SpecGame record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SpecGame
     *
     * @mbggenerated
     */
    List<SpecGame> selectByExample(SpecGameCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SpecGame
     *
     * @mbggenerated
     */
    SpecGame selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SpecGame
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") SpecGame record, @Param("example") SpecGameCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SpecGame
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") SpecGame record, @Param("example") SpecGameCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SpecGame
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SpecGame record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SpecGame
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SpecGame record);
}