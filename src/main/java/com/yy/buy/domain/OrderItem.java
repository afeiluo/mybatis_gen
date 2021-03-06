package com.yy.buy.domain;

import java.util.Date;

public class OrderItem {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_item.orderId
     *
     * @mbggenerated
     */
    private Long orderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_item.totalOriginalPrice
     *
     * @mbggenerated
     */
    private Integer totalOriginalPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_item.totalDiscountPrice
     *
     * @mbggenerated
     */
    private Integer totalDiscountPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_item.detailList
     *
     * @mbggenerated
     */
    private String detailList;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_item.orderStatus
     *
     * @mbggenerated
     */
    private Integer orderStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_item.uid
     *
     * @mbggenerated
     */
    private Long uid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_item.createTime
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_item.updateTime
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_item.payTime
     *
     * @mbggenerated
     */
    private Date payTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_item.placeId
     *
     * @mbggenerated
     */
    private Integer placeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_item.place
     *
     * @mbggenerated
     */
    private String place;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_item.payUrl
     *
     * @mbggenerated
     */
    private String payUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_item.receiver
     *
     * @mbggenerated
     */
    private String receiver;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_item.invoiceType
     *
     * @mbggenerated
     */
    private Integer invoiceType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_item.invoiceTitle
     *
     * @mbggenerated
     */
    private String invoiceTitle;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_item.orderId
     *
     * @return the value of order_item.orderId
     *
     * @mbggenerated
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_item.orderId
     *
     * @param orderId the value for order_item.orderId
     *
     * @mbggenerated
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_item.totalOriginalPrice
     *
     * @return the value of order_item.totalOriginalPrice
     *
     * @mbggenerated
     */
    public Integer getTotalOriginalPrice() {
        return totalOriginalPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_item.totalOriginalPrice
     *
     * @param totalOriginalPrice the value for order_item.totalOriginalPrice
     *
     * @mbggenerated
     */
    public void setTotalOriginalPrice(Integer totalOriginalPrice) {
        this.totalOriginalPrice = totalOriginalPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_item.totalDiscountPrice
     *
     * @return the value of order_item.totalDiscountPrice
     *
     * @mbggenerated
     */
    public Integer getTotalDiscountPrice() {
        return totalDiscountPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_item.totalDiscountPrice
     *
     * @param totalDiscountPrice the value for order_item.totalDiscountPrice
     *
     * @mbggenerated
     */
    public void setTotalDiscountPrice(Integer totalDiscountPrice) {
        this.totalDiscountPrice = totalDiscountPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_item.detailList
     *
     * @return the value of order_item.detailList
     *
     * @mbggenerated
     */
    public String getDetailList() {
        return detailList;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_item.detailList
     *
     * @param detailList the value for order_item.detailList
     *
     * @mbggenerated
     */
    public void setDetailList(String detailList) {
        this.detailList = detailList == null ? null : detailList.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_item.orderStatus
     *
     * @return the value of order_item.orderStatus
     *
     * @mbggenerated
     */
    public Integer getOrderStatus() {
        return orderStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_item.orderStatus
     *
     * @param orderStatus the value for order_item.orderStatus
     *
     * @mbggenerated
     */
    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_item.uid
     *
     * @return the value of order_item.uid
     *
     * @mbggenerated
     */
    public Long getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_item.uid
     *
     * @param uid the value for order_item.uid
     *
     * @mbggenerated
     */
    public void setUid(Long uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_item.createTime
     *
     * @return the value of order_item.createTime
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_item.createTime
     *
     * @param createTime the value for order_item.createTime
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_item.updateTime
     *
     * @return the value of order_item.updateTime
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_item.updateTime
     *
     * @param updateTime the value for order_item.updateTime
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_item.payTime
     *
     * @return the value of order_item.payTime
     *
     * @mbggenerated
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_item.payTime
     *
     * @param payTime the value for order_item.payTime
     *
     * @mbggenerated
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_item.placeId
     *
     * @return the value of order_item.placeId
     *
     * @mbggenerated
     */
    public Integer getPlaceId() {
        return placeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_item.placeId
     *
     * @param placeId the value for order_item.placeId
     *
     * @mbggenerated
     */
    public void setPlaceId(Integer placeId) {
        this.placeId = placeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_item.place
     *
     * @return the value of order_item.place
     *
     * @mbggenerated
     */
    public String getPlace() {
        return place;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_item.place
     *
     * @param place the value for order_item.place
     *
     * @mbggenerated
     */
    public void setPlace(String place) {
        this.place = place == null ? null : place.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_item.payUrl
     *
     * @return the value of order_item.payUrl
     *
     * @mbggenerated
     */
    public String getPayUrl() {
        return payUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_item.payUrl
     *
     * @param payUrl the value for order_item.payUrl
     *
     * @mbggenerated
     */
    public void setPayUrl(String payUrl) {
        this.payUrl = payUrl == null ? null : payUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_item.receiver
     *
     * @return the value of order_item.receiver
     *
     * @mbggenerated
     */
    public String getReceiver() {
        return receiver;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_item.receiver
     *
     * @param receiver the value for order_item.receiver
     *
     * @mbggenerated
     */
    public void setReceiver(String receiver) {
        this.receiver = receiver == null ? null : receiver.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_item.invoiceType
     *
     * @return the value of order_item.invoiceType
     *
     * @mbggenerated
     */
    public Integer getInvoiceType() {
        return invoiceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_item.invoiceType
     *
     * @param invoiceType the value for order_item.invoiceType
     *
     * @mbggenerated
     */
    public void setInvoiceType(Integer invoiceType) {
        this.invoiceType = invoiceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_item.invoiceTitle
     *
     * @return the value of order_item.invoiceTitle
     *
     * @mbggenerated
     */
    public String getInvoiceTitle() {
        return invoiceTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_item.invoiceTitle
     *
     * @param invoiceTitle the value for order_item.invoiceTitle
     *
     * @mbggenerated
     */
    public void setInvoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle == null ? null : invoiceTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_item
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
        OrderItem other = (OrderItem) that;
        return (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getTotalOriginalPrice() == null ? other.getTotalOriginalPrice() == null : this.getTotalOriginalPrice().equals(other.getTotalOriginalPrice()))
            && (this.getTotalDiscountPrice() == null ? other.getTotalDiscountPrice() == null : this.getTotalDiscountPrice().equals(other.getTotalDiscountPrice()))
            && (this.getDetailList() == null ? other.getDetailList() == null : this.getDetailList().equals(other.getDetailList()))
            && (this.getOrderStatus() == null ? other.getOrderStatus() == null : this.getOrderStatus().equals(other.getOrderStatus()))
            && (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getPayTime() == null ? other.getPayTime() == null : this.getPayTime().equals(other.getPayTime()))
            && (this.getPlaceId() == null ? other.getPlaceId() == null : this.getPlaceId().equals(other.getPlaceId()))
            && (this.getPlace() == null ? other.getPlace() == null : this.getPlace().equals(other.getPlace()))
            && (this.getPayUrl() == null ? other.getPayUrl() == null : this.getPayUrl().equals(other.getPayUrl()))
            && (this.getReceiver() == null ? other.getReceiver() == null : this.getReceiver().equals(other.getReceiver()))
            && (this.getInvoiceType() == null ? other.getInvoiceType() == null : this.getInvoiceType().equals(other.getInvoiceType()))
            && (this.getInvoiceTitle() == null ? other.getInvoiceTitle() == null : this.getInvoiceTitle().equals(other.getInvoiceTitle()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_item
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getTotalOriginalPrice() == null) ? 0 : getTotalOriginalPrice().hashCode());
        result = prime * result + ((getTotalDiscountPrice() == null) ? 0 : getTotalDiscountPrice().hashCode());
        result = prime * result + ((getDetailList() == null) ? 0 : getDetailList().hashCode());
        result = prime * result + ((getOrderStatus() == null) ? 0 : getOrderStatus().hashCode());
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getPayTime() == null) ? 0 : getPayTime().hashCode());
        result = prime * result + ((getPlaceId() == null) ? 0 : getPlaceId().hashCode());
        result = prime * result + ((getPlace() == null) ? 0 : getPlace().hashCode());
        result = prime * result + ((getPayUrl() == null) ? 0 : getPayUrl().hashCode());
        result = prime * result + ((getReceiver() == null) ? 0 : getReceiver().hashCode());
        result = prime * result + ((getInvoiceType() == null) ? 0 : getInvoiceType().hashCode());
        result = prime * result + ((getInvoiceTitle() == null) ? 0 : getInvoiceTitle().hashCode());
        return result;
    }
}