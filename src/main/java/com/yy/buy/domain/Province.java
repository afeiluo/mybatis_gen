package com.yy.buy.domain;

public class Province {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column province.provinceId
     *
     * @mbggenerated
     */
    private Integer provinceId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column province.provinceName
     *
     * @mbggenerated
     */
    private String provinceName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column province.provinceId
     *
     * @return the value of province.provinceId
     *
     * @mbggenerated
     */
    public Integer getProvinceId() {
        return provinceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column province.provinceId
     *
     * @param provinceId the value for province.provinceId
     *
     * @mbggenerated
     */
    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column province.provinceName
     *
     * @return the value of province.provinceName
     *
     * @mbggenerated
     */
    public String getProvinceName() {
        return provinceName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column province.provinceName
     *
     * @param provinceName the value for province.provinceName
     *
     * @mbggenerated
     */
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName == null ? null : provinceName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table province
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
        Province other = (Province) that;
        return (this.getProvinceId() == null ? other.getProvinceId() == null : this.getProvinceId().equals(other.getProvinceId()))
            && (this.getProvinceName() == null ? other.getProvinceName() == null : this.getProvinceName().equals(other.getProvinceName()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table province
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProvinceId() == null) ? 0 : getProvinceId().hashCode());
        result = prime * result + ((getProvinceName() == null) ? 0 : getProvinceName().hashCode());
        return result;
    }
}