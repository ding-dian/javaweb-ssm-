package com.bjpowernode.mapper;

import com.bjpowernode.pojo.Mes;
import com.bjpowernode.pojo.MesExample;
import com.bjpowernode.pojo.vo.MesVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MesMapper {
    int countByExample(MesExample example);

    int deleteByExample(MesExample example);

    int deleteByPrimaryKey(Integer uid);

    int insert(Mes record);

    int insertSelective(Mes record);

    List<Mes> selectByExample(MesExample example);

    Mes selectByPrimaryKey(Integer uid);

    int updateByExampleSelective(@Param("record") Mes record, @Param("example") MesExample example);

    int updateByExample(@Param("record") Mes record, @Param("example") MesExample example);

    int updateByPrimaryKeySelective(Mes record);

    int updateByPrimaryKey(Mes record);

    //批量删除留言的功能
    int deleteBatchmes(String []ids);

// 多条件查询留言
    List<Mes> selectConditionmes(MesVo vo);
}