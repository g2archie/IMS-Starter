package com.qa.ims.persistence.domain;


import java.util.Date;

public class Order {
    private Long order_Id;
    private Long cust_id;
    private Date order_Date;

    public Order(Long order_Id, Long cust_id, Date order_Date) {
        this.setOrder_Id(order_Id);
        this.setOrder_Date(order_Date);
        this.setCust_id(cust_id);
    }

    public Long getOrder_Id() {
        return order_Id;
    }

    public void setOrder_Id(Long order_Id) {
        this.order_Id = order_Id;
    }

    public Long getCust_id() {
        return cust_id;
    }

    public void setCust_id(Long cust_id) {
        this.cust_id = cust_id;
    }

    public Date getOrder_Date() {
        return order_Date;
    }

    public void setOrder_Date(Date order_Date) {
        this.order_Date = order_Date;
    }
}
