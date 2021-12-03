package com.qa.ims.persistence.domain;


public class OrderItems {
    private Long ord_it_id;
    private Integer amount;
    private Long order_id;
    private Long item_id;

    public OrderItems(Long ord_it_id, Integer amount, Long order_id, Long item_id) {
        this.setOrd_it_id(ord_it_id);
        this.setAmount(amount);
        this.setOrder_id(order_id);
        this.setItem_id(item_id);
    }

    public Long getOrd_it_id() {
        return ord_it_id;
    }

    public void setOrd_it_id(Long ord_it_id) {
        this.ord_it_id = ord_it_id;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Long order_id) {
        this.order_id = order_id;
    }

    public Long getItem_id() {
        return item_id;
    }

    public void setItem_id(Long item_id) {
        this.item_id = item_id;
    }
}
