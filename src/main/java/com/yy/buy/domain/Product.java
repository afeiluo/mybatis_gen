package com.yy.buy.domain;

import java.util.Date;

public class Product {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.productId
     *
     * @mbggenerated
     */
    private Integer productId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.productName
     *
     * @mbggenerated
     */
    private String productName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.productDescription
     *
     * @mbggenerated
     */
    private String productDescription;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.imageList
     *
     * @mbggenerated
     */
    private String imageList;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.store
     *
     * @mbggenerated
     */
    private Integer store;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.originalPrice
     *
     * @mbggenerated
     */
    private Integer originalPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.discountPrice
     *
     * @mbggenerated
     */
    private Integer discountPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.createTime
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.status
     *
     * @mbggenerated
     */
    private Integer status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.productId
     *
     * @return the value of product.productId
     *
     * @mbggenerated
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.productId
     *
     * @param productId the value for product.productId
     *
     * @mbggenerated
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.productName
     *
     * @return the value of product.productName
     *
     * @mbggenerated
     */
    public String getProductName() {
        return productName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.productName
     *
     * @param productName the value for product.productName
     *
     * @mbggenerated
     */
    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.productDescription
     *
     * @return the value of product.productDescription
     *
     * @mbggenerated
     */
    public String getProductDescription() {
        return productDescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.productDescription
     *
     * @param productDescription the value for product.productDescription
     *
     * @mbggenerated
     */
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription == null ? null : productDescription.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.imageList
     *
     * @return the value of product.imageList
     *
     * @mbggenerated
     */
    public String getImageList() {
        return imageList;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.imageList
     *
     * @param imageList the value for product.imageList
     *
     * @mbggenerated
     */
    public void setImageList(String imageList) {
        this.imageList = imageList == null ? null : imageList.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.store
     *
     * @return the value of product.store
     *
     * @mbggenerated
     */
    public Integer getStore() {
        return store;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.store
     *
     * @param store the value for product.store
     *
     * @mbggenerated
     */
    public void setStore(Integer store) {
        this.store = store;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.originalPrice
     *
     * @return the value of product.originalPrice
     *
     * @mbggenerated
     */
    public Integer getOriginalPrice() {
        return originalPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.originalPrice
     *
     * @param originalPrice the value for product.originalPrice
     *
     * @mbggenerated
     */
    public void setOriginalPrice(Integer originalPrice) {
        this.originalPrice = originalPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.discountPrice
     *
     * @return the value of product.discountPrice
     *
     * @mbggenerated
     */
    public Integer getDiscountPrice() {
        return discountPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.discountPrice
     *
     * @param discountPrice the value for product.discountPrice
     *
     * @mbggenerated
     */
    public void setDiscountPrice(Integer discountPrice) {
        this.discountPrice = discountPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.createTime
     *
     * @return the value of product.createTime
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.createTime
     *
     * @param createTime the value for product.createTime
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.status
     *
     * @return the value of product.status
     *
     * @mbggenerated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.status
     *
     * @param status the value for product.status
     *
     * @mbggenerated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
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
        Product other = (Product) that;
        return (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()))
            && (this.getProductName() == null ? other.getProductName() == null : this.getProductName().equals(other.getProductName()))
            && (this.getProductDescription() == null ? other.getProductDescription() == null : this.getProductDescription().equals(other.getProductDescription()))
            && (this.getImageList() == null ? other.getImageList() == null : this.getImageList().equals(other.getImageList()))
            && (this.getStore() == null ? other.getStore() == null : this.getStore().equals(other.getStore()))
            && (this.getOriginalPrice() == null ? other.getOriginalPrice() == null : this.getOriginalPrice().equals(other.getOriginalPrice()))
            && (this.getDiscountPrice() == null ? other.getDiscountPrice() == null : this.getDiscountPrice().equals(other.getDiscountPrice()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
        result = prime * result + ((getProductName() == null) ? 0 : getProductName().hashCode());
        result = prime * result + ((getProductDescription() == null) ? 0 : getProductDescription().hashCode());
        result = prime * result + ((getImageList() == null) ? 0 : getImageList().hashCode());
        result = prime * result + ((getStore() == null) ? 0 : getStore().hashCode());
        result = prime * result + ((getOriginalPrice() == null) ? 0 : getOriginalPrice().hashCode());
        result = prime * result + ((getDiscountPrice() == null) ? 0 : getDiscountPrice().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }
}