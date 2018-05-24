package com.recover.yqh.entity;

import java.util.Date;

public class User {
	
    private Integer id;

    private String name;

    private Integer age;

    private Integer phoneNum;

    private Date brothday;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(Integer phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Date getBrothday() {
        return brothday;
    }

    public void setBrothday(Date brothday) {
        this.brothday = brothday;
    }

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age
				+ ", phoneNum=" + phoneNum + ", brothday=" + brothday + "]";
	}
    
    
    
}