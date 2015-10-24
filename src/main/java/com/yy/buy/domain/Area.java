package com.yy.buy.domain;

public class Area {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column area.areaId
     *
     * @mbggenerated
     */
    private Integer areaId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column area.areaName
     *
     * @mbggenerated
     */
    private String areaName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column area.cityId
     *
     * @mbggenerated
     */
    private Integer cityId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column area.areaId
     *
     * @return the value of area.areaId
     *
     * @mbggenerated
     */
    public Integer getAreaId() {
        return areaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column area.areaId
     *
     * @param areaId the value for area.areaId
     *
     * @mbggenerated
     */
    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column area.areaName
     *
     * @return the value of area.areaName
     *
     * @mbggenerated
     */
    public String getAreaName() {
        return areaName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column area.areaName
     *
     * @param areaName the value for area.areaName
     *
     * @mbggenerated
     */
    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column area.cityId
     *
     * @return the value of area.cityId
     *
     * @mbggenerated
     */
    public Integer getCityId() {
        return cityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column area.cityId
     *
     * @param cityId the value for area.cityId
     *
     * @mbggenerated
     */
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area
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
        Area other = (Area) that;
        return (this.getAreaId() == null ? other.getAreaId() == null : this.getAreaId().equals(other.getAreaId()))
            && (this.getAreaName() == null ? other.getAreaName() == null : this.getAreaName().equals(other.getAreaName()))
            && (this.getCityId() == null ? other.getCityId() == null : this.getCityId().equals(other.getCityId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAreaId() == null) ? 0 : getAreaId().hashCode());
        result = prime * result + ((getAreaName() == null) ? 0 : getAreaName().hashCode());
        result = prime * result + ((getCityId() == null) ? 0 : getCityId().hashCode());
        return result;
    }
}