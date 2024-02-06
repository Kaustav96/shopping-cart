package org.example.api.dao;

public class CartProduct {
  private String productName;
  private Integer count;

  public CartProduct() {
  }

  public CartProduct(String productName, Integer count) {
    this.productName = productName;
    this.count = count;
  }

  public String getProductName() {
    return productName;
  }

  public Integer getCount() {
    return count;
  }
}
