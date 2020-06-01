package com.gokiesoft.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String code;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private Double price;
    @Column(name = "precioDiscount", nullable = false)
    private Double priceDiscount;
    private String image;
    private Integer tax;
    private Double cost;
    @Column(name = "tax_method", nullable = false)
    private Integer taxMethod;
    private Integer quantity;
    @Column(name = "barcode_symbology", nullable = false)
    private String barCode;
    private String type;
    private String details;
    @Column(name = "alert_quantity", nullable = false)
    private Double alertQuantity;
    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    public Product() {}

    public Product(String code, String name, Double price, Double priceDiscount, String image, Integer tax, Double cost,
            Integer taxMethod, Integer quantity, String barCode, String type, String details, Double alertQuantity,
            Category category) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.priceDiscount = priceDiscount;
        this.image = image;
        this.tax = tax;
        this.cost = cost;
        this.taxMethod = taxMethod;
        this.quantity = quantity;
        this.barCode = barCode;
        this.type = type;
        this.details = details;
        this.alertQuantity = alertQuantity;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPriceDiscount() {
        return priceDiscount;
    }

    public void setPriceDiscount(Double priceDiscount) {
        this.priceDiscount = priceDiscount;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getTax() {
        return tax;
    }

    public void setTax(Integer tax) {
        this.tax = tax;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Integer getTaxMethod() {
        return taxMethod;
    }

    public void setTaxMethod(Integer taxMethod) {
        this.taxMethod = taxMethod;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Double getAlertQuantity() {
        return alertQuantity;
    }

    public void setAlertQuantity(Double alertQuantity) {
        this.alertQuantity = alertQuantity;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product [alertQuantity=" + alertQuantity + ", barCode=" + barCode + ", category=" + category + ", code="
                + code + ", cost=" + cost + ", details=" + details + ", id=" + id + ", image=" + image + ", name="
                + name + ", price=" + price + ", priceDiscount=" + priceDiscount + ", quantity=" + quantity + ", tax="
                + tax + ", taxMethod=" + taxMethod + ", type=" + type + "]";
    }
    
    
}