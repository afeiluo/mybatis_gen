package com.afeiluo.cook.entity;

public class DishMaterial {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dish_material.dishId
     *
     * @mbggenerated
     */
    private Integer dishId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dish_material.materialName
     *
     * @mbggenerated
     */
    private String materialName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dish_material.materialDes
     *
     * @mbggenerated
     */
    private String materialDes;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dish_material.dishId
     *
     * @return the value of dish_material.dishId
     *
     * @mbggenerated
     */
    public Integer getDishId() {
        return dishId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dish_material.dishId
     *
     * @param dishId the value for dish_material.dishId
     *
     * @mbggenerated
     */
    public void setDishId(Integer dishId) {
        this.dishId = dishId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dish_material.materialName
     *
     * @return the value of dish_material.materialName
     *
     * @mbggenerated
     */
    public String getMaterialName() {
        return materialName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dish_material.materialName
     *
     * @param materialName the value for dish_material.materialName
     *
     * @mbggenerated
     */
    public void setMaterialName(String materialName) {
        this.materialName = materialName == null ? null : materialName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dish_material.materialDes
     *
     * @return the value of dish_material.materialDes
     *
     * @mbggenerated
     */
    public String getMaterialDes() {
        return materialDes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dish_material.materialDes
     *
     * @param materialDes the value for dish_material.materialDes
     *
     * @mbggenerated
     */
    public void setMaterialDes(String materialDes) {
        this.materialDes = materialDes == null ? null : materialDes.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dish_material
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
        DishMaterial other = (DishMaterial) that;
        return (this.getDishId() == null ? other.getDishId() == null : this.getDishId().equals(other.getDishId()))
            && (this.getMaterialName() == null ? other.getMaterialName() == null : this.getMaterialName().equals(other.getMaterialName()))
            && (this.getMaterialDes() == null ? other.getMaterialDes() == null : this.getMaterialDes().equals(other.getMaterialDes()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dish_material
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDishId() == null) ? 0 : getDishId().hashCode());
        result = prime * result + ((getMaterialName() == null) ? 0 : getMaterialName().hashCode());
        result = prime * result + ((getMaterialDes() == null) ? 0 : getMaterialDes().hashCode());
        return result;
    }
}