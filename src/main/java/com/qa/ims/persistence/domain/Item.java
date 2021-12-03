package com.qa.ims.persistence.domain;

import java.math.BigDecimal;

public class Item {
    private Long item_Id;
    private String name;
    private BigDecimal price;

    public Item(String name, BigDecimal price) {
        this.setName(name);
        this.setPrice(price);
    }

    public long getItem_Id() {
        return item_Id;
    }

    public void setItem_Id(long item_Id) {
        this.item_Id = item_Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "id:" + item_Id + " name:" + name + " price:" + price;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((item_Id == null) ? 0 : item_Id.hashCode());
        result = prime * result + ((price == null) ? 0 : price.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Item other = (Item) obj;
        if (getName() == null) {
            if (other.getName() != null)
                return false;
        } else if (!getName().equals(other.getName()))
            return false;
        if (item_Id == null) {
            if (other.item_Id != null)
                return false;
        } else if (!item_Id.equals(other.item_Id))
            return false;
        if (price == null) {
            if (other.price != null)
                return false;
        } else if (!price.equals(other.price))
            return false;
        return true;
    }
}
