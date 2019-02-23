package com.smp.smp.Entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import springfox.documentation.annotations.ApiIgnore;

import javax.persistence.*;

@Entity
@ApiModel(value="user对象",description="用户对象user")
@Table(name = "usersmp")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty(hidden = true)
    private Integer id;
    @Column(name = "name")
    @ApiModelProperty(value="用户名",name="name",example="xingguo")
    private String name;
    @Column(name = "age")
    @ApiModelProperty(value="年龄",name="age",example="12")
    private String age;
    @Column(name = "phone")
    @ApiModelProperty(value="电话号码",name="phone",example="1211xxxxxxx")
    private String phone;
    @Column(name = "number")
    @ApiModelProperty(value="个人id",name="number",example="12")
    private String number;

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
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", phone='" + phone + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
