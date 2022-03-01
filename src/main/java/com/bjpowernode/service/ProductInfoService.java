package com.bjpowernode.service;


import com.bjpowernode.pojo.Mes;
import com.bjpowernode.pojo.ProductInfo;
import com.bjpowernode.pojo.vo.MesVo;
import com.bjpowernode.pojo.vo.ProductInfoVo;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface ProductInfoService {

    //显示全部商品(不分页)
    List<ProductInfo> getAll();


    //分页功能实现
    PageInfo splitPage(int pageNum,int pageSize);

    //分页功能实现mes
    PageInfo splitPagemes(int pageNum,int pageSize);


    //增加商品
    int save(ProductInfo info);

    //增加商品
    int savemes(Mes info);

    //按主键id查询商品
    ProductInfo getByID(int pid);

    //更新商品
    int update(ProductInfo info);

    //单个商品删除
    int delete(int pid);

    //留言单个商品删除
    int deletemes(int uid);


    //批量删除商品
    int deleteBatch(String []ids);

    //批量删除留言
    int deleteBatchmes(String []ids);

    //多条件商品查询
    List<ProductInfo> selectCondition(ProductInfoVo vo);

    //多条件留言查询
    List<Mes> selectConditionmes(MesVo vo);

    //多条件查询分页
    public PageInfo splitPageVo(ProductInfoVo vo,int pageSize);


    //多条件留言查询分页
    public PageInfo splitPageVomes(MesVo vo,int pageSize);

}
