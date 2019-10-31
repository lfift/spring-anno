package com.ift.cap9.dao;

import org.springframework.stereotype.Repository;

/**
 * @author liufei
 * @since 2019/10/16
 */
@Repository
public class TestDAO {

    private String flag = "1";

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "TestDAO{" +
                "flag='" + flag + '\'' +
                '}';
    }
}
