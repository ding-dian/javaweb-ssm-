package com.bjpowernode.commons;

import com.bjpowernode.pojo.vo.JsonModelVo;
import com.google.gson.Gson;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@Component
public class CommonServlet{

    /**
     * 将包装好的数据发给前端
     */
    protected void writeValue(JsonModelVo jm, HttpServletResponse response) throws IOException {
        //1. JsonModelVo转为json字符串
        Gson gson = new Gson();
        String toJson = gson.toJson(jm);
        //2. http协议MIME固定格式，表示传输json字符串
        response.setContentType("application/json;charset=utf-8");
        //3. 将json对象传给前端
        PrintWriter out = response.getWriter();
        out.println(toJson);
        //4. 将资源关闭
        out.close();
    }
}














