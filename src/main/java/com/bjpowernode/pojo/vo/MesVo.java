package com.bjpowernode.pojo.vo;

public class MesVo {


    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    @Override
    public String toString() {
        return "MesVo{" +
                "uname='" + uname + '\'' +
                ", uemail='" + uemail + '\'' +
                ", page=" + page +
                '}';
    }

    private String uname;
    private String uemail;
    private Integer page=1;



}
