package com.afeiluo.cook.entity;

public class DishScore {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dish_score.dishId
     *
     * @mbggenerated
     */
    private Integer dishId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dish_score.userId
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dish_score.score1
     *
     * @mbggenerated
     */
    private Integer score1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dish_score.score2
     *
     * @mbggenerated
     */
    private Integer score2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dish_score.score3
     *
     * @mbggenerated
     */
    private Integer score3;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dish_score.score4
     *
     * @mbggenerated
     */
    private Integer score4;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dish_score.score5
     *
     * @mbggenerated
     */
    private Integer score5;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dish_score.aveScore
     *
     * @mbggenerated
     */
    private Float aveScore;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dish_score.dishId
     *
     * @return the value of dish_score.dishId
     *
     * @mbggenerated
     */
    public Integer getDishId() {
        return dishId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dish_score.dishId
     *
     * @param dishId the value for dish_score.dishId
     *
     * @mbggenerated
     */
    public void setDishId(Integer dishId) {
        this.dishId = dishId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dish_score.userId
     *
     * @return the value of dish_score.userId
     *
     * @mbggenerated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dish_score.userId
     *
     * @param userId the value for dish_score.userId
     *
     * @mbggenerated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dish_score.score1
     *
     * @return the value of dish_score.score1
     *
     * @mbggenerated
     */
    public Integer getScore1() {
        return score1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dish_score.score1
     *
     * @param score1 the value for dish_score.score1
     *
     * @mbggenerated
     */
    public void setScore1(Integer score1) {
        this.score1 = score1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dish_score.score2
     *
     * @return the value of dish_score.score2
     *
     * @mbggenerated
     */
    public Integer getScore2() {
        return score2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dish_score.score2
     *
     * @param score2 the value for dish_score.score2
     *
     * @mbggenerated
     */
    public void setScore2(Integer score2) {
        this.score2 = score2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dish_score.score3
     *
     * @return the value of dish_score.score3
     *
     * @mbggenerated
     */
    public Integer getScore3() {
        return score3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dish_score.score3
     *
     * @param score3 the value for dish_score.score3
     *
     * @mbggenerated
     */
    public void setScore3(Integer score3) {
        this.score3 = score3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dish_score.score4
     *
     * @return the value of dish_score.score4
     *
     * @mbggenerated
     */
    public Integer getScore4() {
        return score4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dish_score.score4
     *
     * @param score4 the value for dish_score.score4
     *
     * @mbggenerated
     */
    public void setScore4(Integer score4) {
        this.score4 = score4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dish_score.score5
     *
     * @return the value of dish_score.score5
     *
     * @mbggenerated
     */
    public Integer getScore5() {
        return score5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dish_score.score5
     *
     * @param score5 the value for dish_score.score5
     *
     * @mbggenerated
     */
    public void setScore5(Integer score5) {
        this.score5 = score5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dish_score.aveScore
     *
     * @return the value of dish_score.aveScore
     *
     * @mbggenerated
     */
    public Float getAveScore() {
        return aveScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dish_score.aveScore
     *
     * @param aveScore the value for dish_score.aveScore
     *
     * @mbggenerated
     */
    public void setAveScore(Float aveScore) {
        this.aveScore = aveScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dish_score
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
        DishScore other = (DishScore) that;
        return (this.getDishId() == null ? other.getDishId() == null : this.getDishId().equals(other.getDishId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getScore1() == null ? other.getScore1() == null : this.getScore1().equals(other.getScore1()))
            && (this.getScore2() == null ? other.getScore2() == null : this.getScore2().equals(other.getScore2()))
            && (this.getScore3() == null ? other.getScore3() == null : this.getScore3().equals(other.getScore3()))
            && (this.getScore4() == null ? other.getScore4() == null : this.getScore4().equals(other.getScore4()))
            && (this.getScore5() == null ? other.getScore5() == null : this.getScore5().equals(other.getScore5()))
            && (this.getAveScore() == null ? other.getAveScore() == null : this.getAveScore().equals(other.getAveScore()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dish_score
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDishId() == null) ? 0 : getDishId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getScore1() == null) ? 0 : getScore1().hashCode());
        result = prime * result + ((getScore2() == null) ? 0 : getScore2().hashCode());
        result = prime * result + ((getScore3() == null) ? 0 : getScore3().hashCode());
        result = prime * result + ((getScore4() == null) ? 0 : getScore4().hashCode());
        result = prime * result + ((getScore5() == null) ? 0 : getScore5().hashCode());
        result = prime * result + ((getAveScore() == null) ? 0 : getAveScore().hashCode());
        return result;
    }
}