package com.yy.userinfo.entity;

import java.util.Date;

public class GoodTopicHistory {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column good_topic_history.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column good_topic_history.topicId
     *
     * @mbggenerated
     */
    private Integer topicId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column good_topic_history.uid
     *
     * @mbggenerated
     */
    private Long uid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column good_topic_history.createTime
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column good_topic_history.appId
     *
     * @mbggenerated
     */
    private String appId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column good_topic_history.id
     *
     * @return the value of good_topic_history.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column good_topic_history.id
     *
     * @param id the value for good_topic_history.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column good_topic_history.topicId
     *
     * @return the value of good_topic_history.topicId
     *
     * @mbggenerated
     */
    public Integer getTopicId() {
        return topicId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column good_topic_history.topicId
     *
     * @param topicId the value for good_topic_history.topicId
     *
     * @mbggenerated
     */
    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column good_topic_history.uid
     *
     * @return the value of good_topic_history.uid
     *
     * @mbggenerated
     */
    public Long getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column good_topic_history.uid
     *
     * @param uid the value for good_topic_history.uid
     *
     * @mbggenerated
     */
    public void setUid(Long uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column good_topic_history.createTime
     *
     * @return the value of good_topic_history.createTime
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column good_topic_history.createTime
     *
     * @param createTime the value for good_topic_history.createTime
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column good_topic_history.appId
     *
     * @return the value of good_topic_history.appId
     *
     * @mbggenerated
     */
    public String getAppId() {
        return appId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column good_topic_history.appId
     *
     * @param appId the value for good_topic_history.appId
     *
     * @mbggenerated
     */
    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table good_topic_history
     *
     * @mbggenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        GoodTopicHistory other = (GoodTopicHistory) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTopicId() == null ? other.getTopicId() == null : this.getTopicId().equals(other.getTopicId()))
            && (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getAppId() == null ? other.getAppId() == null : this.getAppId().equals(other.getAppId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table good_topic_history
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTopicId() == null) ? 0 : getTopicId().hashCode());
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getAppId() == null) ? 0 : getAppId().hashCode());
        return result;
    }
}