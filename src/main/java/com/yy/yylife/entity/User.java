package com.yy.yylife.entity;

public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.uid
     *
     * @mbggenerated
     */
    private Long uid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.lifeValue
     *
     * @mbggenerated
     */
    private Long lifeValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.grapeValue
     *
     * @mbggenerated
     */
    private Long grapeValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.score
     *
     * @mbggenerated
     */
    private Long score;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.charmValue
     *
     * @mbggenerated
     */
    private Long charmValue;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.uid
     *
     * @return the value of user.uid
     *
     * @mbggenerated
     */
    public Long getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.uid
     *
     * @param uid the value for user.uid
     *
     * @mbggenerated
     */
    public void setUid(Long uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.lifeValue
     *
     * @return the value of user.lifeValue
     *
     * @mbggenerated
     */
    public Long getLifeValue() {
        return lifeValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.lifeValue
     *
     * @param lifeValue the value for user.lifeValue
     *
     * @mbggenerated
     */
    public void setLifeValue(Long lifeValue) {
        this.lifeValue = lifeValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.grapeValue
     *
     * @return the value of user.grapeValue
     *
     * @mbggenerated
     */
    public Long getGrapeValue() {
        return grapeValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.grapeValue
     *
     * @param grapeValue the value for user.grapeValue
     *
     * @mbggenerated
     */
    public void setGrapeValue(Long grapeValue) {
        this.grapeValue = grapeValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.score
     *
     * @return the value of user.score
     *
     * @mbggenerated
     */
    public Long getScore() {
        return score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.score
     *
     * @param score the value for user.score
     *
     * @mbggenerated
     */
    public void setScore(Long score) {
        this.score = score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.charmValue
     *
     * @return the value of user.charmValue
     *
     * @mbggenerated
     */
    public Long getCharmValue() {
        return charmValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.charmValue
     *
     * @param charmValue the value for user.charmValue
     *
     * @mbggenerated
     */
    public void setCharmValue(Long charmValue) {
        this.charmValue = charmValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
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
        User other = (User) that;
        return (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
            && (this.getLifeValue() == null ? other.getLifeValue() == null : this.getLifeValue().equals(other.getLifeValue()))
            && (this.getGrapeValue() == null ? other.getGrapeValue() == null : this.getGrapeValue().equals(other.getGrapeValue()))
            && (this.getScore() == null ? other.getScore() == null : this.getScore().equals(other.getScore()))
            && (this.getCharmValue() == null ? other.getCharmValue() == null : this.getCharmValue().equals(other.getCharmValue()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getLifeValue() == null) ? 0 : getLifeValue().hashCode());
        result = prime * result + ((getGrapeValue() == null) ? 0 : getGrapeValue().hashCode());
        result = prime * result + ((getScore() == null) ? 0 : getScore().hashCode());
        result = prime * result + ((getCharmValue() == null) ? 0 : getCharmValue().hashCode());
        return result;
    }
}