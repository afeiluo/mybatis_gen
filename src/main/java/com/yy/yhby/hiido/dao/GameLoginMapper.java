package com.yy.yhby.hiido.dao;

import com.yy.yhby.entity.GameLogin;
import com.yy.yhby.entity.GameLoginCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameLoginMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_storm_basic_yygamelogindo_uid
     *
     * @mbggenerated
     */
    int countByExample(GameLoginCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_storm_basic_yygamelogindo_uid
     *
     * @mbggenerated
     */
    int deleteByExample(GameLoginCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_storm_basic_yygamelogindo_uid
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer uid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_storm_basic_yygamelogindo_uid
     *
     * @mbggenerated
     */
    int insert(GameLogin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_storm_basic_yygamelogindo_uid
     *
     * @mbggenerated
     */
    int insertSelective(GameLogin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_storm_basic_yygamelogindo_uid
     *
     * @mbggenerated
     */
    List<GameLogin> selectByExample(GameLoginCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_storm_basic_yygamelogindo_uid
     *
     * @mbggenerated
     */
    GameLogin selectByPrimaryKey(Integer uid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_storm_basic_yygamelogindo_uid
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") GameLogin record, @Param("example") GameLoginCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_storm_basic_yygamelogindo_uid
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") GameLogin record, @Param("example") GameLoginCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_storm_basic_yygamelogindo_uid
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(GameLogin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_storm_basic_yygamelogindo_uid
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(GameLogin record);
}