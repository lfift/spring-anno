package com.ift.cap11.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

/**
 * 订单
 *
 * @author liufei
 */
@Repository
public class OrderDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insert() {
        jdbcTemplate.update("insert into t_order(content, num, time) values (?,?,?)", "111", 1, LocalDateTime.now());
    }
}
