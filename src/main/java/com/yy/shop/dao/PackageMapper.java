package com.yy.shop.dao;

import com.yy.shop.entity.Package;
import com.yy.shop.entity.PackageCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PackageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Package
     *
     * @mbggenerated
     */
    int countByExample(PackageCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Package
     *
     * @mbggenerated
     */
    int deleteByExample(PackageCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Package
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Package
     *
     * @mbggenerated
     */
    int insert(Package record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Package
     *
     * @mbggenerated
     */
    int insertSelective(Package record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Package
     *
     * @mbggenerated
     */
    List<Package> selectByExample(PackageCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Package
     *
     * @mbggenerated
     */
    Package selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Package
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Package record, @Param("example") PackageCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Package
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Package record, @Param("example") PackageCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Package
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Package record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Package
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Package record);
}