package com.yy.shop.entity;

public class LiveKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live.live_uid
     *
     * @mbggenerated
     */
    private Long live_uid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live.sid
     *
     * @mbggenerated
     */
    private Long sid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live.ssid
     *
     * @mbggenerated
     */
    private Long ssid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live.live_uid
     *
     * @return the value of live.live_uid
     *
     * @mbggenerated
     */
    public Long getLive_uid() {
        return live_uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live.live_uid
     *
     * @param live_uid the value for live.live_uid
     *
     * @mbggenerated
     */
    public void setLive_uid(Long live_uid) {
        this.live_uid = live_uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live.sid
     *
     * @return the value of live.sid
     *
     * @mbggenerated
     */
    public Long getSid() {
        return sid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live.sid
     *
     * @param sid the value for live.sid
     *
     * @mbggenerated
     */
    public void setSid(Long sid) {
        this.sid = sid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live.ssid
     *
     * @return the value of live.ssid
     *
     * @mbggenerated
     */
    public Long getSsid() {
        return ssid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live.ssid
     *
     * @param ssid the value for live.ssid
     *
     * @mbggenerated
     */
    public void setSsid(Long ssid) {
        this.ssid = ssid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live
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
        LiveKey other = (LiveKey) that;
        return (this.getLive_uid() == null ? other.getLive_uid() == null : this.getLive_uid().equals(other.getLive_uid()))
            && (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getSsid() == null ? other.getSsid() == null : this.getSsid().equals(other.getSsid()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLive_uid() == null) ? 0 : getLive_uid().hashCode());
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getSsid() == null) ? 0 : getSsid().hashCode());
        return result;
    }
}