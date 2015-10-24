package com.yy.shop.entity;

public class City {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column City.cityId
     *
     * @mbggenerated
     */
    private Integer cityId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column City.cityCode
     *
     * @mbggenerated
     */
    private String cityCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column City.cityName
     *
     * @mbggenerated
     */
    private String cityName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column City.provinceId
     *
     * @mbggenerated
     */
    private Integer provinceId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column City.cityId
     *
     * @return the value of City.cityId
     *
     * @mbggenerated
     */
    public Integer getCityId() {
        return cityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column City.cityId
     *
     * @param cityId the value for City.cityId
     *
     * @mbggenerated
     */
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column City.cityCode
     *
     * @return the value of City.cityCode
     *
     * @mbggenerated
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column City.cityCode
     *
     * @param cityCode the value for City.cityCode
     *
     * @mbggenerated
     */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column City.cityName
     *
     * @return the value of City.cityName
     *
     * @mbggenerated
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column City.cityName
     *
     * @param cityName the value for City.cityName
     *
     * @mbggenerated
     */
    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column City.provinceId
     *
     * @return the value of City.provinceId
     *
     * @mbggenerated
     */
    public Integer getProvinceId() {
        return provinceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column City.provinceId
     *
     * @param provinceId the value for City.provinceId
     *
     * @mbggenerated
     */
    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table City
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
        City other = (City) that;
        return (this.getCityId() == null ? other.getCityId() == null : this.getCityId().equals(other.getCityId()))
            && (this.getCityCode() == null ? other.getCityCode() == null : this.getCityCode().equals(other.getCityCode()))
            && (this.getCityName() == null ? other.getCityName() == null : this.getCityName().equals(other.getCityName()))
            && (this.getProvinceId() == null ? other.getProvinceId() == null : this.getProvinceId().equals(other.getProvinceId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table City
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCityId() == null) ? 0 : getCityId().hashCode());
        result = prime * result + ((getCityCode() == null) ? 0 : getCityCode().hashCode());
        result = prime * result + ((getCityName() == null) ? 0 : getCityName().hashCode());
        result = prime * result + ((getProvinceId() == null) ? 0 : getProvinceId().hashCode());
        return result;
    }
}