package com.yy.baby.fighting.dao;

import com.yy.baby.fighting.entity.Msg0;
import com.yy.baby.fighting.entity.Msg0Criteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface Msg0Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_center_0
     *
     * @mbggenerated
     */
    int countByExample(Msg0Criteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_center_0
     *
     * @mbggenerated
     */
    int deleteByExample(Msg0Criteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_center_0
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_center_0
     *
     * @mbggenerated
     */
    int insert(Msg0 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_center_0
     *
     * @mbggenerated
     */
    int insertSelective(Msg0 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_center_0
     *
     * @mbggenerated
     */
    List<Msg0> selectByExample(Msg0Criteria example, RowBounds rowbounds);

    List<Msg0> selectByExampleWithBLOBs(Msg0Criteria example, RowBounds rowbounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_center_0
     *
     * @mbggenerated
     */
    List<Msg0> selectByExample(Msg0Criteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_center_0
     *
     * @mbggenerated
     */
    Msg0 selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_center_0
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Msg0 record, @Param("example") Msg0Criteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_center_0
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Msg0 record, @Param("example") Msg0Criteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_center_0
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Msg0 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_center_0
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Msg0 record);
}