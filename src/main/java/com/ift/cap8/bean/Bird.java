package com.ift.cap8.bean;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author liufei
 * @since 2019/10/16
 */
public class Bird {

    @Value("123")
    private String name;

    @Value("#{20-2}")
    private Integer age;

    @Value("${bird.color}")
    private String color;

    public Bird() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
