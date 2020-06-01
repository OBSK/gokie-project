package com.gokiesoft.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String comercial;
    @Column(name = "DNI", length = 8, columnDefinition = "CHAR(8)")
    private String DNI;
    @Column(name = "RUC", length = 11, columnDefinition = "CHAR(11)")
    private String RUC;
    private Integer phone;
    private String email;
    private String adress;
    @Column(name = "ubigeo", length = 6, columnDefinition = "CHAR(6)")
    private String ubigeo;
    @Column(name = "store_id", nullable = false)
    private String storeId;
    
    public Customer() {}

    public Customer(String name, String comercial, String dNI, String rUC, Integer phone, String email, String adress,
            String ubigeo, String storeId) {
        this.name = name;
        this.comercial = comercial;
        DNI = dNI;
        RUC = rUC;
        this.phone = phone;
        this.email = email;
        this.adress = adress;
        this.ubigeo = ubigeo;
        this.storeId = storeId;
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

    public String getComercial() {
        return comercial;
    }

    public void setComercial(String comercial) {
        this.comercial = comercial;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String dNI) {
        DNI = dNI;
    }

    public String getRUC() {
        return RUC;
    }

    public void setRUC(String rUC) {
        RUC = rUC;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getUbigeo() {
        return ubigeo;
    }

    public void setUbigeo(String ubigeo) {
        this.ubigeo = ubigeo;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    @Override
    public String toString() {
        return "Customer [DNI=" + DNI + ", RUC=" + RUC + ", adress=" + adress + ", comercial=" + comercial + ", email="
                + email + ", id=" + id + ", name=" + name + ", phone=" + phone + ", storeId=" + storeId + ", ubigeo="
                + ubigeo + "]";
    }
}