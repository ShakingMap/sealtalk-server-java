package com.rcloud.server.sealtalk.dao;

import com.rcloud.server.sealtalk.domain.BlackLists;
import com.rcloud.server.sealtalk.domain.BlackListsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlackListsMapper {
    long countByExample(BlackListsExample example);

    int deleteByExample(BlackListsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BlackLists record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blacklists
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int insertSelective(@Param("record") BlackLists record, @Param("selective") BlackLists.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blacklists
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    BlackLists selectOneByExample(BlackListsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blacklists
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    BlackLists selectOneByExampleSelective(@Param("example") BlackListsExample example, @Param("selective") BlackLists.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blacklists
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<BlackLists> selectByExampleSelective(@Param("example") BlackListsExample example, @Param("selective") BlackLists.Column ... selective);

    List<BlackLists> selectByExample(BlackListsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blacklists
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    BlackLists selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") BlackLists.Column ... selective);

    BlackLists selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blacklists
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateByExampleSelective(@Param("record") BlackLists record, @Param("example") BlackListsExample example, @Param("selective") BlackLists.Column ... selective);

    int updateByExample(@Param("record") BlackLists record, @Param("example") BlackListsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blacklists
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateByPrimaryKeySelective(@Param("record") BlackLists record, @Param("selective") BlackLists.Column ... selective);

    int updateByPrimaryKey(BlackLists record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blacklists
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int batchInsert(@Param("list") List<BlackLists> list);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blacklists
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int batchInsertSelective(@Param("list") List<BlackLists> list, @Param("selective") BlackLists.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blacklists
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int upsert(BlackLists record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blacklists
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int upsertByExample(@Param("record") BlackLists record, @Param("example") BlackListsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blacklists
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int upsertByExampleSelective(@Param("record") BlackLists record, @Param("example") BlackListsExample example, @Param("selective") BlackLists.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blacklists
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int upsertSelective(@Param("record") BlackLists record, @Param("selective") BlackLists.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blacklists
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int batchUpsert(@Param("list") List<BlackLists> list);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blacklists
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int batchUpsertSelective(@Param("list") List<BlackLists> list, @Param("selective") BlackLists.Column ... selective);
}