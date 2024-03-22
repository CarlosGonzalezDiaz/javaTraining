package com.carlosgonzalez.spirngboot.di.app.difacturas.models;

import org.springframework.stereotype.Component;


public class Item {

    private Product product;
    private Integer quantity;

    private Double total;

    public Item() {
    }

    public Item(Product product, Integer quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getTotal() {
        return quantity* product.getPrice();
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
