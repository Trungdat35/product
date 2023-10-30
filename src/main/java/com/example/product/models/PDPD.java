package com.example.product.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "pdpd")
@Getter
@Setter
public class PDPD {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pdpd_id")
    private int pdpdID;
    @ManyToOne
    @JoinColumn(name = "property_detail_id",referencedColumnName = "property_detail_id",foreignKey = @ForeignKey(name = "fk_pdpd_ppd"))
    private PropertyDetails ppd;
    @ManyToOne
    @JoinColumn(name = "product_id",referencedColumnName = "product_id",foreignKey = @ForeignKey(name = "fk_pdpd_pd"))
    private Products pd;
    @ManyToOne
    @JoinColumn(name = "product_detail_id",referencedColumnName = "product_detail_id",foreignKey = @ForeignKey(name = "fk_pdpd_pdd"))
    private ProductDetail pdd;
}
