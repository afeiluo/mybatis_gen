package com.yy.baby.fighting.dao;

import com.yy.baby.fighting.entity.Msg6;
import com.yy.baby.fighting.entity.Msg6Criteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface Msg6Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_center_6
     *
     * @mbggenerated
     */
    int countByExample(Msg6Criteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_center_6
     *
     * @mbggenerated
     */
    int deleteByExample(Msg6Criteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_center_6
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_center_6
     *
     * @mbggenerated
     */
    int insert(Msg6 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_center_6
     *
     * @mbggenerated
     */
    int insertSelective(Msg6 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_center_6
     *
     * @mbggenerated
     */
    List<Msg6> selectByExample(Msg6Criteria example, RowBounds rowbounds);

    List<Msg6> selectByExampleWithBLOBs(Msg6Criteria example, RowBounds rowbounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_center_6
     *
     * @mbggenerated
     */
    List<Msg6> selectByExample(Msg6Criteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_center_6
     *
     * @mbggenerated
     */
    Msg6 selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_center_6
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Msg6 record, @Param("example") Msg6Criteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_center_6
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Msg6 record, @Param("example") Msg6Criteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_center_6
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Msg6 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_center_6
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Msg6 record);
}