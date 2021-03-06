package com.yy.baby.fighting.dao;

import com.yy.baby.fighting.entity.Msg2;
import com.yy.baby.fighting.entity.Msg2Criteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface Msg2Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_center_2
     *
     * @mbggenerated
     */
    int countByExample(Msg2Criteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_center_2
     *
     * @mbggenerated
     */
    int deleteByExample(Msg2Criteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_center_2
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_center_2
     *
     * @mbggenerated
     */
    int insert(Msg2 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_center_2
     *
     * @mbggenerated
     */
    int insertSelective(Msg2 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_center_2
     *
     * @mbggenerated
     */
    List<Msg2> selectByExample(Msg2Criteria example, RowBounds rowbounds);

    List<Msg2> selectByExampleWithBLOBs(Msg2Criteria example, RowBounds rowbounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_center_2
     *
     * @mbggenerated
     */
    List<Msg2> selectByExample(Msg2Criteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_center_2
     *
     * @mbggenerated
     */
    Msg2 selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_center_2
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Msg2 record, @Param("example") Msg2Criteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_center_2
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Msg2 record, @Param("example") Msg2Criteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_center_2
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Msg2 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_center_2
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Msg2 record);
}