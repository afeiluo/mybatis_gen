package com.yy.yhby.entity;

public class GameLogin {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_storm_basic_yygamelogindo_uid.uid
     *
     * @mbggenerated
     */
    private Integer uid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_storm_basic_yygamelogindo_uid.time
     *
     * @mbggenerated
     */
    private String time;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_storm_basic_yygamelogindo_uid.kpi
     *
     * @mbggenerated
     */
    private Integer kpi;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_storm_basic_yygamelogindo_uid.uid
     *
     * @return the value of m_storm_basic_yygamelogindo_uid.uid
     *
     * @mbggenerated
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_storm_basic_yygamelogindo_uid.uid
     *
     * @param uid the value for m_storm_basic_yygamelogindo_uid.uid
     *
     * @mbggenerated
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_storm_basic_yygamelogindo_uid.time
     *
     * @return the value of m_storm_basic_yygamelogindo_uid.time
     *
     * @mbggenerated
     */
    public String getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_storm_basic_yygamelogindo_uid.time
     *
     * @param time the value for m_storm_basic_yygamelogindo_uid.time
     *
     * @mbggenerated
     */
    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_storm_basic_yygamelogindo_uid.kpi
     *
     * @return the value of m_storm_basic_yygamelogindo_uid.kpi
     *
     * @mbggenerated
     */
    public Integer getKpi() {
        return kpi;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_storm_basic_yygamelogindo_uid.kpi
     *
     * @param kpi the value for m_storm_basic_yygamelogindo_uid.kpi
     *
     * @mbggenerated
     */
    public void setKpi(Integer kpi) {
        this.kpi = kpi;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_storm_basic_yygamelogindo_uid
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
        GameLogin other = (GameLogin) that;
        return (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
            && (this.getTime() == null ? other.getTime() == null : this.getTime().equals(other.getTime()))
            && (this.getKpi() == null ? other.getKpi() == null : this.getKpi().equals(other.getKpi()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_storm_basic_yygamelogindo_uid
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getTime() == null) ? 0 : getTime().hashCode());
        result = prime * result + ((getKpi() == null) ? 0 : getKpi().hashCode());
        return result;
    }
}