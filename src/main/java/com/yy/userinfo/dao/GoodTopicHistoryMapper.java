package com.yy.userinfo.dao;

import com.yy.userinfo.entity.GoodTopicHistory;
import com.yy.userinfo.entity.GoodTopicHistoryCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodTopicHistoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table good_topic_history
     *
     * @mbggenerated
     */
    int countByExample(GoodTopicHistoryCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table good_topic_history
     *
     * @mbggenerated
     */
    int deleteByExample(GoodTopicHistoryCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table good_topic_history
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table good_topic_history
     *
     * @mbggenerated
     */
    int insert(GoodTopicHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table good_topic_history
     *
     * @mbggenerated
     */
    int insertSelective(GoodTopicHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table good_topic_history
     *
     * @mbggenerated
     */
    List<GoodTopicHistory> selectByExample(GoodTopicHistoryCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table good_topic_history
     *
     * @mbggenerated
     */
    GoodTopicHistory selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table good_topic_history
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") GoodTopicHistory record, @Param("example") GoodTopicHistoryCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table good_topic_history
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") GoodTopicHistory record, @Param("example") GoodTopicHistoryCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table good_topic_history
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(GoodTopicHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table good_topic_history
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(GoodTopicHistory record);
}