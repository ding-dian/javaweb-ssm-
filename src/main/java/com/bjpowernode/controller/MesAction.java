package com.bjpowernode.controller;

import com.bjpowernode.commons.CommonServlet;
import com.bjpowernode.pojo.Mes;
import com.bjpowernode.pojo.ProductInfo;
import com.bjpowernode.pojo.vo.JsonModelVo;
import com.bjpowernode.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class MesAction extends CommonServlet {
    @Autowired
    ProductInfoService productInfoService;

    @RequestMapping("/savemes")
    public void savemes(Mes info, HttpServletRequest request, HttpServletResponse response) {
        //info对象中有表单提交上来的5个数据,有异步ajax上来的图片名称数据,有上架时间的数据
        int num = -1;
        try {
            num = productInfoService.savemes(info);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (num > 0) {
            request.setAttribute("msg", "增加成功!");
        } else {
            request.setAttribute("msg", "增加失败!");
        }
        try {
            //  response.sendRedirect("index.html");
            response.sendRedirect("index.html");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @RequestMapping("/test")
    public void test(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.getWriter().println("200OK");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



   @PostMapping("/findOne")
    public void findOne(HttpServletRequest request, HttpServletResponse response) {
        //1.接收id
        int uid = Integer.parseInt(request.getParameter("uid"));
       System.out.println(uid);
        //2.调用service查询route对象
        ProductInfo productInfo = productInfoService.getByID(uid);

       JsonModelVo jm = new JsonModelVo();
       jm.setCode(200);
       jm.setData("OK");
       jm.setData(productInfo);
       try {
           super.writeValue(jm,response);
       }catch (Exception e){
           e.printStackTrace();
       }
   }



}
