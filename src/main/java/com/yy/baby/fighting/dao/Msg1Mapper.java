package com.yy.baby.fighting.dao;

import com.yy.baby.fighting.entity.Msg1;
import com.yy.baby.fighting.entity.Msg1Criteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface Msg1Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_center_1
     *
     * @mbggenerated
     */
    int countByExample(Msg1Criteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_center_1
     *
     * @mbggenerated
     */
    int deleteByExample(Msg1Criteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_center_1
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_center_1
     *
     * @mbggenerated
     */
    int insert(Msg1 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_center_1
     *
     * @mbggenerated
     */
    int insertSelective(Msg1 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_center_1
     *
     * @mbggenerated
     */
    List<Msg1> selectByExample(Msg1Criteria example, RowBounds rowbounds);

    List<Msg1> selectByExampleWithBLOBs(Msg1Criteria example, RowBounds rowbounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_center_1
     *
     * @mbggenerated
     */
    List<Msg1> selectByExample(Msg1Criteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_center_1
     *
     * @mbggenerated
     */
    Msg1 selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_center_1
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Msg1 record, @Param("example") Msg1Criteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_center_1
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Msg1 record, @Param("example") Msg1Criteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_center_1
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Msg1 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_center_1
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Msg1 record);
}