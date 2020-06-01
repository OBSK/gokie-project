package com.gokiesoft.rest.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "sale_items")
public class SaleItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private BigDecimal quantity;
    @Column(name = "unit_price", nullable = false)
    private BigDecimal unitPrice;
    @Column(name = "net_unit_price")
    private BigDecimal netUnitPrice;
    private BigDecimal discount;
    @Column(name = "item_discount")
    private BigDecimal itemDiscount;
    private Integer tax;
    @Column(name = "item_tax")
    private BigDecimal itemTax;
    private BigDecimal subtotal;
    @Column(name = "real_unit_price")
    private BigDecimal realUnitPrice;
    private BigDecimal cost;
    @Column(name = "product_code", nullable = false)
    private String productCode;
    @Column(name = "product_name")
    private String productName;
    private String comment;
    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false, updatable = false)
    private Product product;
    @ManyToOne
    @JoinColumn(name = "sale_id", nullable = false)
    private Sales sales;

    public SaleItem() {}

    public SaleItem(BigDecimal quantity, BigDecimal unitPrice, BigDecimal netUnitPrice, BigDecimal discount,
            BigDecimal itemDiscount, Integer tax, BigDecimal itemTax, BigDecimal subtotal, BigDecimal realUnitPrice,
            BigDecimal cost, String productCode, String productName, String comment, Product product, Sales sales) {
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.netUnitPrice = netUnitPrice;
        this.discount = discount;
        this.itemDiscount = itemDiscount;
        this.tax = tax;
        this.itemTax = itemTax;
        this.subtotal = subtotal;
        this.realUnitPrice = realUnitPrice;
        this.cost = cost;
        this.productCode = productCode;
        this.productName = productName;
        this.comment = comment;
        this.product = product;
        this.sales = sales;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getNetUnitPrice() {
        return netUnitPrice;
    }

    public void setNetUnitPrice(BigDecimal netUnitPrice) {
        this.netUnitPrice = netUnitPrice;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getItemDiscount() {
        return itemDiscount;
    }

    public void setItemDiscount(BigDecimal itemDiscount) {
        this.itemDiscount = itemDiscount;
    }

    public Integer getTax() {
        return tax;
    }

    public void setTax(Integer tax) {
        this.tax = tax;
    }

    public BigDecimal getItemTax() {
        return itemTax;
    }

    public void setItemTax(BigDecimal itemTax) {
        this.itemTax = itemTax;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    public BigDecimal getRealUnitPrice() {
        return realUnitPrice;
    }

    public void setRealUnitPrice(BigDecimal realUnitPrice) {
        this.realUnitPrice = realUnitPrice;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    
    public Sales getSales() {
        return sales;
    }

    public void setSales(Sales sales) {
        this.sales = sales;
    }

    @Override
    public String toString() {
        return "SaleItem [comment=" + comment + ", cost=" + cost + ", discount=" + discount + ", id=" + id
                + ", itemDiscount=" + itemDiscount + ", itemTax=" + itemTax + ", netUnitPrice=" + netUnitPrice
                + ", product=" + product + ", productCode=" + productCode + ", productName=" + productName
                + ", quantity=" + quantity + ", realUnitPrice=" + realUnitPrice + ", sales=" + sales + ", subtotal="
                + subtotal + ", tax=" + tax + ", unitPrice=" + unitPrice + "]";
    }

}