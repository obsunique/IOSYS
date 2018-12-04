package com.example.mapper.train;

import com.example.pojo.Take;
import com.example.pojo.TakeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TakeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table take
     *
     * @mbggenerated
     */
    int countByExample(TakeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table take
     *
     * @mbggenerated
     */
    int deleteByExample(TakeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table take
     *
     * @mbggenerated
     */
    int insert(Take record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table take
     *
     * @mbggenerated
     */
    int insertSelective(Take record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table take
     *
     * @mbggenerated
     */
    List<Take> selectByExample(TakeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table take
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Take record, @Param("example") TakeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table take
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Take record, @Param("example") TakeExample example);
}