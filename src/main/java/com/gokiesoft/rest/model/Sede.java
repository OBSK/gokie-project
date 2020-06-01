package com.gokiesoft.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sede")
public class Sede {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String code;
    private String logo;
    private String email;
    private String phone;
    private String address1;
    private String address2;
    private String city;
    private String state;
    @Column(name = "postal_code")
    private String postalCode;
    private String ubigeo;
    private String country;
    @Column(name = "currency_code")
    private String currencyCode;
    @Column(name = "receipt_header")
    private String receiptHeader;
    @Column(name = "receipt_footer")
    private String receiptFooter;
    
    public Sede() {}

    public Sede(String name, String code, String logo, String email, String phone, String address1, String address2,
            String city, String state, String postalCode, String ubigeo, String country, String currencyCode,
            String receiptHeader, String receiptFooter) {
        this.name = name;
        this.code = code;
        this.logo = logo;
        this.email = email;
        this.phone = phone;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.ubigeo = ubigeo;
        this.country = country;
        this.currencyCode = currencyCode;
        this.receiptHeader = receiptHeader;
        this.receiptFooter = receiptFooter;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getUbigeo() {
        return ubigeo;
    }

    public void setUbigeo(String ubigeo) {
        this.ubigeo = ubigeo;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getReceiptHeader() {
        return receiptHeader;
    }

    public void setReceiptHeader(String receiptHeader) {
        this.receiptHeader = receiptHeader;
    }

    public String getReceiptFooter() {
        return receiptFooter;
    }

    public void setReceiptFooter(String receiptFooter) {
        this.receiptFooter = receiptFooter;
    }

    @Override
    public String toString() {
        return "Sede [address1=" + address1 + ", address2=" + address2 + ", city=" + city + ", code=" + code
                + ", country=" + country + ", currencyCode=" + currencyCode + ", email=" + email + ", id=" + id
                + ", logo=" + logo + ", name=" + name + ", phone=" + phone + ", postalCode=" + postalCode
                + ", receiptFooter=" + receiptFooter + ", receiptHeader=" + receiptHeader + ", state=" + state
                + ", ubigeo=" + ubigeo + "]";
    }
}