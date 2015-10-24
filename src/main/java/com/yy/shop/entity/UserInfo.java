package com.yy.shop.entity;

public class UserInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column UserInfo.uid
     *
     * @mbggenerated
     */
    private Long uid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column UserInfo.secondTicket
     *
     * @mbggenerated
     */
    private Long secondTicket;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UserInfo.uid
     *
     * @return the value of UserInfo.uid
     *
     * @mbggenerated
     */
    public Long getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UserInfo.uid
     *
     * @param uid the value for UserInfo.uid
     *
     * @mbggenerated
     */
    public void setUid(Long uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UserInfo.secondTicket
     *
     * @return the value of UserInfo.secondTicket
     *
     * @mbggenerated
     */
    public Long getSecondTicket() {
        return secondTicket;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UserInfo.secondTicket
     *
     * @param secondTicket the value for UserInfo.secondTicket
     *
     * @mbggenerated
     */
    public void setSecondTicket(Long secondTicket) {
        this.secondTicket = secondTicket;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UserInfo
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
        UserInfo other = (UserInfo) that;
        return (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
            && (this.getSecondTicket() == null ? other.getSecondTicket() == null : this.getSecondTicket().equals(other.getSecondTicket()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UserInfo
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getSecondTicket() == null) ? 0 : getSecondTicket().hashCode());
        return result;
    }
}