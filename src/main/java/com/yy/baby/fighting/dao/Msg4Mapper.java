package com.yy.baby.fighting.dao;

import com.yy.baby.fighting.entity.Msg4;
import com.yy.baby.fighting.entity.Msg4Criteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface Msg4Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_center_4
     *
     * @mbggenerated
     */
    int countByExample(Msg4Criteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_center_4
     *
     * @mbggenerated
     */
    int deleteByExample(Msg4Criteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_center_4
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_center_4
     *
     * @mbggenerated
     */
    int insert(Msg4 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_center_4
     *
     * @mbggenerated
     */
    int insertSelective(Msg4 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_center_4
     *
     * @mbggenerated
     */
    List<Msg4> selectByExample(Msg4Criteria example, RowBounds rowbounds);

    List<Msg4> selectByExampleWithBLOBs(Msg4Criteria example, RowBounds rowbounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_center_4
     *
     * @mbggenerated
     */
    List<Msg4> selectByExample(Msg4Criteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_center_4
     *
     * @mbggenerated
     */
    Msg4 selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_center_4
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Msg4 record, @Param("example") Msg4Criteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_center_4
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Msg4 record, @Param("example") Msg4Criteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_center_4
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Msg4 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_center_4
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Msg4 record);
}