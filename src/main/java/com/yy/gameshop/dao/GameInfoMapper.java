package com.yy.gameshop.dao;

import com.yy.gameshop.entity.GameInfo;
import com.yy.gameshop.entity.GameInfoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GameInfo
     *
     * @mbggenerated
     */
    int countByExample(GameInfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GameInfo
     *
     * @mbggenerated
     */
    int deleteByExample(GameInfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GameInfo
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GameInfo
     *
     * @mbggenerated
     */
    int insert(GameInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GameInfo
     *
     * @mbggenerated
     */
    int insertSelective(GameInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GameInfo
     *
     * @mbggenerated
     */
    List<GameInfo> selectByExample(GameInfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GameInfo
     *
     * @mbggenerated
     */
    GameInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GameInfo
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") GameInfo record, @Param("example") GameInfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GameInfo
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") GameInfo record, @Param("example") GameInfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GameInfo
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(GameInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GameInfo
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(GameInfo record);
}