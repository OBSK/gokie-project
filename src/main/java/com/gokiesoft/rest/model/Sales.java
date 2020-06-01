package com.gokiesoft.rest.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "sales")
public class Sales {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "date", columnDefinition = "DATETIME")
    private Date date;
    private String customerName;
    private BigDecimal total;
    @Column(name = "product_discount")
    private BigDecimal productDiscount;
    @Column(name = "order_discount_id")
    private String orderDiscountId;
    @Column(name = "order_discount")
    private BigDecimal orderDiscount;
    @Column(name = "total_discount")
    private BigDecimal totalDiscount;
    @Column(name = "product_tax")
    private BigDecimal productTax;
    @Column(name = "order_tax_id")
    private String orderTaxId;
    @Column(name = "order_tax")
    private BigDecimal orderTax;
    @Column(name = "total_tax")
    private BigDecimal totalTax;
    @Column(name = "grand_total")
    private BigDecimal grandTotal;
    @Column(name = "total_items")
    private Integer totalItems;
    @Column(name = "total_quantity")
    private BigDecimal totalQuantity;
    private BigDecimal paid;
    @Column(name = "created_by")
    private Integer createdBy;
    @Column(name = "updated_by")
    private Integer updateBy;
    @Column(name = "updated_at", columnDefinition = "DATETIME")
    private Date updatedAt;
    private String note;
    private String status;
    private BigDecimal rounding;
    @Column(name = "store_id")
    private Integer storeId;
    private String holdRef;
    private String serie;
    private Integer correlativo;
    @Column(name = "estado_facturacion")
    private Integer estadoFacturacion;
    @Column(name = "fecha_facturacion", columnDefinition = "DATETIME")
    private Date fechaFacturacion;
    @Column(name = "pdf_facturacion")
    private String pdfFacturacion;
    @Column(name = "xml_facturacion")
    private String xmlFacturacion;
    @Column(name = "cdr_facturacion")
    private String cdrFacturacion;
    @Column(name = "hash_facturacion")
    private String hashFacturacion;
    private String text;
    private String qr;
    @Column(name = "mensaje_facturacion")
    private String mensajeFacturacion;
    @Column(name = "external_id")
    private String externalId;
    @Column(name = "ticket_resumen")
    private String ticketResumen;
    @Column(name = "external_id_resumen")
    private String externalIdResumen;
    @Column(name = "external_id_anulacion")
    private String externalIdAnulacion;
    @Column(name = "ticket_anulacion")
    private String ticketAnulacion;
    @Column(name = "xml_anulacion")
    private String xmlAnulacion;
    @Column(name = "cdr_anulacion")
    private String cdrAnulacion;
    @Column(name = "mensaje_anulacion")
    private String mensajeAnulacion;
    @Column(name = "motivo_anulacion")
    private String motivoAnulacion;
    @Column(name = "fecha_anulacion")
    private Date fechaAnulacion;
    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false, updatable = false)
    private Customer customer;
    @ManyToOne
    @JoinColumn(name = "tipo_documento_id", nullable = false)
    private TipoDocumento tipoDocumento;

    public Sales() {}
    
    public Sales(Date date, String customerName, BigDecimal total, BigDecimal productDiscount, String orderDiscountId,
            BigDecimal orderDiscount, BigDecimal totalDiscount, BigDecimal productTax, String orderTaxId,
            BigDecimal orderTax, BigDecimal totalTax, BigDecimal grandTotal, Integer totalItems,
            BigDecimal totalQuantity, BigDecimal paid, Integer createdBy, Integer updateBy, Date updatedAt, String note,
            String status, BigDecimal rounding, Integer storeId, String holdRef, String serie, Integer correlativo,
            Integer estadoFacturacion, Date fechaFacturacion, String pdfFacturacion, String xmlFacturacion,
            String cdrFacturacion, String hashFacturacion, String text, String qr, String mensajeFacturacion,
            String externalId, String ticketResumen, String externalIdResumen, String externalIdAnulacion,
            String ticketAnulacion, String xmlAnulacion, String cdrAnulacion, String mensajeAnulacion,
            String motivoAnulacion, Date fechaAnulacion, Customer customer, TipoDocumento tipoDocumento) {
        this.date = date;
        this.customerName = customerName;
        this.total = total;
        this.productDiscount = productDiscount;
        this.orderDiscountId = orderDiscountId;
        this.orderDiscount = orderDiscount;
        this.totalDiscount = totalDiscount;
        this.productTax = productTax;
        this.orderTaxId = orderTaxId;
        this.orderTax = orderTax;
        this.totalTax = totalTax;
        this.grandTotal = grandTotal;
        this.totalItems = totalItems;
        this.totalQuantity = totalQuantity;
        this.paid = paid;
        this.createdBy = createdBy;
        this.updateBy = updateBy;
        this.updatedAt = updatedAt;
        this.note = note;
        this.status = status;
        this.rounding = rounding;
        this.storeId = storeId;
        this.holdRef = holdRef;
        this.serie = serie;
        this.correlativo = correlativo;
        this.estadoFacturacion = estadoFacturacion;
        this.fechaFacturacion = fechaFacturacion;
        this.pdfFacturacion = pdfFacturacion;
        this.xmlFacturacion = xmlFacturacion;
        this.cdrFacturacion = cdrFacturacion;
        this.hashFacturacion = hashFacturacion;
        this.text = text;
        this.qr = qr;
        this.mensajeFacturacion = mensajeFacturacion;
        this.externalId = externalId;
        this.ticketResumen = ticketResumen;
        this.externalIdResumen = externalIdResumen;
        this.externalIdAnulacion = externalIdAnulacion;
        this.ticketAnulacion = ticketAnulacion;
        this.xmlAnulacion = xmlAnulacion;
        this.cdrAnulacion = cdrAnulacion;
        this.mensajeAnulacion = mensajeAnulacion;
        this.motivoAnulacion = motivoAnulacion;
        this.fechaAnulacion = fechaAnulacion;
        this.customer = customer;
        this.tipoDocumento = tipoDocumento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getProductDiscount() {
        return productDiscount;
    }

    public void setProductDiscount(BigDecimal productDiscount) {
        this.productDiscount = productDiscount;
    }

    public String getOrderDiscountId() {
        return orderDiscountId;
    }

    public void setOrderDiscountId(String orderDiscountId) {
        this.orderDiscountId = orderDiscountId;
    }

    public BigDecimal getOrderDiscount() {
        return orderDiscount;
    }

    public void setOrderDiscount(BigDecimal orderDiscount) {
        this.orderDiscount = orderDiscount;
    }

    public BigDecimal getTotalDiscount() {
        return totalDiscount;
    }

    public void setTotalDiscount(BigDecimal totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    public BigDecimal getProductTax() {
        return productTax;
    }

    public void setProductTax(BigDecimal productTax) {
        this.productTax = productTax;
    }

    public String getOrderTaxId() {
        return orderTaxId;
    }

    public void setOrderTaxId(String orderTaxId) {
        this.orderTaxId = orderTaxId;
    }

    public BigDecimal getOrderTax() {
        return orderTax;
    }

    public void setOrderTax(BigDecimal orderTax) {
        this.orderTax = orderTax;
    }

    public BigDecimal getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(BigDecimal totalTax) {
        this.totalTax = totalTax;
    }

    public BigDecimal getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(BigDecimal grandTotal) {
        this.grandTotal = grandTotal;
    }

    public Integer getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
    }

    public BigDecimal getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(BigDecimal totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public BigDecimal getPaid() {
        return paid;
    }

    public void setPaid(BigDecimal paid) {
        this.paid = paid;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Integer getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigDecimal getRounding() {
        return rounding;
    }

    public void setRounding(BigDecimal rounding) {
        this.rounding = rounding;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getHoldRef() {
        return holdRef;
    }

    public void setHoldRef(String holdRef) {
        this.holdRef = holdRef;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Integer getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(Integer correlativo) {
        this.correlativo = correlativo;
    }

    public Integer getEstadoFacturacion() {
        return estadoFacturacion;
    }

    public void setEstadoFacturacion(Integer estadoFacturacion) {
        this.estadoFacturacion = estadoFacturacion;
    }

    public Date getFechaFacturacion() {
        return fechaFacturacion;
    }

    public void setFechaFacturacion(Date fechaFacturacion) {
        this.fechaFacturacion = fechaFacturacion;
    }

    public String getPdfFacturacion() {
        return pdfFacturacion;
    }

    public void setPdfFacturacion(String pdfFacturacion) {
        this.pdfFacturacion = pdfFacturacion;
    }

    public String getXmlFacturacion() {
        return xmlFacturacion;
    }

    public void setXmlFacturacion(String xmlFacturacion) {
        this.xmlFacturacion = xmlFacturacion;
    }

    public String getCdrFacturacion() {
        return cdrFacturacion;
    }

    public void setCdrFacturacion(String cdrFacturacion) {
        this.cdrFacturacion = cdrFacturacion;
    }

    public String getHashFacturacion() {
        return hashFacturacion;
    }

    public void setHashFacturacion(String hashFacturacion) {
        this.hashFacturacion = hashFacturacion;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getQr() {
        return qr;
    }

    public void setQr(String qr) {
        this.qr = qr;
    }

    public String getMensajeFacturacion() {
        return mensajeFacturacion;
    }

    public void setMensajeFacturacion(String mensajeFacturacion) {
        this.mensajeFacturacion = mensajeFacturacion;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public String getTicketResumen() {
        return ticketResumen;
    }

    public void setTicketResumen(String ticketResumen) {
        this.ticketResumen = ticketResumen;
    }

    public String getExternalIdResumen() {
        return externalIdResumen;
    }

    public void setExternalIdResumen(String externalIdResumen) {
        this.externalIdResumen = externalIdResumen;
    }

    public String getExternalIdAnulacion() {
        return externalIdAnulacion;
    }

    public void setExternalIdAnulacion(String externalIdAnulacion) {
        this.externalIdAnulacion = externalIdAnulacion;
    }

    public String getTicketAnulacion() {
        return ticketAnulacion;
    }

    public void setTicketAnulacion(String ticketAnulacion) {
        this.ticketAnulacion = ticketAnulacion;
    }

    public String getXmlAnulacion() {
        return xmlAnulacion;
    }

    public void setXmlAnulacion(String xmlAnulacion) {
        this.xmlAnulacion = xmlAnulacion;
    }

    public String getCdrAnulacion() {
        return cdrAnulacion;
    }

    public void setCdrAnulacion(String cdrAnulacion) {
        this.cdrAnulacion = cdrAnulacion;
    }

    public String getMensajeAnulacion() {
        return mensajeAnulacion;
    }

    public void setMensajeAnulacion(String mensajeAnulacion) {
        this.mensajeAnulacion = mensajeAnulacion;
    }

    public String getMotivoAnulacion() {
        return motivoAnulacion;
    }

    public void setMotivoAnulacion(String motivoAnulacion) {
        this.motivoAnulacion = motivoAnulacion;
    }

    public Date getFechaAnulacion() {
        return fechaAnulacion;
    }

    public void setFechaAnulacion(Date fechaAnulacion) {
        this.fechaAnulacion = fechaAnulacion;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    @Override
    public String toString() {
        return "Sales [cdrAnulacion=" + cdrAnulacion + ", cdrFacturacion=" + cdrFacturacion + ", correlativo="
                + correlativo + ", createdBy=" + createdBy + ", customer=" + customer + ", customerName=" + customerName
                + ", date=" + date + ", estadoFacturacion=" + estadoFacturacion + ", externalId=" + externalId
                + ", externalIdAnulacion=" + externalIdAnulacion + ", externalIdResumen=" + externalIdResumen
                + ", fechaAnulacion=" + fechaAnulacion + ", fechaFacturacion=" + fechaFacturacion + ", grandTotal="
                + grandTotal + ", hashFacturacion=" + hashFacturacion + ", holdRef=" + holdRef + ", id=" + id
                + ", mensajeAnulacion=" + mensajeAnulacion + ", mensajeFacturacion=" + mensajeFacturacion
                + ", motivoAnulacion=" + motivoAnulacion + ", note=" + note + ", orderDiscount=" + orderDiscount
                + ", orderDiscountId=" + orderDiscountId + ", orderTax=" + orderTax + ", orderTaxId=" + orderTaxId
                + ", paid=" + paid + ", pdfFacturacion=" + pdfFacturacion + ", productDiscount=" + productDiscount
                + ", productTax=" + productTax + ", qr=" + qr + ", rounding=" + rounding + ", serie=" + serie
                + ", status=" + status + ", storeId=" + storeId + ", text=" + text + ", ticketAnulacion="
                + ticketAnulacion + ", ticketResumen=" + ticketResumen + ", tipoDocumento=" + tipoDocumento + ", total="
                + total + ", totalDiscount=" + totalDiscount + ", totalItems=" + totalItems + ", totalQuantity="
                + totalQuantity + ", totalTax=" + totalTax + ", updateBy=" + updateBy + ", updatedAt=" + updatedAt
                + ", xmlAnulacion=" + xmlAnulacion + ", xmlFacturacion=" + xmlFacturacion + "]";
    }
    
}