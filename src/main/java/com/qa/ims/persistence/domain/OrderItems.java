package com.qa.ims.persistence.domain;


public class OrderItems {
    private Long orderItemId;
    private Integer amount;
    private Long orderId;
    private Long itemId;

    public OrderItems(Long ord_it_id, Integer amount, Long order_id, Long item_id) {
        this.setOrderItemId(ord_it_id);
        this.setAmount(amount);
        this.setOrderId(order_id);
        this.setItemId(item_id);
    }

    public Long getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(Long orderItemId) {
        this.orderItemId = orderItemId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }
}
