package com.yy.baby.fighting.entity;

import java.util.Date;

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
     * This field corresponds to the database column user.yy
     *
     * @mbggenerated
     */
    private Long yy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.nickName
     *
     * @mbggenerated
     */
    private String nickName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.price
     *
     * @mbggenerated
     */
    private Long price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.money
     *
     * @mbggenerated
     */
    private Long money;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.assets
     *
     * @mbggenerated
     */
    private Long assets;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.favor
     *
     * @mbggenerated
     */
    private Long favor;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.babyNumber
     *
     * @mbggenerated
     */
    private Integer babyNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.card
     *
     * @mbggenerated
     */
    private String card;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.medal
     *
     * @mbggenerated
     */
    private String medal;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.masterUid
     *
     * @mbggenerated
     */
    private Long masterUid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.masterNickName
     *
     * @mbggenerated
     */
    private String masterNickName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.weapon
     *
     * @mbggenerated
     */
    private String weapon;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.protectUser
     *
     * @mbggenerated
     */
    private String protectUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.attackAndProtectCount
     *
     * @mbggenerated
     */
    private Integer attackAndProtectCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.attackedCount
     *
     * @mbggenerated
     */
    private Integer attackedCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.addStatus
     *
     * @mbggenerated
     */
    private String addStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.power
     *
     * @mbggenerated
     */
    private Long power;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.fightTotalCount
     *
     * @mbggenerated
     */
    private Long fightTotalCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.fightWinCount
     *
     * @mbggenerated
     */
    private Long fightWinCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.createTime
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.inviteCount
     *
     * @mbggenerated
     */
    private Long inviteCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.bulletinBoardVersion
     *
     * @mbggenerated
     */
    private Integer bulletinBoardVersion;

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
     * This method returns the value of the database column user.yy
     *
     * @return the value of user.yy
     *
     * @mbggenerated
     */
    public Long getYy() {
        return yy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.yy
     *
     * @param yy the value for user.yy
     *
     * @mbggenerated
     */
    public void setYy(Long yy) {
        this.yy = yy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.nickName
     *
     * @return the value of user.nickName
     *
     * @mbggenerated
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.nickName
     *
     * @param nickName the value for user.nickName
     *
     * @mbggenerated
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.price
     *
     * @return the value of user.price
     *
     * @mbggenerated
     */
    public Long getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.price
     *
     * @param price the value for user.price
     *
     * @mbggenerated
     */
    public void setPrice(Long price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.money
     *
     * @return the value of user.money
     *
     * @mbggenerated
     */
    public Long getMoney() {
        return money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.money
     *
     * @param money the value for user.money
     *
     * @mbggenerated
     */
    public void setMoney(Long money) {
        this.money = money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.assets
     *
     * @return the value of user.assets
     *
     * @mbggenerated
     */
    public Long getAssets() {
        return assets;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.assets
     *
     * @param assets the value for user.assets
     *
     * @mbggenerated
     */
    public void setAssets(Long assets) {
        this.assets = assets;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.favor
     *
     * @return the value of user.favor
     *
     * @mbggenerated
     */
    public Long getFavor() {
        return favor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.favor
     *
     * @param favor the value for user.favor
     *
     * @mbggenerated
     */
    public void setFavor(Long favor) {
        this.favor = favor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.babyNumber
     *
     * @return the value of user.babyNumber
     *
     * @mbggenerated
     */
    public Integer getBabyNumber() {
        return babyNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.babyNumber
     *
     * @param babyNumber the value for user.babyNumber
     *
     * @mbggenerated
     */
    public void setBabyNumber(Integer babyNumber) {
        this.babyNumber = babyNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.card
     *
     * @return the value of user.card
     *
     * @mbggenerated
     */
    public String getCard() {
        return card;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.card
     *
     * @param card the value for user.card
     *
     * @mbggenerated
     */
    public void setCard(String card) {
        this.card = card == null ? null : card.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.medal
     *
     * @return the value of user.medal
     *
     * @mbggenerated
     */
    public String getMedal() {
        return medal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.medal
     *
     * @param medal the value for user.medal
     *
     * @mbggenerated
     */
    public void setMedal(String medal) {
        this.medal = medal == null ? null : medal.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.masterUid
     *
     * @return the value of user.masterUid
     *
     * @mbggenerated
     */
    public Long getMasterUid() {
        return masterUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.masterUid
     *
     * @param masterUid the value for user.masterUid
     *
     * @mbggenerated
     */
    public void setMasterUid(Long masterUid) {
        this.masterUid = masterUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.masterNickName
     *
     * @return the value of user.masterNickName
     *
     * @mbggenerated
     */
    public String getMasterNickName() {
        return masterNickName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.masterNickName
     *
     * @param masterNickName the value for user.masterNickName
     *
     * @mbggenerated
     */
    public void setMasterNickName(String masterNickName) {
        this.masterNickName = masterNickName == null ? null : masterNickName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.weapon
     *
     * @return the value of user.weapon
     *
     * @mbggenerated
     */
    public String getWeapon() {
        return weapon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.weapon
     *
     * @param weapon the value for user.weapon
     *
     * @mbggenerated
     */
    public void setWeapon(String weapon) {
        this.weapon = weapon == null ? null : weapon.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.protectUser
     *
     * @return the value of user.protectUser
     *
     * @mbggenerated
     */
    public String getProtectUser() {
        return protectUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.protectUser
     *
     * @param protectUser the value for user.protectUser
     *
     * @mbggenerated
     */
    public void setProtectUser(String protectUser) {
        this.protectUser = protectUser == null ? null : protectUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.attackAndProtectCount
     *
     * @return the value of user.attackAndProtectCount
     *
     * @mbggenerated
     */
    public Integer getAttackAndProtectCount() {
        return attackAndProtectCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.attackAndProtectCount
     *
     * @param attackAndProtectCount the value for user.attackAndProtectCount
     *
     * @mbggenerated
     */
    public void setAttackAndProtectCount(Integer attackAndProtectCount) {
        this.attackAndProtectCount = attackAndProtectCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.attackedCount
     *
     * @return the value of user.attackedCount
     *
     * @mbggenerated
     */
    public Integer getAttackedCount() {
        return attackedCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.attackedCount
     *
     * @param attackedCount the value for user.attackedCount
     *
     * @mbggenerated
     */
    public void setAttackedCount(Integer attackedCount) {
        this.attackedCount = attackedCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.addStatus
     *
     * @return the value of user.addStatus
     *
     * @mbggenerated
     */
    public String getAddStatus() {
        return addStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.addStatus
     *
     * @param addStatus the value for user.addStatus
     *
     * @mbggenerated
     */
    public void setAddStatus(String addStatus) {
        this.addStatus = addStatus == null ? null : addStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.power
     *
     * @return the value of user.power
     *
     * @mbggenerated
     */
    public Long getPower() {
        return power;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.power
     *
     * @param power the value for user.power
     *
     * @mbggenerated
     */
    public void setPower(Long power) {
        this.power = power;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.fightTotalCount
     *
     * @return the value of user.fightTotalCount
     *
     * @mbggenerated
     */
    public Long getFightTotalCount() {
        return fightTotalCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.fightTotalCount
     *
     * @param fightTotalCount the value for user.fightTotalCount
     *
     * @mbggenerated
     */
    public void setFightTotalCount(Long fightTotalCount) {
        this.fightTotalCount = fightTotalCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.fightWinCount
     *
     * @return the value of user.fightWinCount
     *
     * @mbggenerated
     */
    public Long getFightWinCount() {
        return fightWinCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.fightWinCount
     *
     * @param fightWinCount the value for user.fightWinCount
     *
     * @mbggenerated
     */
    public void setFightWinCount(Long fightWinCount) {
        this.fightWinCount = fightWinCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.createTime
     *
     * @return the value of user.createTime
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.createTime
     *
     * @param createTime the value for user.createTime
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.inviteCount
     *
     * @return the value of user.inviteCount
     *
     * @mbggenerated
     */
    public Long getInviteCount() {
        return inviteCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.inviteCount
     *
     * @param inviteCount the value for user.inviteCount
     *
     * @mbggenerated
     */
    public void setInviteCount(Long inviteCount) {
        this.inviteCount = inviteCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.bulletinBoardVersion
     *
     * @return the value of user.bulletinBoardVersion
     *
     * @mbggenerated
     */
    public Integer getBulletinBoardVersion() {
        return bulletinBoardVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.bulletinBoardVersion
     *
     * @param bulletinBoardVersion the value for user.bulletinBoardVersion
     *
     * @mbggenerated
     */
    public void setBulletinBoardVersion(Integer bulletinBoardVersion) {
        this.bulletinBoardVersion = bulletinBoardVersion;
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
            && (this.getYy() == null ? other.getYy() == null : this.getYy().equals(other.getYy()))
            && (this.getNickName() == null ? other.getNickName() == null : this.getNickName().equals(other.getNickName()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getMoney() == null ? other.getMoney() == null : this.getMoney().equals(other.getMoney()))
            && (this.getAssets() == null ? other.getAssets() == null : this.getAssets().equals(other.getAssets()))
            && (this.getFavor() == null ? other.getFavor() == null : this.getFavor().equals(other.getFavor()))
            && (this.getBabyNumber() == null ? other.getBabyNumber() == null : this.getBabyNumber().equals(other.getBabyNumber()))
            && (this.getCard() == null ? other.getCard() == null : this.getCard().equals(other.getCard()))
            && (this.getMedal() == null ? other.getMedal() == null : this.getMedal().equals(other.getMedal()))
            && (this.getMasterUid() == null ? other.getMasterUid() == null : this.getMasterUid().equals(other.getMasterUid()))
            && (this.getMasterNickName() == null ? other.getMasterNickName() == null : this.getMasterNickName().equals(other.getMasterNickName()))
            && (this.getWeapon() == null ? other.getWeapon() == null : this.getWeapon().equals(other.getWeapon()))
            && (this.getProtectUser() == null ? other.getProtectUser() == null : this.getProtectUser().equals(other.getProtectUser()))
            && (this.getAttackAndProtectCount() == null ? other.getAttackAndProtectCount() == null : this.getAttackAndProtectCount().equals(other.getAttackAndProtectCount()))
            && (this.getAttackedCount() == null ? other.getAttackedCount() == null : this.getAttackedCount().equals(other.getAttackedCount()))
            && (this.getAddStatus() == null ? other.getAddStatus() == null : this.getAddStatus().equals(other.getAddStatus()))
            && (this.getPower() == null ? other.getPower() == null : this.getPower().equals(other.getPower()))
            && (this.getFightTotalCount() == null ? other.getFightTotalCount() == null : this.getFightTotalCount().equals(other.getFightTotalCount()))
            && (this.getFightWinCount() == null ? other.getFightWinCount() == null : this.getFightWinCount().equals(other.getFightWinCount()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getInviteCount() == null ? other.getInviteCount() == null : this.getInviteCount().equals(other.getInviteCount()))
            && (this.getBulletinBoardVersion() == null ? other.getBulletinBoardVersion() == null : this.getBulletinBoardVersion().equals(other.getBulletinBoardVersion()));
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
        result = prime * result + ((getYy() == null) ? 0 : getYy().hashCode());
        result = prime * result + ((getNickName() == null) ? 0 : getNickName().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getMoney() == null) ? 0 : getMoney().hashCode());
        result = prime * result + ((getAssets() == null) ? 0 : getAssets().hashCode());
        result = prime * result + ((getFavor() == null) ? 0 : getFavor().hashCode());
        result = prime * result + ((getBabyNumber() == null) ? 0 : getBabyNumber().hashCode());
        result = prime * result + ((getCard() == null) ? 0 : getCard().hashCode());
        result = prime * result + ((getMedal() == null) ? 0 : getMedal().hashCode());
        result = prime * result + ((getMasterUid() == null) ? 0 : getMasterUid().hashCode());
        result = prime * result + ((getMasterNickName() == null) ? 0 : getMasterNickName().hashCode());
        result = prime * result + ((getWeapon() == null) ? 0 : getWeapon().hashCode());
        result = prime * result + ((getProtectUser() == null) ? 0 : getProtectUser().hashCode());
        result = prime * result + ((getAttackAndProtectCount() == null) ? 0 : getAttackAndProtectCount().hashCode());
        result = prime * result + ((getAttackedCount() == null) ? 0 : getAttackedCount().hashCode());
        result = prime * result + ((getAddStatus() == null) ? 0 : getAddStatus().hashCode());
        result = prime * result + ((getPower() == null) ? 0 : getPower().hashCode());
        result = prime * result + ((getFightTotalCount() == null) ? 0 : getFightTotalCount().hashCode());
        result = prime * result + ((getFightWinCount() == null) ? 0 : getFightWinCount().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getInviteCount() == null) ? 0 : getInviteCount().hashCode());
        result = prime * result + ((getBulletinBoardVersion() == null) ? 0 : getBulletinBoardVersion().hashCode());
        return result;
    }
}