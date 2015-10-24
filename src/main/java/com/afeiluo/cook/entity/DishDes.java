package com.afeiluo.cook.entity;

public class DishDes {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dish_des.dishId
     *
     * @mbggenerated
     */
    private Integer dishId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dish_des.dishTools
     *
     * @mbggenerated
     */
    private String dishTools;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dish_des.dishEnv
     *
     * @mbggenerated
     */
    private String dishEnv;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dish_des.dishTips
     *
     * @mbggenerated
     */
    private String dishTips;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dish_des.dishId
     *
     * @return the value of dish_des.dishId
     *
     * @mbggenerated
     */
    public Integer getDishId() {
        return dishId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dish_des.dishId
     *
     * @param dishId the value for dish_des.dishId
     *
     * @mbggenerated
     */
    public void setDishId(Integer dishId) {
        this.dishId = dishId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dish_des.dishTools
     *
     * @return the value of dish_des.dishTools
     *
     * @mbggenerated
     */
    public String getDishTools() {
        return dishTools;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dish_des.dishTools
     *
     * @param dishTools the value for dish_des.dishTools
     *
     * @mbggenerated
     */
    public void setDishTools(String dishTools) {
        this.dishTools = dishTools == null ? null : dishTools.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dish_des.dishEnv
     *
     * @return the value of dish_des.dishEnv
     *
     * @mbggenerated
     */
    public String getDishEnv() {
        return dishEnv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dish_des.dishEnv
     *
     * @param dishEnv the value for dish_des.dishEnv
     *
     * @mbggenerated
     */
    public void setDishEnv(String dishEnv) {
        this.dishEnv = dishEnv == null ? null : dishEnv.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dish_des.dishTips
     *
     * @return the value of dish_des.dishTips
     *
     * @mbggenerated
     */
    public String getDishTips() {
        return dishTips;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dish_des.dishTips
     *
     * @param dishTips the value for dish_des.dishTips
     *
     * @mbggenerated
     */
    public void setDishTips(String dishTips) {
        this.dishTips = dishTips == null ? null : dishTips.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dish_des
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
        DishDes other = (DishDes) that;
        return (this.getDishId() == null ? other.getDishId() == null : this.getDishId().equals(other.getDishId()))
            && (this.getDishTools() == null ? other.getDishTools() == null : this.getDishTools().equals(other.getDishTools()))
            && (this.getDishEnv() == null ? other.getDishEnv() == null : this.getDishEnv().equals(other.getDishEnv()))
            && (this.getDishTips() == null ? other.getDishTips() == null : this.getDishTips().equals(other.getDishTips()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dish_des
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDishId() == null) ? 0 : getDishId().hashCode());
        result = prime * result + ((getDishTools() == null) ? 0 : getDishTools().hashCode());
        result = prime * result + ((getDishEnv() == null) ? 0 : getDishEnv().hashCode());
        result = prime * result + ((getDishTips() == null) ? 0 : getDishTips().hashCode());
        return result;
    }
}