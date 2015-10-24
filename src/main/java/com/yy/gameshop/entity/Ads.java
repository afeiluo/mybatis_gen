package com.yy.gameshop.entity;

public class Ads {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Ads.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Ads.des
     *
     * @mbggenerated
     */
    private String des;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Ads.link
     *
     * @mbggenerated
     */
    private String link;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Ads.seq
     *
     * @mbggenerated
     */
    private Integer seq;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Ads.id
     *
     * @return the value of Ads.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Ads.id
     *
     * @param id the value for Ads.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Ads.des
     *
     * @return the value of Ads.des
     *
     * @mbggenerated
     */
    public String getDes() {
        return des;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Ads.des
     *
     * @param des the value for Ads.des
     *
     * @mbggenerated
     */
    public void setDes(String des) {
        this.des = des == null ? null : des.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Ads.link
     *
     * @return the value of Ads.link
     *
     * @mbggenerated
     */
    public String getLink() {
        return link;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Ads.link
     *
     * @param link the value for Ads.link
     *
     * @mbggenerated
     */
    public void setLink(String link) {
        this.link = link == null ? null : link.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Ads.seq
     *
     * @return the value of Ads.seq
     *
     * @mbggenerated
     */
    public Integer getSeq() {
        return seq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Ads.seq
     *
     * @param seq the value for Ads.seq
     *
     * @mbggenerated
     */
    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Ads
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
        Ads other = (Ads) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDes() == null ? other.getDes() == null : this.getDes().equals(other.getDes()))
            && (this.getLink() == null ? other.getLink() == null : this.getLink().equals(other.getLink()))
            && (this.getSeq() == null ? other.getSeq() == null : this.getSeq().equals(other.getSeq()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Ads
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDes() == null) ? 0 : getDes().hashCode());
        result = prime * result + ((getLink() == null) ? 0 : getLink().hashCode());
        result = prime * result + ((getSeq() == null) ? 0 : getSeq().hashCode());
        return result;
    }
}