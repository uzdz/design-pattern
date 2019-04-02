package com.uzdz.创建型模式.原型模式.project;

/**
 * 简历内容类
 * @author uzdz
 * @date: 2019/4/2 16:16
 * @since 0.1.0
 */
public class WorkExperience {
    /**
     * 时间
     */
    private String time;

    /**
     * 公司
     */
    private String company;

    /**
     * 岗位
     */
    private String position;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
