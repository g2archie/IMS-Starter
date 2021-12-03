package com.qa.ims.persistence.domain;


import java.sql.Date;
import java.util.Calendar;

public class Order {
    private Long orderId;
    private Long customerId;
    private Date orderDate;

    public Order(Long orderId, Long customerId, Date orderDate) {
        this.setOrderId(orderId);
        this.setOrderDate(orderDate);
        this.setCustomerId(customerId);
    }

    public Order(Long customerId) {
        long currentDate = Calendar.getInstance().getTimeInMillis();
        this.setOrderDate(new Date(currentDate));
        this.setCustomerId(customerId);
    }

    public Order(Long orderId, Long customerId) {
        this.setOrderId(orderId);
        long currentDate = Calendar.getInstance().getTimeInMillis();
        this.setOrderDate(new Date(currentDate));
        this.setCustomerId(customerId);
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
}
