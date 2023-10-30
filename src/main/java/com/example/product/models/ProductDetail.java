package com.example.product.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;
@Entity
@Table(name = "product_detail")
@Getter
@Setter
public class ProductDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_detail_id")
    private int productDetailID;
    @Column(name = "product_detail_name")
    private String productDetailName;
    @Column(name = "quantity")
    private int quantity;
    @Column(name = "price")
    private float price;
    @Column(name = "shell_price")
    private float shellPrice;
    @OneToMany(mappedBy = "pdd",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<PDPD> pdpdSet;
    @ManyToOne()
    @JoinColumn(name = "parent_id",foreignKey = @ForeignKey(name = "fk_pdd_pdd"))
    private ProductDetail productDetail;

}
