package com.ift.cap11.service;

import com.ift.cap11.dao.OrderDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 订单业务
 *
 * @author liufei
 */
@Service
public class OrderService {

    @Autowired
    private OrderDAO orderDAO;

    @Transactional
    public void save() {
        orderDAO.insert();
//        int a = 1 / 0;
    }
}
