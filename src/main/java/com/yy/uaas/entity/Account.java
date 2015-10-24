package com.yy.uaas.entity;

import java.util.Date;

public class Account {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.uuid
     *
     * @mbggenerated
     */
    private String uuid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.mobile
     *
     * @mbggenerated
     */
    private String mobile;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.email
     *
     * @mbggenerated
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.login_name
     *
     * @mbggenerated
     */
    private String login_name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.password
     *
     * @mbggenerated
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.country_code
     *
     * @mbggenerated
     */
    private String country_code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.appId
     *
     * @mbggenerated
     */
    private String appId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.imsi
     *
     * @mbggenerated
     */
    private String imsi;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.imei
     *
     * @mbggenerated
     */
    private String imei;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.dev_type
     *
     * @mbggenerated
     */
    private Integer dev_type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.dev_id
     *
     * @mbggenerated
     */
    private String dev_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.enabled
     *
     * @mbggenerated
     */
    private Integer enabled;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.create_date
     *
     * @mbggenerated
     */
    private Date create_date;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.reg_id
     *
     * @mbggenerated
     */
    private String reg_id;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.id
     *
     * @return the value of account.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.id
     *
     * @param id the value for account.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.uuid
     *
     * @return the value of account.uuid
     *
     * @mbggenerated
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.uuid
     *
     * @param uuid the value for account.uuid
     *
     * @mbggenerated
     */
    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.mobile
     *
     * @return the value of account.mobile
     *
     * @mbggenerated
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.mobile
     *
     * @param mobile the value for account.mobile
     *
     * @mbggenerated
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.email
     *
     * @return the value of account.email
     *
     * @mbggenerated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.email
     *
     * @param email the value for account.email
     *
     * @mbggenerated
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.login_name
     *
     * @return the value of account.login_name
     *
     * @mbggenerated
     */
    public String getLogin_name() {
        return login_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.login_name
     *
     * @param login_name the value for account.login_name
     *
     * @mbggenerated
     */
    public void setLogin_name(String login_name) {
        this.login_name = login_name == null ? null : login_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.password
     *
     * @return the value of account.password
     *
     * @mbggenerated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.password
     *
     * @param password the value for account.password
     *
     * @mbggenerated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.country_code
     *
     * @return the value of account.country_code
     *
     * @mbggenerated
     */
    public String getCountry_code() {
        return country_code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.country_code
     *
     * @param country_code the value for account.country_code
     *
     * @mbggenerated
     */
    public void setCountry_code(String country_code) {
        this.country_code = country_code == null ? null : country_code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.appId
     *
     * @return the value of account.appId
     *
     * @mbggenerated
     */
    public String getAppId() {
        return appId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.appId
     *
     * @param appId the value for account.appId
     *
     * @mbggenerated
     */
    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.imsi
     *
     * @return the value of account.imsi
     *
     * @mbggenerated
     */
    public String getImsi() {
        return imsi;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.imsi
     *
     * @param imsi the value for account.imsi
     *
     * @mbggenerated
     */
    public void setImsi(String imsi) {
        this.imsi = imsi == null ? null : imsi.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.imei
     *
     * @return the value of account.imei
     *
     * @mbggenerated
     */
    public String getImei() {
        return imei;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.imei
     *
     * @param imei the value for account.imei
     *
     * @mbggenerated
     */
    public void setImei(String imei) {
        this.imei = imei == null ? null : imei.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.dev_type
     *
     * @return the value of account.dev_type
     *
     * @mbggenerated
     */
    public Integer getDev_type() {
        return dev_type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.dev_type
     *
     * @param dev_type the value for account.dev_type
     *
     * @mbggenerated
     */
    public void setDev_type(Integer dev_type) {
        this.dev_type = dev_type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.dev_id
     *
     * @return the value of account.dev_id
     *
     * @mbggenerated
     */
    public String getDev_id() {
        return dev_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.dev_id
     *
     * @param dev_id the value for account.dev_id
     *
     * @mbggenerated
     */
    public void setDev_id(String dev_id) {
        this.dev_id = dev_id == null ? null : dev_id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.enabled
     *
     * @return the value of account.enabled
     *
     * @mbggenerated
     */
    public Integer getEnabled() {
        return enabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.enabled
     *
     * @param enabled the value for account.enabled
     *
     * @mbggenerated
     */
    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.create_date
     *
     * @return the value of account.create_date
     *
     * @mbggenerated
     */
    public Date getCreate_date() {
        return create_date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.create_date
     *
     * @param create_date the value for account.create_date
     *
     * @mbggenerated
     */
    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.reg_id
     *
     * @return the value of account.reg_id
     *
     * @mbggenerated
     */
    public String getReg_id() {
        return reg_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.reg_id
     *
     * @param reg_id the value for account.reg_id
     *
     * @mbggenerated
     */
    public void setReg_id(String reg_id) {
        this.reg_id = reg_id == null ? null : reg_id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account
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
        Account other = (Account) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUuid() == null ? other.getUuid() == null : this.getUuid().equals(other.getUuid()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getLogin_name() == null ? other.getLogin_name() == null : this.getLogin_name().equals(other.getLogin_name()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getCountry_code() == null ? other.getCountry_code() == null : this.getCountry_code().equals(other.getCountry_code()))
            && (this.getAppId() == null ? other.getAppId() == null : this.getAppId().equals(other.getAppId()))
            && (this.getImsi() == null ? other.getImsi() == null : this.getImsi().equals(other.getImsi()))
            && (this.getImei() == null ? other.getImei() == null : this.getImei().equals(other.getImei()))
            && (this.getDev_type() == null ? other.getDev_type() == null : this.getDev_type().equals(other.getDev_type()))
            && (this.getDev_id() == null ? other.getDev_id() == null : this.getDev_id().equals(other.getDev_id()))
            && (this.getEnabled() == null ? other.getEnabled() == null : this.getEnabled().equals(other.getEnabled()))
            && (this.getCreate_date() == null ? other.getCreate_date() == null : this.getCreate_date().equals(other.getCreate_date()))
            && (this.getReg_id() == null ? other.getReg_id() == null : this.getReg_id().equals(other.getReg_id()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUuid() == null) ? 0 : getUuid().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getLogin_name() == null) ? 0 : getLogin_name().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getCountry_code() == null) ? 0 : getCountry_code().hashCode());
        result = prime * result + ((getAppId() == null) ? 0 : getAppId().hashCode());
        result = prime * result + ((getImsi() == null) ? 0 : getImsi().hashCode());
        result = prime * result + ((getImei() == null) ? 0 : getImei().hashCode());
        result = prime * result + ((getDev_type() == null) ? 0 : getDev_type().hashCode());
        result = prime * result + ((getDev_id() == null) ? 0 : getDev_id().hashCode());
        result = prime * result + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        result = prime * result + ((getCreate_date() == null) ? 0 : getCreate_date().hashCode());
        result = prime * result + ((getReg_id() == null) ? 0 : getReg_id().hashCode());
        return result;
    }
}